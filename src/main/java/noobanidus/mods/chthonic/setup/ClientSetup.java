package noobanidus.mods.chthonic.setup;

import com.google.common.collect.ImmutableMap;
import static net.minecraft.client.renderer.model.ItemCameraTransforms.*;

import com.google.common.collect.Sets;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.ForgeBlockStateV1;
import net.minecraftforge.client.model.PerspectiveMapWrapper;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.model.TRSRTransformation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import noobanidus.mods.chthonic.Chthonic;

import java.util.Map;
import java.util.Set;

@OnlyIn(Dist.CLIENT)
public class ClientSetup {
  private static final TRSRTransformation THIRD_PERSON_BLOCK = ForgeBlockStateV1.Transforms.convert(0, 2.5f, 0, 75, 45, 0, 0.375f);
  private static final ImmutableMap<TransformType, TRSRTransformation> BLOCK_TRANSFORMS = ImmutableMap.<TransformType, TRSRTransformation>builder()
      .put(TransformType.GUI, ForgeBlockStateV1.Transforms.convert(0, 0, 0, 30, 225, 0, 0.625f))
      .put(TransformType.GROUND, ForgeBlockStateV1.Transforms.convert(0, 3, 0, 0, 0, 0, 0.25f))
      .put(TransformType.FIXED, ForgeBlockStateV1.Transforms.convert(0, 0, 0, 0, 0, 0, 0.5f))
      .put(TransformType.THIRD_PERSON_RIGHT_HAND, THIRD_PERSON_BLOCK)
      .put(TransformType.THIRD_PERSON_LEFT_HAND, ForgeBlockStateV1.Transforms.leftify(THIRD_PERSON_BLOCK))
      .put(TransformType.FIRST_PERSON_RIGHT_HAND, ForgeBlockStateV1.Transforms.convert(0, 0, 0, 0, 45, 0, 0.4f))
      .put(TransformType.FIRST_PERSON_LEFT_HAND, ForgeBlockStateV1.Transforms.convert(0, 0, 0, 0, 225, 0, 0.4f))
      .build();

  public static void init(FMLClientSetupEvent event) {
    OBJLoader.INSTANCE.addDomain(Chthonic.MODID);
  }

  public static final Set<ResourceLocation> MODELS = Sets.newHashSet(
      new ResourceLocation(Chthonic.MODID, "telescope")
  );

  public static void modelBake(ModelBakeEvent event) {
    Map<ResourceLocation, IBakedModel> registry = event.getModelRegistry();
    for (ResourceLocation ml : MODELS) {
      IBakedModel baked = registry.get(new ModelResourceLocation(ml, "facing=north"));
      if (baked != null) {
        IBakedModel inventory = new PerspectiveMapWrapper(baked, BLOCK_TRANSFORMS);
        registry.put(new ModelResourceLocation(ml, "inventory"), inventory);
      }
    }
  }
}
