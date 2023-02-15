
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.business.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.business.item.SuperhandshakerItem;
import net.mcreator.business.item.ShakerItem;
import net.mcreator.business.item.RaperItem;
import net.mcreator.business.item.MagicitemItem;
import net.mcreator.business.item.CumxiCopperSwordItem;
import net.mcreator.business.item.CumxiCopperShovelItem;
import net.mcreator.business.item.CumxiCopperPickaxeItem;
import net.mcreator.business.item.CumxiCopperIngotItem;
import net.mcreator.business.item.CumxiCopperHoeItem;
import net.mcreator.business.item.CumxiCopperAxeItem;
import net.mcreator.business.item.CumxiCopperArmorItem;
import net.mcreator.business.item.CumsteeliumIngotItem;
import net.mcreator.business.item.CumItem;
import net.mcreator.business.item.BusinessItem;
import net.mcreator.business.item.BongItem;
import net.mcreator.business.item.BloodItem;
import net.mcreator.business.item.BloodAlloyItem;
import net.mcreator.business.item.ActualshitItem;
import net.mcreator.business.BusinessMod;

public class BusinessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BusinessMod.MODID);
	public static final RegistryObject<Item> BUSINESS = REGISTRY.register("business", () -> new BusinessItem());
	public static final RegistryObject<Item> MAGICITEM = REGISTRY.register("magicitem", () -> new MagicitemItem());
	public static final RegistryObject<Item> SHAKER = REGISTRY.register("shaker", () -> new ShakerItem());
	public static final RegistryObject<Item> BONG = REGISTRY.register("bong", () -> new BongItem());
	public static final RegistryObject<Item> CUMXI_COPPER_INGOT = REGISTRY.register("cumxi_copper_ingot", () -> new CumxiCopperIngotItem());
	public static final RegistryObject<Item> CUMXI_COPPER_BLOCK = block(BusinessModBlocks.CUMXI_COPPER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CUMXI_COPPER_PICKAXE = REGISTRY.register("cumxi_copper_pickaxe", () -> new CumxiCopperPickaxeItem());
	public static final RegistryObject<Item> CUMXI_COPPER_AXE = REGISTRY.register("cumxi_copper_axe", () -> new CumxiCopperAxeItem());
	public static final RegistryObject<Item> CUMXI_COPPER_SWORD = REGISTRY.register("cumxi_copper_sword", () -> new CumxiCopperSwordItem());
	public static final RegistryObject<Item> CUMXI_COPPER_SHOVEL = REGISTRY.register("cumxi_copper_shovel", () -> new CumxiCopperShovelItem());
	public static final RegistryObject<Item> CUMXI_COPPER_HOE = REGISTRY.register("cumxi_copper_hoe", () -> new CumxiCopperHoeItem());
	public static final RegistryObject<Item> CUMXI_COPPER_ARMOR_HELMET = REGISTRY.register("cumxi_copper_armor_helmet",
			() -> new CumxiCopperArmorItem.Helmet());
	public static final RegistryObject<Item> CUMXI_COPPER_ARMOR_CHESTPLATE = REGISTRY.register("cumxi_copper_armor_chestplate",
			() -> new CumxiCopperArmorItem.Chestplate());
	public static final RegistryObject<Item> CUMXI_COPPER_ARMOR_LEGGINGS = REGISTRY.register("cumxi_copper_armor_leggings",
			() -> new CumxiCopperArmorItem.Leggings());
	public static final RegistryObject<Item> CUMXI_COPPER_ARMOR_BOOTS = REGISTRY.register("cumxi_copper_armor_boots",
			() -> new CumxiCopperArmorItem.Boots());
	public static final RegistryObject<Item> CUMSTEELIUM_INGOT = REGISTRY.register("cumsteelium_ingot", () -> new CumsteeliumIngotItem());
	public static final RegistryObject<Item> CUMSTEELIUM_BLOCK = block(BusinessModBlocks.CUMSTEELIUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CUM_BUCKET = REGISTRY.register("cum_bucket", () -> new CumItem());
	public static final RegistryObject<Item> SUPERHANDSHAKER = REGISTRY.register("superhandshaker", () -> new SuperhandshakerItem());
	public static final RegistryObject<Item> RAPER = REGISTRY.register("raper", () -> new RaperItem());
	public static final RegistryObject<Item> BLOOD_ALLOY = REGISTRY.register("blood_alloy", () -> new BloodAlloyItem());
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	public static final RegistryObject<Item> ACTUALSHIT = REGISTRY.register("actualshit", () -> new ActualshitItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
