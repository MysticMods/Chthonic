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

@SuppressWarnings({"NullableProblems", "deprecation"})
public class BonePileBlock extends Block {
  private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

  private static VoxelShape BONE_PILE_NORTH = VoxelUtil.multiOr(Block.makeCuboidShape(4, 0, 4,12, 7, 5), Block.makeCuboidShape(4, 0, 5,12, 1, 12), Block.makeCuboidShape(6, 7, 4,10, 8, 5), Block.makeCuboidShape(6, 5, 11,10, 6, 12), Block.makeCuboidShape(5, 4, 11,11, 5, 12), Block.makeCuboidShape(5, 1, 11,11, 2, 12), Block.makeCuboidShape(7, 2, 11,9, 4, 12), Block.makeCuboidShape(4, 1, 5,5, 4, 12), Block.makeCuboidShape(11, 1, 5,12, 4, 12), Block.makeCuboidShape(7, 4, 10,9, 9, 11), Block.makeCuboidShape(9, 8, 10,12, 9, 11), Block.makeCuboidShape(9, 8, 7,11, 9, 8), Block.makeCuboidShape(5, 8, 7,7, 9, 8), Block.makeCuboidShape(10, 6, 7,11, 7, 8), Block.makeCuboidShape(5, 6, 7,6, 7, 8), Block.makeCuboidShape(11, 8, 7,12, 9, 10), Block.makeCuboidShape(4, 8, 7,5, 9, 10), Block.makeCuboidShape(11, 6, 7,12, 7, 10), Block.makeCuboidShape(4, 6, 7,5, 7, 10), Block.makeCuboidShape(11, 4, 8,12, 5, 10), Block.makeCuboidShape(4, 4, 8,5, 5, 10), Block.makeCuboidShape(9, 6, 10,12, 7, 11), Block.makeCuboidShape(9, 4, 10,12, 5, 11), Block.makeCuboidShape(4, 8, 10,7, 9, 11), Block.makeCuboidShape(4, 4, 10,7, 5, 11), Block.makeCuboidShape(4, 6, 10,7, 7, 11));
  private static VoxelShape BONE_PILE_EAST = VoxelUtil.rotate(BONE_PILE_NORTH, Rotation.CLOCKWISE_90);
  private static VoxelShape BONE_PILE_SOUTH = VoxelUtil.rotate(BONE_PILE_EAST, Rotation.CLOCKWISE_90);
  private static VoxelShape BONE_PILE_WEST = VoxelUtil.rotate(BONE_PILE_SOUTH, Rotation.CLOCKWISE_90);
  private static VoxelShape SLIM_SLAB = Block.makeCuboidShape(1, 0, 1, 15, 6, 15);

  private PileType type;

  public BonePileBlock(Properties properties, PileType type) {
    super(properties);
    this.type = type;
  }

  @Override
  public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    switch (type) {
      case PILE1:
        switch (state.get(FACING)) {
          case NORTH:
            return BONE_PILE_NORTH;
          case SOUTH:
            return BONE_PILE_SOUTH;
          case EAST:
            return BONE_PILE_EAST;
          case WEST:
            return BONE_PILE_WEST;
        }
      default:
      case PILE2:
      case PILE3:
      case PILE4:
        return SLIM_SLAB;
    }
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

  public enum PileType {
    PILE1, PILE2, PILE3, PILE4
  }
}
