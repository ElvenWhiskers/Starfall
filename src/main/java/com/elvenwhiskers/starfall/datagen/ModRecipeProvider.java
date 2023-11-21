package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> AEGIS_SMELTABLES = List.of(ModItems.RAW_AEGIS.get(),
            ModBlocks.AEGIS_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AEGIS_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AEGIS_INGOT.get())
                .unlockedBy("has_aegis", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.AEGIS_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AEGIS_INGOT.get(), 9)
                .requires(ModBlocks.AEGIS_BLOCK.get())
                .unlockedBy("has_aegis_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.AEGIS_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_AEGIS.get(), RecipeCategory.MISC, ModBlocks.RAW_AEGIS_BLOCK.get(),
                "starfall:raw_aegis", "aegis","starfall:raw_aegis_block", "aegis");


        oreSmelting(pWriter, AEGIS_SMELTABLES, RecipeCategory.MISC, ModItems.AEGIS_INGOT.get(), 0.25f, 200, "aegis");
        oreBlasting(pWriter, AEGIS_SMELTABLES, RecipeCategory.MISC, ModItems.AEGIS_INGOT.get(), 0.25f, 100, "aegis");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRIGHTSTONE_BRICKS.get(), 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.BRIGHTSTONE.get())
                .unlockedBy("has_brightstone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BRIGHTSTONE.get()).build()))
                .save(pWriter);

        treeParts(pWriter, RecipeCategory.MISC, ModBlocks.OPAL_LOG.get(), ModBlocks.OPAL_WOOD.get(), ModBlocks.OPAL_PLANKS.get(), ModBlocks.STRIPPED_OPAL_LOG.get(), ModBlocks.STRIPPED_OPAL_WOOD.get());


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Starfall.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void treeParts(Consumer<FinishedRecipe> pFinishedRecipe, RecipeCategory pCategory, ItemLike pLog, ItemLike pWood, ItemLike pPlanks, ItemLike pSTLog, ItemLike pSTWood){
        ShapelessRecipeBuilder.shapeless(pCategory, pPlanks, 4)
                .requires(pLog)
                .unlockedBy("has_" + getItemName(pLog), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pLog).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pPlanks) + "_from_" + getItemName(pLog));

        ShapelessRecipeBuilder.shapeless(pCategory, pPlanks, 4)
                .requires(pWood)
                .unlockedBy("has_" + getItemName(pWood), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pWood).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pPlanks) + "_from_" + getItemName(pWood));

        ShapedRecipeBuilder.shaped(pCategory, Items.STICK, 4)
                .pattern("A")
                .pattern("A")
                .define('A', pPlanks)
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + "sticks_from_" + getItemName(pPlanks));

        ShapelessRecipeBuilder.shapeless(pCategory, pPlanks, 4)
                .requires(pSTLog)
                .unlockedBy("has_" + getItemName(pSTLog), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pSTLog).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pPlanks) + "_from_" + getItemName(pSTLog));

        ShapelessRecipeBuilder.shapeless(pCategory, pPlanks, 4)
                .requires(pSTWood)
                .unlockedBy("has_" + getItemName(pSTWood), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pSTWood).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pPlanks) + "_from_" + getItemName(pSTWood));

    }
}