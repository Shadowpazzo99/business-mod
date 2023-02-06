
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nigsteriousgear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.nigsteriousgear.item.MagicitemItem;
import net.mcreator.nigsteriousgear.item.HandshakerItem;
import net.mcreator.nigsteriousgear.item.BusinessItem;
import net.mcreator.nigsteriousgear.NigsteriousGearMod;

public class NigsteriousGearModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NigsteriousGearMod.MODID);
	public static final RegistryObject<Item> BUSINESS = REGISTRY.register("business", () -> new BusinessItem());
	public static final RegistryObject<Item> MAGICITEM = REGISTRY.register("magicitem", () -> new MagicitemItem());
	public static final RegistryObject<Item> HANDSHAKER = REGISTRY.register("handshaker", () -> new HandshakerItem());
}
