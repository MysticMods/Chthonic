package noobanidus.mods.chthonic.items;

import net.minecraft.item.BucketItem;
import noobanidus.mods.chthonic.init.ModFluids;

public class PlasmaBucket extends BucketItem {
  public PlasmaBucket(Properties builder) {
    super(ModFluids.PLASMA_STILL, builder);
  }
}
