package net.prangellplays.plasmythicweapons;

import net.fabricmc.api.ModInitializer;
import net.prangellplays.plasmythicweapons.item.ModItems;
import net.prangellplays.plasmythicweapons.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlasmythicWeaponries implements ModInitializer {
	public static final String MOD_ID = "plasmythicweapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
	}
}
