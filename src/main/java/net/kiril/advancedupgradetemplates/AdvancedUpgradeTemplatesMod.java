package net.kiril.advancedupgradetemplates;

import net.fabricmc.api.ModInitializer;

import net.kiril.advancedupgradetemplates.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedUpgradeTemplatesMod implements ModInitializer {
	public static final String MOD_ID = "advancedupgradetemplatesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}