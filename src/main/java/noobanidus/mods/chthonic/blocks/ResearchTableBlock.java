package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import noobanidus.libs.noobutil.util.VoxelUtil;

public class ResearchTableBlock extends HorizontalFacingBlock {
  public ResearchTableBlock(Properties properties) {
    super(properties);
    initializeVoxel(VoxelUtil.multiOr(Block.makeCuboidShape(2, 8, 0,4, 14, 5), Block.makeCuboidShape(8, 7, 2,13, 9, 7), Block.makeCuboidShape(9, 9, 1,13, 11, 5), Block.makeCuboidShape(1, 7, 1,5, 8, 4), Block.makeCuboidShape(15, 3, 0,16, 14, 16), Block.makeCuboidShape(0, 3, 0,1, 14, 16), Block.makeCuboidShape(1, 3, 0,15, 4, 16), Block.makeCuboidShape(1, 6, 1,15, 7, 15), Block.makeCuboidShape(1, 14, 1,15, 15, 12), Block.makeCuboidShape(0, 0, 0,1, 3, 1), Block.makeCuboidShape(0, 0, 15,1, 3, 16), Block.makeCuboidShape(15, 0, 15,16, 3, 16), Block.makeCuboidShape(15, 0, 0,16, 3, 1), Block.makeCuboidShape(0, 0, 1,1, 1, 15), Block.makeCuboidShape(15, 0, 1,16, 1, 15), Block.makeCuboidShape(1, 14, 0,15, 15, 1), Block.makeCuboidShape(1, 14, 12,15, 15, 16), Block.makeCuboidShape(0, 14, 0,1, 15, 16), Block.makeCuboidShape(15, 14, 0,16, 15, 16), Block.makeCuboidShape(0, 15, 13,1, 17, 16), Block.makeCuboidShape(2, 18, 13,5, 19, 16), Block.makeCuboidShape(3, 17, 12,4, 19, 13), Block.makeCuboidShape(2, 19, 15,5, 21, 16), Block.makeCuboidShape(2, 19, 13,3, 21, 15), Block.makeCuboidShape(4, 19, 13,5, 20, 15), Block.makeCuboidShape(3, 15, 12,4, 16, 13), Block.makeCuboidShape(5, 18, 13,6, 19, 14), Block.makeCuboidShape(3, 19, 13,4, 20, 14), Block.makeCuboidShape(3, 20, 14,4, 21, 15), Block.makeCuboidShape(4, 8, 14,5, 9, 15), Block.makeCuboidShape(8, 8, 14,9, 9, 15), Block.makeCuboidShape(15, 15, 13,16, 17, 16), Block.makeCuboidShape(0, 17, 13,16, 18, 16), Block.makeCuboidShape(11, 19, 13,14, 22, 16), Block.makeCuboidShape(12, 18, 14,13, 19, 15), Block.makeCuboidShape(3, 7, 8,6, 10, 14), Block.makeCuboidShape(7, 7, 8,10, 10, 14)));
  }
}
