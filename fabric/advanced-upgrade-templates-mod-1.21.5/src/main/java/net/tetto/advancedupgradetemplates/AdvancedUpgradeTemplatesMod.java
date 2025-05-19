package net.tetto.advancedupgradetemplates;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;
import net.tetto.advancedupgradetemplates.items.ModItems;

import net.tetto.advancedupgradetemplates.items.custom.ModItemsGroup;

import net.tetto.advancedupgradetemplates.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AdvancedUpgradeTemplatesMod implements ModInitializer {
	public static final String MOD_ID = "advancedupgradetemplatesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();

		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();



		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
			if (!itemStack.isOf(ModItems.NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE)) {
				return;
			}
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.tooltip"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.applies_to"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.armor_type"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.ingredients"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_diamond_upgrade_smithing_template.ingredient"));
		});
		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
			if (!itemStack.isOf(ModItems.NETHERITE_EMERALD_UPGRADE_SMITHING_TEMPLATE)) {
				return;
			}
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.tooltip"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.applies_to"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.armor_type"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.ingredients"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_emerald_upgrade_smithing_template.ingredient"));
		});
		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
			if (!itemStack.isOf(ModItems.NETHERITE_IRON_UPGRADE_SMITHING_TEMPLATE)) {
				return;
			}
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.tooltip"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.applies_to"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.armor_type"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.ingredients"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.ingredient"));
		});
		ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {
			if (!itemStack.isOf(ModItems.NETHERITE_GOLD_UPGRADE_SMITHING_TEMPLATE)) {
				return;
			}
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.tooltip"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.applies_to"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.armor_type"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.ingredients"));
			list.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_gold_upgrade_smithing_template.ingredient"));
		});


	}


}