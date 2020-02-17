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
import noobanidus.mods.chthonic.blocks.*;

import java.util.ArrayList;
import java.util.List;

import static noobanidus.mods.chthonic.Chthonic.REGISTRATE;

public class ModBlocks {
  public static final NonNullUnaryOperator<Block.Properties> STONE_PROPS = (o) -> o.hardnessAndResistance(3f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE);
  public static final NonNullUnaryOperator<Block.Properties> BONE_PROPS = STONE_PROPS;

  private static List<RegistryEntry<OmniFacingTempBlock>> TEMP_BLOCKS = new ArrayList<>();
  private static List<RegistryEntry<FacingTempBlock>> FACING_TEMP_BLOCKS = new ArrayList<>();

  public static RegistryEntry<BonePileBlock> BONE_PILE_1 = REGISTRATE.block("bone_pile1", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE1)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bonepile1")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile1", new ResourceLocation(Chthonic.MODID, "block/bonepile1"));
  }).build().register();

  public static RegistryEntry<BonePileBlock> BONE_PILE_2 = REGISTRATE.block("bone_pile2", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE2)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bonepile2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile2", new ResourceLocation(Chthonic.MODID, "block/bonepile2"));
  }).build().register();

  public static RegistryEntry<BonePileBlock> BONE_PILE_3 = REGISTRATE.block("bone_pile3", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE3)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bonepile3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile3", new ResourceLocation(Chthonic.MODID, "block/bonepile3"));
  }).build().register();

  public static RegistryEntry<BonePileBlock> BONE_PILE_4 = REGISTRATE.block("bone_pile4", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE4)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bonepile4")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile4", new ResourceLocation(Chthonic.MODID, "block/bonepile4"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_LOW1 = REGISTRATE.block("skeleton_low1", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.LOW1)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletonlow")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_low1", new ResourceLocation(Chthonic.MODID, "block/skeletonlow"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_LOW2 = REGISTRATE.block("skeleton_low2", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.LOW2)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletonlow2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_low2", new ResourceLocation(Chthonic.MODID, "block/skeletonlow2"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_LOW3 = REGISTRATE.block("skeleton_low3", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.LOW3)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletonlow3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_low3", new ResourceLocation(Chthonic.MODID, "block/skeletonlow3"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP1 = REGISTRATE.block("skeleton_top1", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.TOP1)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletontop")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top1", new ResourceLocation(Chthonic.MODID, "block/skeletontop"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP2 = REGISTRATE.block("skeleton_top2", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.TOP2)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletontop2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top2", new ResourceLocation(Chthonic.MODID, "block/skeletontop2"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP3 = REGISTRATE.block("skeleton_top3", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.TOP3)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletontop3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top3", new ResourceLocation(Chthonic.MODID, "block/skeletontop3"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP4 = REGISTRATE.block("skeleton_top4", (b) -> new SkeletonBlock(b, SkeletonBlock.SkeletonType.TOP4)).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeletontop4")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top4", new ResourceLocation(Chthonic.MODID, "block/skeletontop4"));
  }).build().register();

  public static RegistryEntry<TelescopeBlock> TELESCOPE = REGISTRATE.block("telescope", TelescopeBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> {
  }).item().model((ctx, p) -> {
  }).build().register();

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
