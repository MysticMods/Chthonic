package noobanidus.mods.chthonic.init;

import com.tterrag.registrate.util.RegistryEntry;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import noobanidus.mods.chthonic.Chthonic;
import noobanidus.mods.chthonic.fluids.PlasmaFluid;
import noobanidus.mods.chthonic.blocks.PlasmaLiquidBlock;

import static noobanidus.mods.chthonic.Chthonic.REGISTRATE;

public class ModFluids {
  public static final RegistryEntry<ForgeFlowingFluid.Flowing> PLASMA_STILL = REGISTRATE.object("plasma").fluid("plasma", new ResourceLocation(Chthonic.MODID, "fluids/plasma_still"), new ResourceLocation(Chthonic.MODID, "fluids/plasma_flow")).attributes((builder) -> builder.color(0xFF008080).viscosity(750).luminosity(15)).source(PlasmaFluid.Source::new).properties(o -> o.renderLayer(BlockRenderLayer.SOLID)).bucket().model((c, p) -> {}).properties(ModItems.ITEM_PROPERTIES).build().block(PlasmaLiquidBlock::new).properties(o -> o.lightValue(15)).build().register();

  /*  public static final RegistryEntry<ForgeFlowingFluid.Flowing> PLASMA_FLOWING = REGISTRATE.object("plasma_flowing").fluid("plasma_flowing").attributes(plasmaNonNullBuilder)*//*.properties(plasmaProperties)*//*.source(PlasmaFluid.Flowing::new).register();*/

  public static void load() {
  }
}
