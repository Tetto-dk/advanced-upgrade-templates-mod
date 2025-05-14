package net.tetto.advancedupgradetemplates.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;
import net.tetto.advancedupgradetemplates.AdvancedUpgradeTemplatesMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item NETHERRACK_ROCK = registerItem("netherrack_rock", new Item(new FabricItemSettings()));
    public static final Item GILDED_BLACKSTONE_ROCK = registerItem("gilded_blackstone_rock", new  Item(new FabricItemSettings()));
    public static final Item TEMPLATE_BASE = registerItem("template_base", new Item(new FabricItemSettings()));
    public static final Item SMELTED_TEMPLATE_BASE = registerItem("smelted_template_base", new Item(new FabricItemSettings()));
    public static final Item CLUMP_GILDED_BLACKSTONE_ROCKS = registerItem("clump_of_gilded_blackstone_rocks", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_diamond_upgrade_smithing_template", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NETHERITE_EMERALD_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_emerald_upgrade_smithing_template", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NETHERITE_GOLD_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_gold_upgrade_smithing_template", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NETHERITE_IRON_UPGRADE_SMITHING_TEMPLATE = registerItem("netherite_iron_upgrade_smithing_template", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));



    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(NETHERRACK_ROCK);
        entries.add(GILDED_BLACKSTONE_ROCK);
        entries.add(TEMPLATE_BASE);
        entries.add(SMELTED_TEMPLATE_BASE);
        entries.add(CLUMP_GILDED_BLACKSTONE_ROCKS);
        entries.add(NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE);
        entries.add(NETHERITE_EMERALD_UPGRADE_SMITHING_TEMPLATE);
        entries.add(NETHERITE_GOLD_UPGRADE_SMITHING_TEMPLATE);
        entries.add(NETHERITE_IRON_UPGRADE_SMITHING_TEMPLATE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdvancedUpgradeTemplatesMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}


