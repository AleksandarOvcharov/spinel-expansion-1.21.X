package net.valhal4o1331.spinelexpansion;

import net.fabricmc.api.ModInitializer;

import net.valhal4o1331.spinelexpansion.block.ModBlocks;
import net.valhal4o1331.spinelexpansion.item.ModFuelItems;
import net.valhal4o1331.spinelexpansion.item.ModItemGroups;
import net.valhal4o1331.spinelexpansion.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpinelExpansion implements ModInitializer {
	public static final String MOD_ID = "spinelexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuelItems.registerFuelItems();

	}
}