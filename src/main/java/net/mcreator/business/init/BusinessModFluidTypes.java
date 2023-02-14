
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.business.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.business.fluid.types.CumFluidType;
import net.mcreator.business.BusinessMod;

public class BusinessModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BusinessMod.MODID);
	public static final RegistryObject<FluidType> CUM_TYPE = REGISTRY.register("cum", () -> new CumFluidType());
}
