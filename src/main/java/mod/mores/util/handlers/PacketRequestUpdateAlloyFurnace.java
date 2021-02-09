package mod.mores.util.handlers;

import io.netty.buffer.ByteBuf;
import mod.mores.objects.blocks.machines.TileEntityAlloyFurnace;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketRequestUpdateAlloyFurnace implements IMessage {


    private BlockPos pos;
    private int dimension;

    public PacketRequestUpdateAlloyFurnace(BlockPos pos, int dimension) {
        this.pos = pos;
        this.dimension = dimension;
    }

    public PacketRequestUpdateAlloyFurnace(TileEntityAlloyFurnace te) {
        this(te.getPos(), te.getWorld().provider.getDimension());
    }

    public PacketRequestUpdateAlloyFurnace() {
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeLong(pos.toLong());
        buf.writeInt(dimension);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        pos = BlockPos.fromLong(buf.readLong());
        dimension = buf.readInt();
    }

    public static class Handler implements IMessageHandler<PacketRequestUpdateAlloyFurnace, PacketUpdatedAlloyFurnace> {

        @Override
        public PacketUpdatedAlloyFurnace onMessage(PacketRequestUpdateAlloyFurnace message, MessageContext ctx) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(message.dimension);
            TileEntityAlloyFurnace te = (TileEntityAlloyFurnace)world.getTileEntity(message.pos);
            if (te != null) {
                return new PacketUpdatedAlloyFurnace(te);
            } else {
                return null;
            }
        }

    }
}
