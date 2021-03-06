package noobanidus.mods.chthonic.integration.jei;

import com.tterrag.registrate.util.RegistryEntry;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaRecipeCategoryUid;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.registration.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.chthonic.Chthonic;
import noobanidus.mods.chthonic.init.ModBlocks;
import noobanidus.mods.chthonic.init.ModItems;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("unchecked")
@JeiPlugin
public class JEIPlugin implements IModPlugin {
  private static final ResourceLocation UID = new ResourceLocation(Chthonic.MODID, Chthonic.MODID);

  @Override
  public ResourceLocation getPluginUid() {
    return UID;
  }

  @Override
  public void registerCategories(IRecipeCategoryRegistration registration) {
    IJeiHelpers jeiHelpers = registration.getJeiHelpers();
    IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
  }

  @Override
  public void registerRecipes(IRecipeRegistration registration) {
    ClientWorld world = Minecraft.getInstance().world;
    RecipeManager manager = world.getRecipeManager();
    Collection<IRecipe<?>> allRecipes = manager.getRecipes();
/*    List<GrinderRecipe> recipes = new ArrayList<>();
    allRecipes.stream().filter(o -> o instanceof GrinderRecipe).forEach(o -> recipes.add((GrinderRecipe) o));
    registration.addRecipes(recipes, GrinderCategory.UID);
    registration.addRecipes(GrindstoneCategory.RECIPE_LIST, GrindstoneCategory.UID);*/
  }

  @Override
  public void registerGuiHandlers(IGuiHandlerRegistration registration) {
/*    registration.addRecipeClickArea(GrinderScreen.class, 78, 32, 28, 23, GrinderCategory.UID, VanillaRecipeCategoryUid.FUEL);*/
  }

  @Override
  public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
/*    registration.addRecipeTransferHandler(GrinderContainer.class, GrinderCategory.UID, 0, 1, 3, 36);
    registration.addRecipeTransferHandler(GrinderContainer.class, VanillaRecipeCategoryUid.FUEL, 1, 1, 3, 36);*/
  }

  @Override
  public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
/*    registration.addRecipeCatalyst(new ItemStack(ModBlocks.GRINDER.get()), GrinderCategory.UID, VanillaRecipeCategoryUid.FUEL);
    for (RegistryEntry<GrindstoneItem> grindstone : ModItems.GRINDSTONE_MAP.values()) {
      registration.addRecipeCatalyst(new ItemStack(grindstone.get()), GrindstoneCategory.UID);
    }*/
  }
}
