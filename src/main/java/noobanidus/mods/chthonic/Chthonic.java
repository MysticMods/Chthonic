package noobanidus.mods.chthonic;

import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import noobanidus.mods.chthonic.client.hud.ManageHUD;
import noobanidus.mods.chthonic.config.ConfigManager;
import noobanidus.mods.chthonic.init.*;
import noobanidus.mods.chthonic.registrate.CustomRegistrate;
import noobanidus.mods.chthonic.setup.ClientSetup;
import noobanidus.mods.chthonic.setup.CommonSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("chthonic")
public class Chthonic {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "chthonic";

  public static final ItemGroup ITEM_GROUP = new ItemGroup("chthonic") {
    @Override
    public ItemStack createIcon() {
      return ItemStack.EMPTY;
    }
  };

  public static CustomRegistrate REGISTRATE;

  public Chthonic() {
    ConfigManager.loadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(Chthonic.MODID + "-common.toml"));
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    modBus.addListener(CommonSetup::init);

    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
      modBus.addListener(ClientSetup::init);
    });

    REGISTRATE = CustomRegistrate.create(MODID);
    REGISTRATE.itemGroup(NonNullSupplier.of(() -> ITEM_GROUP));
    ModItems.load();
    ModBlocks.load();
    ModTiles.load();
    ModRecipes.load();
    ModContainers.load();
    ModLang.load();
    ModTags.load();
  }
}
