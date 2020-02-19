package noobanidus.mods.chthonic;

import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
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
      return new ItemStack(Items.SKELETON_SKULL);
    }
  };

  public static CustomRegistrate REGISTRATE;

  public Chthonic() {
    ConfigManager.loadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(Chthonic.MODID + "-common.toml"));
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    modBus.addListener(CommonSetup::init);

    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
      modBus.addListener(ClientSetup::init);
      modBus.addListener(ClientSetup::modelBake);
      modBus.addListener(ModParticles::registerParticles);
    });

    REGISTRATE = CustomRegistrate.create(MODID);
    REGISTRATE.itemGroup(NonNullSupplier.of(() -> ITEM_GROUP));
    ModParticles.particleRegistry.register(modBus);
    ModItems.load();
    ModBlocks.load();
    ModTiles.load();
    ModRecipes.load();
    ModContainers.load();
    ModLang.load();
    ModTags.load();
    ModFluids.load();
    ModParticles.load();
  }
}
