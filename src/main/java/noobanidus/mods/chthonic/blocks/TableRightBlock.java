package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import noobanidus.libs.noobutil.util.VoxelUtil;

public class TableRightBlock extends HorizontalFacingBlock {
  public TableRightBlock(Properties properties) {
    super(properties);
    initializeVoxel(VoxelUtil.multiOr(Block.makeCuboidShape(0, 13, 0,16, 15, 16), Block.makeCuboidShape(12, 0, 4,15, 1, 7), Block.makeCuboidShape(1, 0, 4,4, 1, 7), Block.makeCuboidShape(1, 1, 4,15, 3, 7), Block.makeCuboidShape(6, 3, 4,10, 13, 7), Block.makeCuboidShape(7, 0, 5,9, 7, 6), Block.makeCuboidShape(7, 0, 5,9, 7, 6), Block.makeCuboidShape(7, 8, 5,9, 15, 6), Block.makeCuboidShape(7, 9, 5,9, 16, 6), Block.makeCuboidShape(7, 7, 4,9, 9, 16), Block.makeCuboidShape(7, 7, 2,9, 9, 4), Block.makeCuboidShape(10, 12, 4,15, 13, 7), Block.makeCuboidShape(1, 12, 4,6, 13, 7)));
  }
}
