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
public class LampBlock extends HorizontalFacingBlock {
  public LampBlock(Properties properties) {
    super(properties);
    initializeVoxel(VoxelUtil.multiOr(Block.makeCuboidShape(6, 7, 6,10, 8, 10), Block.makeCuboidShape(6, 10, 6,10, 11, 10), Block.makeCuboidShape(7, 8, 7,9, 10, 9), Block.makeCuboidShape(7, 0, 7,9, 4, 9), Block.makeCuboidShape(3, 4, 7,4, 14, 9), Block.makeCuboidShape(12, 4, 7,13, 14, 9), Block.makeCuboidShape(7, 5, 7,9, 7, 9), Block.makeCuboidShape(4, 13, 7,12, 14, 9), Block.makeCuboidShape(4, 4, 7,12, 5, 9)));
  }
}

