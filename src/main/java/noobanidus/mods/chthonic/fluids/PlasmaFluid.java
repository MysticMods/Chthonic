package noobanidus.mods.chthonic.fluids;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import java.util.Random;

public abstract class PlasmaFluid extends ForgeFlowingFluid {
  protected PlasmaFluid(Properties properties) {
    super(properties);
  }

  @Override
  protected void beforeReplacingBlock(IWorld iWorld, BlockPos pos, BlockState state) {
  }

  @Override
  protected boolean canDisplace(IFluidState fluidstate, IBlockReader reader, BlockPos pos, Fluid fluid, Direction direction) {
    return fluidstate.getActualHeight(reader, pos) >= 0.44444445F && fluid.isIn(FluidTags.WATER);
  }

  @Override
  public int getTickRate(IWorldReader reader) {
    return 30;
  }

  @Override
  protected void animateTick(World worldIn, BlockPos pos, IFluidState state, Random random) {
    super.animateTick(worldIn, pos, state, random);
    // TODO: Test this?
  }
}
