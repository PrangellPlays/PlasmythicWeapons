package net.prangellplays.plasmythicweapons.mixin;

import net.prangellplays.plasmythicweapons.PlasmythicWeaponries;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class PlasmythicWeaponriesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		PlasmythicWeaponries.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
