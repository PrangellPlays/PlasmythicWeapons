package net.prangellplays.plasmythicweapons.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ModPlasmythicScytheItem extends SwordItem {
    public ModPlasmythicScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 240, 1));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 240, 4));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 240, 244));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 240, 244));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 240, 244));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 240, 244));
        user.getItemCooldownManager().set(this, 2400);

        return TypedActionResult.success(itemStack, world.isClient());
    }


}