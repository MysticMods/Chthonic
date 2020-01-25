package noobanidus.mods.chthonic;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public class ChthonicTags {
  public static class Items extends ChthonicTags {
    static Tag<Item> tag(String modid, String name) {
      return tag(ItemTags.Wrapper::new, modid, name);
    }

    static Tag<Item> modTag(String name) {
      return tag(Chthonic.MODID, name);
    }

    static Tag<Item> compatTag(String name) {
      return tag("forge", name);
    }
  }

  static <T extends Tag<?>> T tag(Function<ResourceLocation, T> creator, String modid, String name) {
    return creator.apply(new ResourceLocation(modid, name));
  }

  static <T extends Tag<?>> T modTag(Function<ResourceLocation, T> creator, String name) {
    return tag(creator, Chthonic.MODID, name);
  }

  static <T extends Tag<?>> T compatTag(Function<ResourceLocation, T> creator, String name) {
    return tag(creator, "forge", name);
  }
}
