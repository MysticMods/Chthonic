package noobanidus.mods.chthonic.init;

import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.item.Item;
import noobanidus.mods.chthonic.Chthonic;

public class ModItems {
  public static final NonNullUnaryOperator<Item.Properties> ITEM_PROPERTIES = (o) -> o.group(Chthonic.ITEM_GROUP);

  /*  public static final RegistryEntry<PlasmaBucket> PLASMA_BUCKET = REGISTRATE.item("plasma_bucket", PlasmaBucket::new).properties(ITEM_PROPERTIES).register();*/

  public static void load() {
  }
}
