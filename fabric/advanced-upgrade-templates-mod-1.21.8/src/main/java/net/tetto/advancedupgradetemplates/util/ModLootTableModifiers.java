package net.tetto.advancedupgradetemplates.util;


import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.tetto.advancedupgradetemplates.items.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

        if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.75f))
                    .with(ItemEntry.builder(ModItems.NETHERITE_IRON_UPGRADE_SMITHING_TEMPLATE))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

            tableBuilder.pool(poolBuilder.build());
            }


        if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.50f))
                    .with(ItemEntry.builder(ModItems.NETHERITE_GOLD_UPGRADE_SMITHING_TEMPLATE))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

            tableBuilder.pool(poolBuilder.build());
            }


        if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.25f))
                    .with(ItemEntry.builder(ModItems.NETHERITE_EMERALD_UPGRADE_SMITHING_TEMPLATE))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

            tableBuilder.pool(poolBuilder.build());
            }


        if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.125f)) // Drops 100% of the time
                    .with(ItemEntry.builder(ModItems.NETHERITE_DIAMOND_UPGRADE_SMITHING_TEMPLATE))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

            tableBuilder.pool(poolBuilder.build());
            }


        });



    }

}