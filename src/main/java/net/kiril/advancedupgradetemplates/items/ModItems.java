package net.kiril.advancedupgradetemplates.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kiril.advancedupgradetemplates.AdvancedUpgradeTemplatesMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item NETHERRACK_ROCK = registerItem("netherrack_rock", Item::new, new Item.Settings());
    public static final Item GILDED_BLACKSTONE_ROCK = registerItem("gilded_blackstone_rock", Item::new, new Item.Settings());
    public static final Item TEMPLATE_BASE = registerItem("template_base", Item::new, new Item.Settings());
    public static final Item SMELTED_TEMPLATE_BASE = registerItem("smelted_template_base", Item::new, new Item.Settings());
    public static final Item CLUMP_GILDED_BLACKSTONE_ROCKS = registerItem("clump_of_gilded_blackstone_rocks", Item::new, new Item.Settings());

    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registerKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AdvancedUpgradeTemplatesMod.MOD_ID, name));
        return Items.register(registerKey, factory, settings);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {

        entries.add(NETHERRACK_ROCK);
        entries.add(GILDED_BLACKSTONE_ROCK);
        entries.add(TEMPLATE_BASE);
        entries.add(SMELTED_TEMPLATE_BASE);
        entries.add(CLUMP_GILDED_BLACKSTONE_ROCKS);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}

