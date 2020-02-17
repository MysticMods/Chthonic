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

@SuppressWarnings("NullableProblems")
public class BonePileBlock extends Block {
  private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

  private static VoxelShape BONE_PILE_1 = VoxelUtil.multiOr(Block.makeCuboidShape(9, 0, 5, 11, 12, 7), Block.makeCuboidShape(5, 0, 5, 7, 12, 7), Block.makeCuboidShape(4, 0, 4, 12, 7, 5), Block.makeCuboidShape(4, 0, 5, 12, 1, 12), Block.makeCuboidShape(6, 7, 4, 10, 8, 5), Block.makeCuboidShape(6, 5, 11, 10, 6, 12), Block.makeCuboidShape(5, 4, 11, 11, 5, 12), Block.makeCuboidShape(5, 1, 11, 11, 2, 12), Block.makeCuboidShape(7, 2, 11, 9, 4, 12), Block.makeCuboidShape(4, 1, 5, 5, 4, 12), Block.makeCuboidShape(11, 1, 5, 12, 4, 12), Block.makeCuboidShape(7, 4, 10, 9, 9, 11), Block.makeCuboidShape(9, 8, 10, 12, 9, 11), Block.makeCuboidShape(9, 8, 7, 11, 9, 8), Block.makeCuboidShape(5, 8, 7, 7, 9, 8), Block.makeCuboidShape(10, 6, 7, 11, 7, 8), Block.makeCuboidShape(5, 6, 7, 6, 7, 8), Block.makeCuboidShape(11, 8, 7, 12, 9, 10), Block.makeCuboidShape(4, 8, 7, 5, 9, 10), Block.makeCuboidShape(11, 6, 7, 12, 7, 10), Block.makeCuboidShape(4, 6, 7, 5, 7, 10), Block.makeCuboidShape(11, 4, 8, 12, 5, 10), Block.makeCuboidShape(4, 4, 8, 5, 5, 10), Block.makeCuboidShape(9, 6, 10, 12, 7, 11), Block.makeCuboidShape(9, 4, 10, 12, 5, 11), Block.makeCuboidShape(4, 8, 10, 7, 9, 11), Block.makeCuboidShape(4, 4, 10, 7, 5, 11), Block.makeCuboidShape(4, 6, 10, 7, 7, 11), Block.makeCuboidShape(12, 9, 7, 14, 10, 9));
  private static VoxelShape BONE_PILE_2 = VoxelUtil.multiOr(Block.makeCuboidShape(-2, 0, 8, 10, 2, 10), Block.makeCuboidShape(6, 0, 2, 8, 2, 14), Block.makeCuboidShape(10, 2, 2, 12, 4, 14), Block.makeCuboidShape(10, 0, 0, 12, 2, 12), Block.makeCuboidShape(3, 0, 4, 5, 1, 6));
  private static VoxelShape BONE_PILE_3 = VoxelUtil.multiOr(Block.makeCuboidShape(3, 0, 2, 5, 2, 14), Block.makeCuboidShape(3, 7, 6, 4, 8, 7), Block.makeCuboidShape(6, 4, 14, 7, 7, 15), Block.makeCuboidShape(2, 5, 6, 3, 8, 7), Block.makeCuboidShape(6, 3, 14, 9, 4, 15), Block.makeCuboidShape(6, 0, 4, 9, 1, 5), Block.makeCuboidShape(2, 4, 6, 5, 5, 7), Block.makeCuboidShape(10, 0, 1, 12, 2, 5), Block.makeCuboidShape(11, 0, 8, 12, 1, 9), Block.makeCuboidShape(13, 0, 9, 14, 1, 10), Block.makeCuboidShape(13, 0, 14, 14, 1, 15), Block.makeCuboidShape(11, 1, 8, 12, 2, 9), Block.makeCuboidShape(10, 0, 5, 11, 1, 7), Block.makeCuboidShape(11, 0, 5, 12, 1, 6), Block.makeCuboidShape(11, 0, 9, 13, 2, 13));
  private static VoxelShape BONE_PILE_4 = VoxelUtil.multiOr(Block.makeCuboidShape(16, 0, 1, 18, 2, 13), Block.makeCuboidShape(1, -2, 13, 9, 5, 14), Block.makeCuboidShape(1, 4, 6, 9, 5, 13), Block.makeCuboidShape(3, -3, 13, 7, -2, 14), Block.makeCuboidShape(4, 0, 0, 10, 1, 1), Block.makeCuboidShape(9, 0, 1, 10, 1, 4), Block.makeCuboidShape(3, 0, 2, 5, 1, 4), Block.makeCuboidShape(9, 1, 3, 10, 3, 5), Block.makeCuboidShape(5, 1, 0, 9, 2, 1), Block.makeCuboidShape(3, -1, 6, 7, 0, 7), Block.makeCuboidShape(2, 0, 6, 8, 1, 7), Block.makeCuboidShape(2, 3, 6, 8, 4, 7), Block.makeCuboidShape(4, 1, 6, 6, 3, 7), Block.makeCuboidShape(1, 1, 6, 2, 4, 13), Block.makeCuboidShape(8, 1, 6, 9, 4, 13));

  private PileType type;

  public BonePileBlock(Properties properties, PileType type) {
    super(properties);
    this.type = type;
  }

  @Override
  public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    switch (type) {
      case PILE1:
        return BONE_PILE_1;
      case PILE2:
        return BONE_PILE_2;
      case PILE3:
        return BONE_PILE_3;
      default:
      case PILE4:
        return BONE_PILE_4;
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
