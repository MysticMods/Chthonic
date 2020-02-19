package noobanidus.mods.chthonic.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.chthonic.init.ModParticles;

import java.util.Random;
import java.util.function.Supplier;

public class PlasmaLiquidBlock extends FlowingFluidBlock {
  public PlasmaLiquidBlock(Supplier<? extends FlowingFluid> supplier, Properties properties) {
    super(supplier, properties);
  }

  @Override
  @OnlyIn(Dist.CLIENT)
  public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
    if (rand.nextInt(60) == 0) {
      worldIn.addParticle(ModParticles.PLASMA.get(), pos.getX() + rand.nextFloat(), pos.getY() + 1.3, pos.getZ() + rand.nextFloat(), 0.0D, -0.4D, 0.0D);
    }
  }
}
