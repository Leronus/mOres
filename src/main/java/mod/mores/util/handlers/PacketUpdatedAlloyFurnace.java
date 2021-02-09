package mod.mores.util.handlers;

import io.netty.buffer.ByteBuf;
import mod.mores.objects.blocks.machines.TileEntityAlloyFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketUpdatedAlloyFurnace implements IMessage {

    private BlockPos pos;
    private ItemStack stack;
    private long lastChangeTime;

    public PacketUpdatedAlloyFurnace(BlockPos pos, ItemStack stack, long lastChangeTime) {
        this.pos = pos;
        this.stack = stack;
        this.lastChangeTime = lastChangeTime;
    }

    public PacketUpdatedAlloyFurnace(TileEntityAlloyFurnace te) {
        this(te.getPos(), te.itemStackHandlerInventory.getStackInSlot(0), te.lastChangeTime);
    }

    public PacketUpdatedAlloyFurnace() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = BlockPos.fromLong(buf.readLong());
        stack = ByteBufUtils.readItemStack(buf);
        lastChangeTime = buf.readLong();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeLong(pos.toLong());
        ByteBufUtils.writeItemStack(buf, stack);
        buf.writeLong(lastChangeTime);
    }

    public static class Handler implements IMessageHandler<PacketUpdatedAlloyFurnace, IMessage> {

        @Override
        public IMessage onMessage(PacketUpdatedAlloyFurnace message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(() -> {
                TileEntityAlloyFurnace te = (TileEntityAlloyFurnace) Minecraft.getMinecraft().world.getTileEntity(message.pos);
                te.itemStackHandlerInventory.setStackInSlot(0, message.stack);
                te.lastChangeTime = message.lastChangeTime;
            });
            return null;
        }

    }
}
