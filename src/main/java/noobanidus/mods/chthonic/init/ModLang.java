package noobanidus.mods.chthonic.init;

import com.tterrag.registrate.providers.ProviderType;

import static noobanidus.mods.chthonic.Chthonic.REGISTRATE;

public class ModLang {
  static {
    REGISTRATE.addDataGenerator(ProviderType.LANG, ctx -> {
      ctx.add("itemGroup.chthonic", "Chthonic");
    });
  }

  public static void load () {
  }
}
