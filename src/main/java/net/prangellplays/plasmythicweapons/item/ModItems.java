package net.prangellplays.plasmythicweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.plasmythicweapons.PlasmythicWeaponries;
import net.prangellplays.plasmythicweapons.item.custom.ModBloodboundSwordItem;
import net.prangellplays.plasmythicweapons.item.custom.ModPlasmythicScytheItem;

public class ModItems {

    public static final Item BLOOD_STAINED_CRYSTAL = registerItem("blood_stained_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.PLASMYTHICWEAPONRIES)));

    public static final Item PLASMYTHIC_CRYSTAL = registerItem("plasmythic_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.PLASMYTHICWEAPONRIES)));

    public static final Item PLASMYTHIC_SCYTHE = registerItem("plasmythic_scythe",
            new ModPlasmythicScytheItem(ModToolMaterials.Plasmythic,3,   -3f, new FabricItemSettings().group(ModItemGroup.PLASMYTHICWEAPONRIES)));

    public static final Item BLOODBOUND_BLADE = registerItem("bloodbound_blade",
            new ModBloodboundSwordItem(ModToolMaterials.Plasmythic,3,   -3f, new FabricItemSettings().group(ModItemGroup.PLASMYTHICWEAPONRIES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PlasmythicWeaponries.MOD_ID, name), item);
    }

    public static void registerModItems(){ PlasmythicWeaponries.LOGGER.info("Registering Mod Items For" + PlasmythicWeaponries.MOD_ID); }

}
