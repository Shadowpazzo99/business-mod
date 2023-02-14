
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.business.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.business.potion.WeedMobEffect;
import net.mcreator.business.BusinessMod;

public class BusinessModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BusinessMod.MODID);
	public static final RegistryObject<MobEffect> WEED = REGISTRY.register("weed", () -> new WeedMobEffect());
}
