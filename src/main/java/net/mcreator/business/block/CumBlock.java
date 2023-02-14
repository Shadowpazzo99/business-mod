
package net.mcreator.business.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.business.init.BusinessModFluids;

public class CumBlock extends LiquidBlock {
	public CumBlock() {
		super(() -> BusinessModFluids.CUM.get(), BlockBehaviour.Properties.of(Material.WATER).strength(75.5f).noCollission().noLootTable());
	}
}
