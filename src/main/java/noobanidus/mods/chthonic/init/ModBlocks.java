package noobanidus.mods.chthonic.init;

import com.tterrag.registrate.util.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.ToolType;
import noobanidus.mods.chthonic.Chthonic;
import noobanidus.mods.chthonic.blocks.TelescopeBlock;
import noobanidus.mods.chthonic.blocks.FacingTempBlock;
import noobanidus.mods.chthonic.blocks.OmniFacingTempBlock;

import java.util.ArrayList;
import java.util.List;

import static noobanidus.mods.chthonic.Chthonic.REGISTRATE;

public class ModBlocks {
  public static final NonNullUnaryOperator<Block.Properties> STONE_PROPS = (o) -> o.hardnessAndResistance(3f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE);

  private static List<RegistryEntry<OmniFacingTempBlock>> TEMP_BLOCKS = new ArrayList<>();
  private static List<RegistryEntry<FacingTempBlock>> FACING_TEMP_BLOCKS = new ArrayList<>();

  public static RegistryEntry<TelescopeBlock> TELESCOPE = REGISTRATE.block("telescope", TelescopeBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> {}).item().model((ctx, p) -> {}).build().register();

  static {
    for (int i = 0; i < 50; i++) {
      int index = i + 1;
      TEMP_BLOCKS.add(REGISTRATE.block("omni_temp" + index, OmniFacingTempBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
          .modelFile(p.withExistingParent("omni_temp" + index, new ResourceLocation(Chthonic.MODID, "block/cube")))
          .build())).item().model((ctx, p) -> {
        p.withExistingParent("omni_temp" + index, new ResourceLocation(Chthonic.MODID, "block/omni_temp" + index));
      }).build().register());
      FACING_TEMP_BLOCKS.add(REGISTRATE.block("facing_temp" + index, FacingTempBlock::new).blockstate((ctx, p) -> {
        ModelFile model = p.withExistingParent("facing_temp" + index, new ResourceLocation(Chthonic.MODID, "block/cube"));
        p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
            .modelFile(model)
            .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
            .build());
      }).properties(STONE_PROPS).item().model((ctx, p) -> {
        p.withExistingParent("facing_temp" + index, new ResourceLocation(Chthonic.MODID, "block/facing_temp" + index));
      }).build().register());
    }
  }

  public static void load() {

  }
}
