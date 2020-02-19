package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;

public class BookPaneBlock extends HorizontalFacingBlock {
  public BookPaneBlock(Properties properties) {
    super(properties);
    initializeVoxel(Block.makeCuboidShape(0, 0, 12, 16, 16, 16));
  }
}
