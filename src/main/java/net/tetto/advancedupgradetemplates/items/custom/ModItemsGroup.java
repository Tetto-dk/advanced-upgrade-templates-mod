package net.tetto.advancedupgradetemplates.items.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.tetto.advancedupgradetemplates.AdvancedUpgradeTemplatesMod;

import net.tetto.advancedupgradetemplates.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup ADVANCED_UPGRADE_TEMPLATES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AdvancedUpgradeTemplatesMod.MOD_ID, "advanced_upgrade_templates_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE))
                    .displayName(Text.translatable("itemgroup.advancedupgradetemplates.advanced_upgrade_templates_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NETHERRACK_ROCK);
                        entries.add(ModItems.GILDED_BLACKSTONE_ROCK);
                        entries.add(ModItems.TEMPLATE_BASE);
                        entries.add(ModItems.SMELTED_TEMPLATE_BASE);
                        entries.add(ModItems.CLUMP_GILDED_BLACKSTONE_ROCKS);
                        entries.add(ModItems.NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.NETHERITE_EMERALD_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.NETHERITE_GOLD_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.NETHERITE_IRON_UPGRADE_SMITHING_TEMPLATE);


                    }).build());

    public static void registerItemGroups() {
        AdvancedUpgradeTemplatesMod.LOGGER.info("Registering Item Groups for " + AdvancedUpgradeTemplatesMod.MOD_ID);
    }
}
