package net.mcreator.business.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.network.chat.Component;

import net.mcreator.business.init.BusinessModItems;

public class HandershakererRightclickedaltProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double cumdown = 0;
		if (cumdown == 0) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(5, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(BusinessModItems.MAGICITEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			cumdown = 400;
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Maybe wait for your tool to recover from the light speed handshake first"), (true));
		}
	}
}
