package net.tetto.advancedupgradetemplates.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.tetto.advancedupgradetemplates.AdvancedUpgradeTemplatesMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ModItems {

    public static final Item NETHERRACK_ROCK = registerItem("netherrack_rock", new Item(new FabricItemSettings()));
    public static final Item GILDED_BLACKSTONE_ROCK = registerItem("gilded_blackstone_rock", new  Item(new FabricItemSettings()));
    public static final Item TEMPLATE_BASE = registerItem("template_base", new Item(new FabricItemSettings()));
    public static final Item SMELTED_TEMPLATE_BASE = registerItem("smelted_template_base", new Item(new FabricItemSettings()));
    public static final Item CLUMP_GILDED_BLACKSTONE_ROCKS = registerItem("clump_of_gilded_blackstone_rocks", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_diamond_upgrade_smithing_template", new Item(new FabricItemSettings()){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.tooltip"));
            super.appendTooltip(stack, world, tooltip, context);
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.applies_to"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.armor_type"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.ingredients"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.ingredient"));
        }
    });
    public static final Item NETHERITE_EMERALD_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_emerald_upgrade_smithing_template", new Item(new FabricItemSettings()){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.tooltip"));
            super.appendTooltip(stack, world, tooltip, context);
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.applies_to"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.armor_type"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.ingredients"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.ingredient"));
        }
    });
    public static final Item NETHERITE_GOLD_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_gold_upgrade_smithing_template", new Item(new FabricItemSettings()){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.tooltip"));
            super.appendTooltip(stack, world, tooltip, context);
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.applies_to"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.armor_type"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.ingredients"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.ingredient"));
        }
    });
    public static final Item NETHERITE_IRON_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_iron_upgrade_smithing_template", new Item(new FabricItemSettings()){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.tooltip"));
            super.appendTooltip(stack, world, tooltip, context);
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.applies_to"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.armor_type"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.ingredients"));
            tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.ingredient"));
        }
    });



    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdvancedUpgradeTemplatesMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AdvancedUpgradeTemplatesMod.LOGGER.info("Registering Mod Items for " + AdvancedUpgradeTemplatesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}


