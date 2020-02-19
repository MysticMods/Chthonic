package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class EmptyBookshelfBlock extends HorizontalFacingBlock {
  protected final static VoxelShape SHAPE = Block.makeCuboidShape(0, 0, 0, 16, 16, 16);

  public EmptyBookshelfBlock(Properties properties) {
    super(properties);
  }

  @Override
  public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
    return 0.5f;
  }

  @Override
  public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    return SHAPE;
  }
}
