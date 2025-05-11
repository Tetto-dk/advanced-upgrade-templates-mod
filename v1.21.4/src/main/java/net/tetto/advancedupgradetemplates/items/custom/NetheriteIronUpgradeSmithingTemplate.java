package net.tetto.advancedupgradetemplates.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class NetheriteIronUpgradeSmithingTemplate extends Item {
    public NetheriteIronUpgradeSmithingTemplate(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.blank_line"));
        tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.applies_to"));
        tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.armor_type"));
        tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.ingredients"));
        tooltip.add(Text.translatable("item.advancedupgradetemplatesmod.netherite_iron_upgrade_smithing_template.ingredient"));
    }
}
