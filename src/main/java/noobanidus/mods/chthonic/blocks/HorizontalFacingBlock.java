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
import noobanidus.libs.noobutil.util.VoxelUtil;

@SuppressWarnings("deprecation")
public class HorizontalFacingBlock extends Block {
  protected final static VoxelShape SHAPE = Block.makeCuboidShape(5, 2, 5, 11, 8, 11);
  public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

  protected VoxelShape NORTH;
  protected VoxelShape EAST;
  protected VoxelShape SOUTH;
  protected VoxelShape WEST;

  protected void initializeVoxel (VoxelShape north) {
    NORTH = north;
    EAST = VoxelUtil.rotate(NORTH, Rotation.CLOCKWISE_90);
    SOUTH = VoxelUtil.rotate(EAST, Rotation.CLOCKWISE_90);
    WEST = VoxelUtil.rotate(SOUTH, Rotation.CLOCKWISE_90);
  }

  public HorizontalFacingBlock(Properties properties) {
    super(properties);
  }

  @Override
  public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    if (NORTH != null) {
      switch (state.get(FACING)) {
        case NORTH:
          return NORTH;
        case SOUTH:
          return SOUTH;
        case EAST:
          return EAST;
        case WEST:
          return WEST;
      }
    }

    return SHAPE;
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

}
