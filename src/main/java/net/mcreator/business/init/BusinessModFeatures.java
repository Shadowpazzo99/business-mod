
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.business.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.business.world.features.lakes.CumFeature;
import net.mcreator.business.BusinessMod;

@Mod.EventBusSubscriber
public class BusinessModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BusinessMod.MODID);
	public static final RegistryObject<Feature<?>> CUM = REGISTRY.register("cum", CumFeature::feature);
}
