package net.prangellplays.plasmythicweapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.prangellplays.plasmythicweapons.PlasmythicWeaponries;

public class ModItemGroup {
    public static final ItemGroup PLASMYTHICWEAPONRIES = FabricItemGroupBuilder.build(
            new Identifier(PlasmythicWeaponries.MOD_ID, "plasmythicweaponries"), () -> new ItemStack(ModItems.PLASMYTHIC_CRYSTAL));
}
