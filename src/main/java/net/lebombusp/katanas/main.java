package net.lebombusp.katanas;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("katanas");


	public static ToolItem KATANA = new SwordItem(KatanaMaterial.INSTANCE, 5, -2F, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.RARE));
	public static Enchantment QUICK = new QuickCutEnchantment();


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("katanas","katana"), KATANA);
		Registry.register(Registry.ENCHANTMENT, new Identifier("katanas", "quick"), QUICK);
//		! Work in progress
	}
}
