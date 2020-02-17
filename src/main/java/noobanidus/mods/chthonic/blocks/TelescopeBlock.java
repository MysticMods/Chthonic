package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import noobanidus.libs.noobutil.util.VoxelUtil;

public class TelescopeBlock extends Block {
  private static VoxelShape NORTH = VoxelUtil.multiOr(Block.makeCuboidShape(6, 13, 0,10, 17, 12), Block.makeCuboidShape(7, 14, -4,9, 16, 0), Block.makeCuboidShape(6, 14, -3,7, 18, -2), Block.makeCuboidShape(4, 0, 4,12, 10, 12));

  public TelescopeBlock(Properties properties) {
    super(properties);
  }

  @Override
  public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    return NORTH;
  }
}
