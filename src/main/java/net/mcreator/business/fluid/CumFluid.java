
package net.mcreator.business.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.business.init.BusinessModItems;
import net.mcreator.business.init.BusinessModFluids;
import net.mcreator.business.init.BusinessModFluidTypes;
import net.mcreator.business.init.BusinessModBlocks;

public abstract class CumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BusinessModFluidTypes.CUM_TYPE.get(),
			() -> BusinessModFluids.CUM.get(), () -> BusinessModFluids.FLOWING_CUM.get()).explosionResistance(75.5f).tickRate(15)
			.bucket(() -> BusinessModItems.CUM_BUCKET.get()).block(() -> (LiquidBlock) BusinessModBlocks.CUM.get());

	private CumFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SMOKE;
	}

	public static class Source extends CumFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CumFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
