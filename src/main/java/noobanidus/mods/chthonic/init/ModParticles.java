package noobanidus.mods.chthonic.init;

import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import noobanidus.mods.chthonic.Chthonic;
import noobanidus.mods.chthonic.particles.PlasmaParticle;

public class ModParticles {
  public static final DeferredRegister<ParticleType<?>> particleRegistry = new DeferredRegister<>(ForgeRegistries.PARTICLE_TYPES, Chthonic.MODID);

  public static RegistryObject<BasicParticleType> PLASMA = particleRegistry.register("plasma", () -> new BasicParticleType(false));

  @OnlyIn(Dist.CLIENT)
  public static void registerParticles(ParticleFactoryRegisterEvent event) {
    Minecraft.getInstance().particles.registerFactory(PLASMA.get(), PlasmaParticle.Plasma::new);
  }

  public static void load () {

  }
}
