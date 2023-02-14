
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.business.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.business.BusinessMod;

public class BusinessModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BusinessMod.MODID);
	public static final RegistryObject<Potion> SEX = REGISTRY.register("sex",
			() -> new Potion(new MobEffectInstance(BusinessModMobEffects.WEED.get(), 3600, 1, false, true),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 3, false, true),
					new MobEffectInstance(MobEffects.BLINDNESS, 5, 0, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 5, 0, false, true)));
}
