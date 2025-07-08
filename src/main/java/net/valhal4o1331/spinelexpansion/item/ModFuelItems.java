package net.valhal4o1331.spinelexpansion.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;

public class ModFuelItems {

    public static void addFuelItems() {
        FuelRegistry.INSTANCE.add(ModItems.REFINED_ANTHRACITE, 30000);
    }

    public static void registerFuelItems() {
        addFuelItems();
        SpinelExpansion.LOGGER.info("Registering Fuel Items for " + SpinelExpansion.MOD_ID);
    }
}
