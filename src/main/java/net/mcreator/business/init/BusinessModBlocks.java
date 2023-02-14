
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.business.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.business.block.CumxiCopperBlockBlock;
import net.mcreator.business.block.CumsteeliumBlockBlock;
import net.mcreator.business.block.CumBlock;
import net.mcreator.business.BusinessMod;

public class BusinessModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BusinessMod.MODID);
	public static final RegistryObject<Block> CUMXI_COPPER_BLOCK = REGISTRY.register("cumxi_copper_block", () -> new CumxiCopperBlockBlock());
	public static final RegistryObject<Block> CUMSTEELIUM_BLOCK = REGISTRY.register("cumsteelium_block", () -> new CumsteeliumBlockBlock());
	public static final RegistryObject<Block> CUM = REGISTRY.register("cum", () -> new CumBlock());
}
