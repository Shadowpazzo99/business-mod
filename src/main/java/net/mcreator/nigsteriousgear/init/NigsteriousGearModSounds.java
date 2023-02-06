
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nigsteriousgear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.nigsteriousgear.NigsteriousGearMod;

public class NigsteriousGearModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NigsteriousGearMod.MODID);
	public static final RegistryObject<SoundEvent> BUSINESS = REGISTRY.register("business",
			() -> new SoundEvent(new ResourceLocation("nigsterious_gear", "business")));
}
