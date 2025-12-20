package mod.leronus.mores.entity.custom;

import mod.leronus.mores.entity.ModEntityTypes;
import mod.leronus.mores.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.Vec3;

public class DuckEntity extends Animal {

    private static final Ingredient FOOD_ITEMS =
            Ingredient.of(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS);

    public float flap;
    public float flapSpeed;
    public float oFlapSpeed;
    public float oFlap;
    public float flapping = 1.0F;
    private float nextFlap = 1.0F;

    public int eggTime = this.random.nextInt(6000) + 6000;

    // NBT-backed flag
    private boolean duckJockey;

    public DuckEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
        // 1.20.6 uses PathType (BlockPathTypes was renamed)
        this.setPathfindingMalus(PathType.WATER, 0.0F);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }

    /**
     * IMPORTANT (Forge 50.2.0 / 1.20.6):
     * You MUST include FOLLOW_RANGE, otherwise the mob will crash during navigation creation.
     */
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 4.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.FOLLOW_RANGE, 16.0D);
    }

    @Override
    public void aiStep() {
        super.aiStep();

        // flap logic (same pattern as Chicken)
        this.oFlap = this.flap;
        this.oFlapSpeed = this.flapSpeed;

        this.flapSpeed += (this.onGround() ? -1.0F : 4.0F) * 0.3F;
        this.flapSpeed = Mth.clamp(this.flapSpeed, 0.0F, 1.0F);

        if (!this.onGround() && this.flapping < 1.0F) {
            this.flapping = 1.0F;
        }

        this.flapping *= 0.9F;

        Vec3 motion = this.getDeltaMovement();
        if (!this.onGround() && motion.y < 0.0D) {
            this.setDeltaMovement(motion.multiply(1.0D, 0.6D, 1.0D));
        }

        this.flap += this.flapping * 2.0F;

        // egg / drop timer (you used gold nuggets)
        if (!this.level().isClientSide
                && this.isAlive()
                && !this.isBaby()
                && !this.isDuckJockey()
                && --this.eggTime <= 0) {

            this.playSound(
                    SoundEvents.CHICKEN_EGG,
                    1.0F,
                    (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F
            );

            this.spawnAtLocation(Items.GOLD_NUGGET);
            this.gameEvent(GameEvent.ENTITY_PLACE);

            this.eggTime = this.random.nextInt(8000) + 6000;
        }
    }

    @Override
    protected boolean isFlapping() {
        return this.flyDist > this.nextFlap;
    }

    @Override
    protected void onFlap() {
        this.nextFlap = this.flyDist + this.flapSpeed / 2.0F;
    }

    @Override
    public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.LIVING_DUCK_SOUND.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return ModSounds.HURT_DUCK_SOUND.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.DYING_DUCK_SOUND.get();
    }

    // lower volume like you wanted
    @Override
    public void playAmbientSound() {
        SoundEvent sound = this.getAmbientSound();
        if (sound != null) {
            this.playSound(sound, 0.15F, this.getVoicePitch());
        }
    }

    @Override
    protected void playHurtSound(DamageSource damageSource) {
        SoundEvent sound = this.getHurtSound(damageSource);
        if (sound != null) {
            this.playSound(sound, 0.55F, this.getVoicePitch());
        }
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState block) {
        this.playSound(SoundEvents.CHICKEN_STEP, 0.15F, 1.0F);
    }

    @Override
    public DuckEntity getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntityTypes.DUCK.get().create(level);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return FOOD_ITEMS.test(stack);
    }

    @Override
    public int getExperienceReward() {
        return this.isDuckJockey() ? 10 : super.getExperienceReward();
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);

        this.duckJockey = tag.getBoolean("IsDuckJockey");
        if (tag.contains("EggLayTime")) {
            this.eggTime = tag.getInt("EggLayTime");
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);

        tag.putBoolean("IsDuckJockey", this.duckJockey);
        tag.putInt("EggLayTime", this.eggTime);
    }

    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return this.isDuckJockey();
    }

    @Override
    protected void positionRider(Entity rider, Entity.MoveFunction move) {
        super.positionRider(rider, move);
        if (rider instanceof LivingEntity living) {
            living.yBodyRot = this.yBodyRot;
        }
    }

    public boolean isDuckJockey() {
        return this.duckJockey;
    }

    public void setDuckJockey(boolean isDuckJockey) {
        this.duckJockey = isDuckJockey;
    }
}
