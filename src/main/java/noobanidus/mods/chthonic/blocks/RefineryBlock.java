package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import noobanidus.libs.noobutil.util.VoxelUtil;

@SuppressWarnings({"NullableProblems", "deprecation"})
public class RefineryBlock extends HorizontalFacingBlock {
  public RefineryBlock(Properties properties) {
    super(properties);
    initializeVoxel(VoxelUtil.multiOr(Block.makeCuboidShape(6, 2, 15,9, 5, 16), Block.makeCuboidShape(6, 2, 11,9, 5, 12), Block.makeCuboidShape(6, 1, 12,9, 2, 15), Block.makeCuboidShape(6, 6, 12,9, 8, 15), Block.makeCuboidShape(6, 5, 12,9, 6, 15), Block.makeCuboidShape(5, 2, 12,6, 5, 15), Block.makeCuboidShape(9, 2, 12,10, 5, 15), Block.makeCuboidShape(12, 2, 15,15, 5, 16), Block.makeCuboidShape(12, 2, 11,15, 5, 12), Block.makeCuboidShape(12, 1, 12,15, 2, 15), Block.makeCuboidShape(12, 6, 12,15, 8, 15), Block.makeCuboidShape(12, 5, 12,15, 6, 15), Block.makeCuboidShape(11, 2, 12,12, 5, 15), Block.makeCuboidShape(15, 2, 12,16, 5, 15), Block.makeCuboidShape(12, 2, 9,15, 5, 10), Block.makeCuboidShape(12, 2, 5,15, 5, 6), Block.makeCuboidShape(12, 1, 6,15, 2, 9), Block.makeCuboidShape(12, 6, 6,15, 8, 9), Block.makeCuboidShape(12, 5, 6,15, 6, 9), Block.makeCuboidShape(11, 2, 6,12, 5, 9), Block.makeCuboidShape(15, 2, 6,16, 5, 9), Block.makeCuboidShape(9, 0, 9,10, 6, 10), Block.makeCuboidShape(9, 5, 5,10, 6, 9), Block.makeCuboidShape(5, 5, 9,9, 6, 10), Block.makeCuboidShape(5, 5, 4,9, 6, 5), Block.makeCuboidShape(4, 5, 5,5, 6, 9), Block.makeCuboidShape(4, 0, 9,5, 6, 10), Block.makeCuboidShape(9, 0, 4,10, 6, 5), Block.makeCuboidShape(4, 0, 4,5, 6, 5), Block.makeCuboidShape(13, 8, 7,14, 9, 8), Block.makeCuboidShape(13, 9, 7,14, 10, 13), Block.makeCuboidShape(13, 8, 13,14, 9, 14), Block.makeCuboidShape(7, 8, 13,8, 9, 14), Block.makeCuboidShape(7, 9, 13,14, 10, 14), Block.makeCuboidShape(9, 6, 4,10, 12, 5), Block.makeCuboidShape(9, 6, 9,10, 12, 10), Block.makeCuboidShape(4, 6, 9,5, 12, 10), Block.makeCuboidShape(4, 6, 4,5, 12, 5), Block.makeCuboidShape(4, 11, 5,5, 12, 9), Block.makeCuboidShape(4, 6, 5,5, 7, 9), Block.makeCuboidShape(9, 6, 5,10, 7, 9), Block.makeCuboidShape(9, 11, 5,10, 12, 9), Block.makeCuboidShape(5, 6, 4,9, 7, 5), Block.makeCuboidShape(5, 7, 4,9, 11, 5), Block.makeCuboidShape(5, 7, 9,9, 11, 10), Block.makeCuboidShape(4, 7, 5,5, 11, 9), Block.makeCuboidShape(9, 7, 5,10, 11, 9), Block.makeCuboidShape(5, 11, 4,9, 12, 5), Block.makeCuboidShape(5, 6, 9,9, 7, 10), Block.makeCuboidShape(5, 11, 9,9, 12, 10), Block.makeCuboidShape(6, 0, 6,8, 4, 8), Block.makeCuboidShape(5, 0, 5,9, 1, 9), Block.makeCuboidShape(11, 0, 5,16, 1, 10), Block.makeCuboidShape(11, 0, 11,16, 1, 16), Block.makeCuboidShape(5, 0, 11,10, 1, 16), Block.makeCuboidShape(5, 5, 5,9, 6, 9), Block.makeCuboidShape(5, 11, 5,9, 12, 9), Block.makeCuboidShape(6, 12, 6,8, 13, 8), Block.makeCuboidShape(7, 13, 7,8, 14, 8), Block.makeCuboidShape(6, 13, 6,7, 14, 9), Block.makeCuboidShape(6, 13, 9,7, 15, 10), Block.makeCuboidShape(7, 13, 6,13, 14, 7), Block.makeCuboidShape(13, 13, 6,14, 14, 14), Block.makeCuboidShape(13, 10, 13,14, 13, 14)));
  }

  @Override
  public BlockRenderLayer getRenderLayer() {
    return BlockRenderLayer.TRANSLUCENT;
  }
}

