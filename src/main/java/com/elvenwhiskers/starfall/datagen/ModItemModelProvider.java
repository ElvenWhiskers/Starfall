package com.elvenwhiskers.starfall.datagen;

import com.elvenwhiskers.starfall.Starfall;
import com.elvenwhiskers.starfall.block.ModBlocks;
import com.elvenwhiskers.starfall.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Starfall.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AEGIS_INGOT);
        simpleItem(ModItems.RAW_AEGIS);

        simpleBlockItem(ModBlocks.PUFFBALL_BLUE);
        simpleBlockItem(ModBlocks.PUFFBALL_PINK);
        simpleBlockItem(ModBlocks.PUFFBALL_ORANGE);
        simpleBlockItem(ModBlocks.PUFFBALL_PURPLE);
        simpleBlockItem(ModBlocks.PUFFBALL_WHITE);
        saplingItem(ModBlocks.OPAL_SAPLING);
        saplingItem(ModBlocks.MAGNOLIA_SAPLING);
        saplingItem(ModBlocks.LARKSPUR_SAPLING);
        buttonItem(ModBlocks.OPAL_BUTTON, ModBlocks.OPAL_PLANKS);
        fenceItem(ModBlocks.OPAL_FENCE, ModBlocks.OPAL_PLANKS);
        wallItem(ModBlocks.OPAL_WALL, ModBlocks.OPAL_PLANKS);
        simpleBlockItem(ModBlocks.OPAL_DOOR);
        buttonItem(ModBlocks.MAGNOLIA_BUTTON, ModBlocks.MAGNOLIA_PLANKS);
        fenceItem(ModBlocks.MAGNOLIA_FENCE, ModBlocks.MAGNOLIA_PLANKS);
        wallItem(ModBlocks.MAGNOLIA_WALL, ModBlocks.MAGNOLIA_PLANKS);
        simpleBlockItem(ModBlocks.MAGNOLIA_DOOR);
        buttonItem(ModBlocks.LARKSPUR_BUTTON, ModBlocks.LARKSPUR_PLANKS);
        fenceItem(ModBlocks.LARKSPUR_FENCE, ModBlocks.LARKSPUR_PLANKS);
        wallItem(ModBlocks.LARKSPUR_WALL, ModBlocks.LARKSPUR_PLANKS);
        simpleBlockItem(ModBlocks.LARKSPUR_DOOR);
        buttonItem(ModBlocks.CALLALILY_BUTTON, ModBlocks.CALLALILY_PLANKS);
        fenceItem(ModBlocks.CALLALILY_FENCE, ModBlocks.CALLALILY_PLANKS);
        wallItem(ModBlocks.CALLALILY_WALL, ModBlocks.CALLALILY_PLANKS);
        simpleBlockItem(ModBlocks.CALLALILY_DOOR);
        buttonItem(ModBlocks.SWEETPEA_BUTTON, ModBlocks.SWEETPEA_PLANKS);
        fenceItem(ModBlocks.SWEETPEA_FENCE, ModBlocks.SWEETPEA_PLANKS);
        wallItem(ModBlocks.SWEETPEA_WALL, ModBlocks.SWEETPEA_PLANKS);
        simpleBlockItem(ModBlocks.SWEETPEA_DOOR);

    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Starfall.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Starfall.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Starfall.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Starfall.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Starfall.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Starfall.MODID,"item/" + item.getId().getPath()));
    }
}