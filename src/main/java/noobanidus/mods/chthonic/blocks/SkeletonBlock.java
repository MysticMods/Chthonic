package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

@SuppressWarnings("deprecation")
public class SkeletonBlock extends HorizontalFacingBlock{
  private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

  private static VoxelShape NORTH = Block.makeCuboidShape(1, 0, 0, 15, 8, 16);
  private static VoxelShape EAST = Block.makeCuboidShape(0, 0, 1, 16, 8, 15);

  public SkeletonBlock(Properties properties) {
    super(properties);
  }

  @Override
  public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    switch (state.get(FACING)) {
      case EAST:
      case WEST:
        return EAST;
      case NORTH:
      case SOUTH:
      default:
        return NORTH;
    }
  }
}
