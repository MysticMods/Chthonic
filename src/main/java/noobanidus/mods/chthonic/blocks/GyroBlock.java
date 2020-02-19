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
public class GyroBlock extends HorizontalFacingBlock {
  public GyroBlock(Properties properties) {
    super(properties);
    initializeVoxel(VoxelUtil.multiOr(Block.makeCuboidShape(6, 8, 6,10, 12, 10), Block.makeCuboidShape(4, 6, 7,12, 7, 9), Block.makeCuboidShape(4, 13, 7,12, 14, 9), Block.makeCuboidShape(7, 15, 3,9, 16, 13), Block.makeCuboidShape(7, 1, 7,9, 4, 9), Block.makeCuboidShape(5, 0, 5,11, 1, 11), Block.makeCuboidShape(7, 7, 7,9, 9, 9), Block.makeCuboidShape(7, 14, 7,9, 15, 9), Block.makeCuboidShape(7, 4, 3,9, 5, 13), Block.makeCuboidShape(11, 7, 7,12, 13, 9), Block.makeCuboidShape(7, 4, 13,9, 16, 14), Block.makeCuboidShape(7, 4, 2,9, 16, 3), Block.makeCuboidShape(4, 7, 7,5, 13, 9)));
  }
}

