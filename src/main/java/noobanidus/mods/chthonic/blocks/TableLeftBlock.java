package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import noobanidus.libs.noobutil.util.VoxelUtil;

public class TableLeftBlock extends HorizontalFacingBlock {
  public TableLeftBlock(Properties properties) {
    super(properties);
    initializeVoxel(VoxelUtil.multiOr(Block.makeCuboidShape(0, 13, 0,16, 15, 16), Block.makeCuboidShape(12, 0, 9,15, 1, 12), Block.makeCuboidShape(1, 0, 9,4, 1, 12), Block.makeCuboidShape(1, 1, 9,15, 3, 12), Block.makeCuboidShape(6, 3, 9,10, 13, 12), Block.makeCuboidShape(7, 0, 10,9, 7, 11), Block.makeCuboidShape(7, 0, 10,9, 7, 11), Block.makeCuboidShape(7, 8, 10,9, 15, 11), Block.makeCuboidShape(7, 9, 10,9, 16, 11), Block.makeCuboidShape(7, 7, 0,9, 9, 12), Block.makeCuboidShape(7, 7, 12,9, 9, 14), Block.makeCuboidShape(10, 12, 9,15, 13, 12), Block.makeCuboidShape(1, 12, 9,6, 13, 12)));
  }
}
