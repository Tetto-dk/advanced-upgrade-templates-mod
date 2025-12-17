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



	}


}