package noobanidus.mods.chthonic.init;

import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ModBlocks {
  public static final NonNullUnaryOperator<Block.Properties> STONE_PROPS = (o) -> o.hardnessAndResistance(3f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).lightValue(15);

  public static void load() {

  }
}
