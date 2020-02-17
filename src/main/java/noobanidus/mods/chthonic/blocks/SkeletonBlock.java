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
public class SkeletonBlock extends Block {
  private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

  private final SkeletonType type;

  private static VoxelShape NORTH = Block.makeCuboidShape(1, 0, 0, 15, 8, 16);
  private static VoxelShape EAST = Block.makeCuboidShape(0, 0, 1, 16, 8, 15);

  public SkeletonBlock(Properties properties, SkeletonType type) {
    super(properties);
    this.type = type;
  }

  @Override
  public BlockRenderType getRenderType(BlockState state) {
    return BlockRenderType.MODEL;
  }

  @Override
  public BlockState getStateForPlacement(BlockItemUseContext context) {
    return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
  }

  @Override
  public BlockState rotate(BlockState state, Rotation rot) {
    return state.with(FACING, rot.rotate(state.get(FACING)));
  }

  @Override
  public BlockState mirror(BlockState state, Mirror mirrorIn) {
    return state.rotate(mirrorIn.toRotation(state.get(FACING)));
  }

  @Override
  protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
    builder.add(FACING);
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

  public enum SkeletonType {
    LOW1, LOW2, LOW3, TOP1, TOP2, TOP3, TOP4
  }
}
