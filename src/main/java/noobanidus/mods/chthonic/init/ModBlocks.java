package noobanidus.mods.chthonic.init;

import com.tterrag.registrate.util.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;
import noobanidus.mods.chthonic.Chthonic;
import noobanidus.mods.chthonic.blocks.*;

import java.util.ArrayList;
import java.util.List;

import static noobanidus.mods.chthonic.Chthonic.REGISTRATE;

public class ModBlocks {
  public static final NonNullUnaryOperator<Block.Properties> STONE_PROPS = (o) -> Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE);
  public static final NonNullUnaryOperator<Block.Properties> STONE_LAMP_PROPS = (o) -> Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).lightValue(10);
  public static final NonNullUnaryOperator<Block.Properties> BONE_PROPS = (o) -> Block.Properties.create(Material.ROCK, MaterialColor.SAND).sound(SoundType.STONE).hardnessAndResistance(2.0F).harvestTool(ToolType.PICKAXE);
  public static final NonNullUnaryOperator<Block.Properties> WOOD_PROPS = (o) -> Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f).sound(SoundType.WOOD).harvestTool(ToolType.AXE);
  public static final NonNullUnaryOperator<Block.Properties> GLASS_PROPS = (o) -> Block.Properties.create(Material.GLASS).hardnessAndResistance(1.5f).sound(SoundType.GLASS).harvestTool(ToolType.PICKAXE);

  private static List<RegistryEntry<OmniFacingBlock>> TEMP_BLOCKS = new ArrayList<>();
  private static List<RegistryEntry<HorizontalFacingBlock>> FACING_TEMP_BLOCKS = new ArrayList<>();

  public static RegistryEntry<BonePileBlock> BONE_PILE_1 = REGISTRATE.block("bone_pile1", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE1)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bone_pile1")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile1", new ResourceLocation(Chthonic.MODID, "block/bone_pile1"));
  }).build().register();

  public static RegistryEntry<BonePileBlock> BONE_PILE_2 = REGISTRATE.block("bone_pile2", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE2)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bone_pile2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile2", new ResourceLocation(Chthonic.MODID, "block/bone_pile2"));
  }).build().register();

  public static RegistryEntry<BonePileBlock> BONE_PILE_3 = REGISTRATE.block("bone_pile3", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE3)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bone_pile3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile3", new ResourceLocation(Chthonic.MODID, "block/bone_pile3"));
  }).build().register();

  public static RegistryEntry<BonePileBlock> BONE_PILE_4 = REGISTRATE.block("bone_pile4", (b) -> new BonePileBlock(b, BonePileBlock.PileType.PILE4)).properties(BONE_PROPS).lang("Bone Pile").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/bone_pile4")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("bone_pile4", new ResourceLocation(Chthonic.MODID, "block/bone_pile4"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_LOW1 = REGISTRATE.block("skeleton_low1", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_low1")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_low1", new ResourceLocation(Chthonic.MODID, "block/skeleton_low1"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_LOW2 = REGISTRATE.block("skeleton_low2", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_low2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_low2", new ResourceLocation(Chthonic.MODID, "block/skeleton_low2"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_LOW3 = REGISTRATE.block("skeleton_low3", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_low3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_low3", new ResourceLocation(Chthonic.MODID, "block/skeleton_low3"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP1 = REGISTRATE.block("skeleton_top1", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_top1")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top1", new ResourceLocation(Chthonic.MODID, "block/skeleton_top1"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP2 = REGISTRATE.block("skeleton_top2", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_top2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top2", new ResourceLocation(Chthonic.MODID, "block/skeleton_top2"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP3 = REGISTRATE.block("skeleton_top3", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_top3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top3", new ResourceLocation(Chthonic.MODID, "block/skeleton_top3"));
  }).build().register();

  public static RegistryEntry<SkeletonBlock> SKELETON_TOP4 = REGISTRATE.block("skeleton_top4", SkeletonBlock::new).properties(BONE_PROPS).lang("Skeletal Remains").blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/skeleton_top4")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("skeleton_top4", new ResourceLocation(Chthonic.MODID, "block/skeleton_top4"));
  }).build().register();

  public static RegistryEntry<RefineryBlock> REFINERY = REGISTRATE.block("refinery", RefineryBlock::new).properties(GLASS_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/refinery")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("refinery", new ResourceLocation(Chthonic.MODID, "block/refinery"));
  }).build().register();

  public static RegistryEntry<LampBlock> LAMP = REGISTRATE.block("lamp", LampBlock::new).properties(STONE_LAMP_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/lamp")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("lamp", new ResourceLocation(Chthonic.MODID, "block/lamp"));
  }).build().register();

  public static RegistryEntry<GyroBlock> GYRO = REGISTRATE.block("gyro", GyroBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/gyro")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("gyro", new ResourceLocation(Chthonic.MODID, "block/gyro"));
  }).build().register();

  public static RegistryEntry<AltarBlock> ALTAR = REGISTRATE.block("altar", AltarBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/altar")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("altar", new ResourceLocation(Chthonic.MODID, "block/altar"));
  }).build().register();

  public static RegistryEntry<ResearchTableBlock> RESEARCH_TABLE = REGISTRATE.block("research_table", ResearchTableBlock::new).properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/research_table")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("research_table", new ResourceLocation(Chthonic.MODID, "block/research_table"));
  }).build().register();

  public static RegistryEntry<TableLeftBlock> TABLE_LEFT = REGISTRATE.block("table_left", TableLeftBlock::new).properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/table_left")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("table_left", new ResourceLocation(Chthonic.MODID, "block/table_left"));
  }).build().register();

  public static RegistryEntry<TableRightBlock> TABLE_RIGHT = REGISTRATE.block("table_right", TableRightBlock::new).properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/table_right")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("table_right", new ResourceLocation(Chthonic.MODID, "block/table_right"));
  }).build().register();

  public static RegistryEntry<TelescopeBlock> TELESCOPE = REGISTRATE.block("telescope", TelescopeBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> {
  }).item().model((ctx, p) -> {
  }).build().register();

  public static RegistryEntry<EmptyBookshelfBlock> EMPTY_BOOKSHELF = REGISTRATE.block("empty_bookshelf", EmptyBookshelfBlock::new).properties(WOOD_PROPS).blockstate((ctx, p) -> {
    ModelFile model = p.getBuilder("empty_bookshelf")
        .parent(p.getExistingFile(new ResourceLocation("minecraft", "bookshelf")))
        .texture("end", new ResourceLocation("minecraft", "block/dark_oak_planks"))
        .texture("side", new ResourceLocation(Chthonic.MODID, "block/bookshelf_empty"));

    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(model)
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).item().model((ctx, p) -> {
    p.withExistingParent("empty_bookshelf", new ResourceLocation(Chthonic.MODID, "block/empty_bookshelf"));
  }).build()
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 1)
        .patternLine("WWW")
        .patternLine("   ")
        .patternLine("WWW")
        .key('W', Items.DARK_OAK_PLANKS)
        .addCriterion("has_dark_oak", p.hasItem(Items.DARK_OAK_PLANKS))
        .build(p))
      .register();

  public static RegistryEntry<PileBlock> BOOK_PILE1 = REGISTRATE.block("book_pile1", PileBlock::new)
  .properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/book_pile1")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).lang("Pile of Books").item().model((ctx, p) -> {
    p.withExistingParent("book_pile1", new ResourceLocation(Chthonic.MODID, "block/book_pile1"));
  }).build()
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 5)
        .patternLine("B ")
        .patternLine("BB")
        .patternLine("BB")
        .key('B', Items.BOOK)
        .addCriterion("has_book", p.hasItem(Items.BOOK))
        .build(p))
      .register();

  public static RegistryEntry<PileBlock> BOOK_PILE2 = REGISTRATE.block("book_pile2", PileBlock::new)
  .properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/book_pile2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).lang("Pile of Books").item().model((ctx, p) -> {
    p.withExistingParent("book_pile2", new ResourceLocation(Chthonic.MODID, "block/book_pile2"));
  }).build()
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 5)
        .patternLine(" B ")
        .patternLine("B B")
        .patternLine("BB ")
        .key('B', Items.BOOK)
        .addCriterion("has_book", p.hasItem(Items.BOOK))
        .build(p))
      .register();

  public static RegistryEntry<BookPaneBlock> BOOK_PANE1 = REGISTRATE.block("book_pane1", BookPaneBlock::new)
  .properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/book1")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).lang("Assorted Books").item().model((ctx, p) -> {
    p.withExistingParent("book_pane1", new ResourceLocation(Chthonic.MODID, "block/book1"));
  }).build()
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 4)
        .patternLine("BBB")
        .patternLine("WWW")
        .patternLine("BBB")
        .key('B', Items.BOOK)
        .key('W', ItemTags.PLANKS)
        .addCriterion("has_book", p.hasItem(Items.BOOK))
        .addCriterion("has_dark_oak", p.hasItem(ItemTags.PLANKS))
        .build(p))
      .register();

  public static RegistryEntry<BookPaneBlock> BOOK_PANE2 = REGISTRATE.block("book_pane2", BookPaneBlock::new)
  .properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/book2")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).lang("Assorted Books").item().model((ctx, p) -> {
    p.withExistingParent("book_pane2", new ResourceLocation(Chthonic.MODID, "block/book2"));
  }).build()
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 4)
        .patternLine("WBB")
        .patternLine("BWB")
        .patternLine("BBW")
        .key('B', Items.BOOK)
        .key('W', ItemTags.PLANKS)
        .addCriterion("has_book", p.hasItem(Items.BOOK))
        .addCriterion("has_dark_oak", p.hasItem(ItemTags.PLANKS))
        .build(p))
      .register();

  public static RegistryEntry<BookPaneBlock> BOOK_PANE3 = REGISTRATE.block("book_pane3", BookPaneBlock::new)
  .properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/book3")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).lang("Assorted Books").item().model((ctx, p) -> {
    p.withExistingParent("book_pane3", new ResourceLocation(Chthonic.MODID, "block/book3"));
  }).build()
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 4)
        .patternLine("BBW")
        .patternLine("BWB")
        .patternLine("WBB")
        .key('B', Items.BOOK)
        .key('W', ItemTags.PLANKS)
        .addCriterion("has_book", p.hasItem(Items.BOOK))
        .addCriterion("has_dark_oak", p.hasItem(ItemTags.PLANKS))
        .build(p))
      .register();

  public static RegistryEntry<BookPaneBlock> BOOK_PANE4 = REGISTRATE.block("book_pane4", BookPaneBlock::new)
  .properties(WOOD_PROPS).blockstate((ctx, p) -> {
    p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
        .modelFile(p.getExistingFile(new ResourceLocation(Chthonic.MODID, "block/book4")))
        .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
        .build());
  }).lang("Assorted Books").item().model((ctx, p) -> {
    p.withExistingParent("book_pane4", new ResourceLocation(Chthonic.MODID, "block/book4"));
  })
    .recipe((ctx, p) -> ShapedRecipeBuilder.shapedRecipe(ctx.getEntry(), 4)
        .patternLine("BWB")
        .patternLine("BWB")
        .patternLine("BWB")
        .key('B', Items.BOOK)
        .key('W', ItemTags.PLANKS)
        .addCriterion("has_book", p.hasItem(Items.BOOK))
        .addCriterion("has_dark_oak", p.hasItem(ItemTags.PLANKS))
        .build(p))
      .build().register();

/*  static {
    for (int i = 0; i < 50; i++) {
      int index = i + 1;
      TEMP_BLOCKS.add(REGISTRATE.block("omni_temp" + index, OmniFacingBlock::new).properties(STONE_PROPS).blockstate((ctx, p) -> p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
          .modelFile(p.withExistingParent("omni_temp" + index, new ResourceLocation(Chthonic.MODID, "block/cube")))
          .build())).item().model((ctx, p) -> {
        p.withExistingParent("omni_temp" + index, new ResourceLocation(Chthonic.MODID, "block/omni_temp" + index));
      }).build().register());
      FACING_TEMP_BLOCKS.add(REGISTRATE.block("facing_temp" + index, HorizontalFacingBlock::new).blockstate((ctx, p) -> {
        ModelFile model = p.withExistingParent("facing_temp" + index, new ResourceLocation(Chthonic.MODID, "block/cube"));
        p.getVariantBuilder(ctx.getEntry()).forAllStates(state -> ConfiguredModel.builder()
            .modelFile(model)
            .rotationY(((int) state.get(BlockStateProperties.HORIZONTAL_FACING).getHorizontalAngle() + 180) % 360)
            .build());
      }).properties(STONE_PROPS).item().model((ctx, p) -> {
        p.withExistingParent("facing_temp" + index, new ResourceLocation(Chthonic.MODID, "block/facing_temp" + index));
      }).build().register());
    }
  }*/

  public static void load() {

  }
}
