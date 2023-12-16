package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.client.resources.model.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.stringtemplate.v4.misc.Misc;

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

        oneToOneConversionRecipe(pWriter, Items.BLUE_DYE, ModBlocks.PUFFBALL_BLUE.get(), "dye_blue");
        oneToOneConversionRecipe(pWriter, Items.PINK_DYE, ModBlocks.PUFFBALL_PINK.get(), "dye_pink");
        oneToOneConversionRecipe(pWriter, Items.ORANGE_DYE, ModBlocks.PUFFBALL_ORANGE.get(), "dye_orange");
        oneToOneConversionRecipe(pWriter, Items.PURPLE_DYE, ModBlocks.PUFFBALL_PURPLE.get(), "dye_purple");
        oneToOneConversionRecipe(pWriter, Items.WHITE_DYE, ModBlocks.PUFFBALL_WHITE.get(), "dye_white");

        simpleColoredCatlinite(pWriter, Items.LIGHT_BLUE_DYE, ModBlocks.LIGHT_BLUE_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.LIME_DYE, ModBlocks.LIME_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.YELLOW_DYE, ModBlocks.YELLOW_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.ORANGE_DYE, ModBlocks.ORANGE_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.BLUE_DYE, ModBlocks.BLUE_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.MAGENTA_DYE, ModBlocks.MAGENTA_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.PURPLE_DYE, ModBlocks.PURPLE_CATLINITE.get());
        simpleColoredCatlinite(pWriter, Items.PINK_DYE, ModBlocks.PINK_CATLINITE.get());


        oreSmelting(pWriter, AEGIS_SMELTABLES, RecipeCategory.MISC, ModItems.AEGIS_INGOT.get(), 0.25f, 200, "aegis");
        oreBlasting(pWriter, AEGIS_SMELTABLES, RecipeCategory.MISC, ModItems.AEGIS_INGOT.get(), 0.25f, 100, "aegis");

        SimpleCookingRecipeBuilder.generic(Ingredient.of(ModBlocks.COBBLED_BRIGHTSTONE.get()), RecipeCategory.MISC, ModBlocks.BRIGHTSTONE.get(), 0.25f, 200,
                        RecipeSerializer.SMELTING_RECIPE).group("stone")
                .unlockedBy("has_cobbled_brightstone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.COBBLED_BRIGHTSTONE.get()).build()))
                .save(pWriter, Starfall.MODID + ":" + getItemName(ModBlocks.BRIGHTSTONE.get()) + "_from_" + getItemName(ModBlocks.COBBLED_BRIGHTSTONE.get()));



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRIGHTSTONE_BRICKS.get(), 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.BRIGHTSTONE.get())
                .unlockedBy("has_brightstone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.BRIGHTSTONE.get()).build()))
                .save(pWriter);

        //Adds all log varients, sticks, planks from logs, stripped, but not shapes.
        treeParts(pWriter, RecipeCategory.MISC, ModBlocks.OPAL_LOG.get(), ModBlocks.OPAL_WOOD.get(), ModBlocks.OPAL_PLANKS.get(), ModBlocks.STRIPPED_OPAL_LOG.get(), ModBlocks.STRIPPED_OPAL_WOOD.get());
        treeParts(pWriter, RecipeCategory.MISC, ModBlocks.MAGNOLIA_LOG.get(), ModBlocks.MAGNOLIA_WOOD.get(), ModBlocks.MAGNOLIA_PLANKS.get(), ModBlocks.STRIPPED_MAGNOLIA_LOG.get(), ModBlocks.STRIPPED_MAGNOLIA_WOOD.get());
        treeParts(pWriter, RecipeCategory.MISC, ModBlocks.LARKSPUR_LOG.get(), ModBlocks.LARKSPUR_WOOD.get(), ModBlocks.LARKSPUR_PLANKS.get(), ModBlocks.STRIPPED_LARKSPUR_LOG.get(), ModBlocks.STRIPPED_LARKSPUR_WOOD.get());
        treeParts(pWriter, RecipeCategory.MISC, ModBlocks.CALLALILY_LOG.get(), ModBlocks.CALLALILY_WOOD.get(), ModBlocks.CALLALILY_PLANKS.get(), ModBlocks.STRIPPED_CALLALILY_LOG.get(), ModBlocks.STRIPPED_CALLALILY_WOOD.get());
        treeParts(pWriter, RecipeCategory.MISC, ModBlocks.SWEETPEA_LOG.get(), ModBlocks.SWEETPEA_WOOD.get(), ModBlocks.SWEETPEA_PLANKS.get(), ModBlocks.STRIPPED_SWEETPEA_LOG.get(), ModBlocks.STRIPPED_SWEETPEA_WOOD.get());

        //Next add SHAPES, UGH, this was initally a pain
        plankShapeParts(pWriter, ModBlocks.OPAL_PLANKS.get(), ModBlocks.OPAL_BUTTON.get(), ModBlocks.OPAL_DOOR.get(), ModBlocks.OPAL_FENCE.get(), ModBlocks.OPAL_FENCE_GATE.get(), ModBlocks.OPAL_PRESSURE_PLATE.get(),
                ModBlocks.OPAL_SLAB.get(), ModBlocks.OPAL_STAIRS.get(), ModBlocks.OPAL_TRAPDOOR.get(), ModBlocks.OPAL_WALL.get());
        plankShapeParts(pWriter, ModBlocks.MAGNOLIA_PLANKS.get(), ModBlocks.MAGNOLIA_BUTTON.get(), ModBlocks.MAGNOLIA_DOOR.get(), ModBlocks.MAGNOLIA_FENCE.get(), ModBlocks.MAGNOLIA_FENCE_GATE.get(), ModBlocks.MAGNOLIA_PRESSURE_PLATE.get(),
                ModBlocks.MAGNOLIA_SLAB.get(), ModBlocks.MAGNOLIA_STAIRS.get(), ModBlocks.MAGNOLIA_TRAPDOOR.get(), ModBlocks.MAGNOLIA_WALL.get());
        plankShapeParts(pWriter, ModBlocks.LARKSPUR_PLANKS.get(), ModBlocks.LARKSPUR_BUTTON.get(), ModBlocks.LARKSPUR_DOOR.get(), ModBlocks.LARKSPUR_FENCE.get(), ModBlocks.LARKSPUR_FENCE_GATE.get(), ModBlocks.LARKSPUR_PRESSURE_PLATE.get(),
                ModBlocks.LARKSPUR_SLAB.get(), ModBlocks.LARKSPUR_STAIRS.get(), ModBlocks.LARKSPUR_TRAPDOOR.get(), ModBlocks.LARKSPUR_WALL.get());
        plankShapeParts(pWriter, ModBlocks.CALLALILY_PLANKS.get(), ModBlocks.CALLALILY_BUTTON.get(), ModBlocks.CALLALILY_DOOR.get(), ModBlocks.CALLALILY_FENCE.get(), ModBlocks.CALLALILY_FENCE_GATE.get(), ModBlocks.CALLALILY_PRESSURE_PLATE.get(),
                ModBlocks.CALLALILY_SLAB.get(), ModBlocks.CALLALILY_STAIRS.get(), ModBlocks.CALLALILY_TRAPDOOR.get(), ModBlocks.CALLALILY_WALL.get());
        plankShapeParts(pWriter, ModBlocks.SWEETPEA_PLANKS.get(), ModBlocks.SWEETPEA_BUTTON.get(), ModBlocks.SWEETPEA_DOOR.get(), ModBlocks.SWEETPEA_FENCE.get(), ModBlocks.SWEETPEA_FENCE_GATE.get(), ModBlocks.SWEETPEA_PRESSURE_PLATE.get(),
                ModBlocks.SWEETPEA_SLAB.get(), ModBlocks.SWEETPEA_STAIRS.get(), ModBlocks.SWEETPEA_TRAPDOOR.get(), ModBlocks.SWEETPEA_WALL.get());

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

        ShapedRecipeBuilder.shaped(pCategory, pWood, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', pLog)
                .unlockedBy("has_" + getItemName(pWood), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pWood).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pWood) + "_from_" + getItemName(pLog));

        ShapedRecipeBuilder.shaped(pCategory, pSTWood, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', pSTLog)
                .unlockedBy("has_" + getItemName(pSTWood), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pSTWood).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pSTWood) + "_from_" + getItemName(pSTLog));
    }

    protected static void plankShapeParts(Consumer<FinishedRecipe> pFinishedRecipe, ItemLike pPlanks, ItemLike pButton, ItemLike pDoor, ItemLike pFence, ItemLike pFenceGate, ItemLike pPressurePlate, ItemLike pSlab, ItemLike pStairs, ItemLike pTrap, ItemLike pWall){
        buttonBuilder(pButton, Ingredient.of(pPlanks))
                        .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                        .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pButton) + "_from_" + getItemName(pPlanks));
        doorBuilder(pDoor, Ingredient.of(pPlanks))
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pDoor) + "_from_" + getItemName(pPlanks));
        fenceBuilder(pFence, Ingredient.of(pPlanks))
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pFence) + "_from_" + getItemName(pPlanks));
        fenceGateBuilder(pFenceGate, Ingredient.of(pPlanks))
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pFenceGate) + "_from_" + getItemName(pPlanks));
        pressurePlate(pFinishedRecipe, pPressurePlate, pPlanks);
        slabBuilder(RecipeCategory.MISC , pSlab, Ingredient.of(pPlanks))
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pSlab) + "_from_" + getItemName(pPlanks));
        stairBuilder(pStairs, Ingredient.of(pPlanks))
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pStairs) + "_from_" + getItemName(pPlanks));
        trapdoorBuilder(pTrap, Ingredient.of(pPlanks))
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pTrap) + "_from_" + getItemName(pPlanks));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pWall, 6)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', pPlanks)
                .define('B', pSlab)
                .unlockedBy("has_" + getItemName(pPlanks), inventoryTrigger(ItemPredicate.Builder.item().
                        of(pPlanks).build()))
                .save(pFinishedRecipe, Starfall.MODID + ":" + getItemName(pWall) + "_from_" + getItemName(pPlanks));

    }

    protected static void simpleColoredCatlinite(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pDye, ItemLike pResult){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', ModBlocks.CATLINITE.get())
                .define('B', pDye)
                .unlockedBy("has_catlinite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.CATLINITE.get()).build()))
                .save(pFinishedRecipeConsumer);
    }

}