package net.icanthink.spacemod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.icanthink.spacemod.block.BlockLiquidMidichlorians;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureLifeBlockBlockDestroyedByPlayer extends ElementsSpaceMod.ModElement {
	public ProcedureLifeBlockBlockDestroyedByPlayer(ElementsSpaceMod instance) {
		super(instance, 93);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LifeBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LifeBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LifeBlockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LifeBlockBlockDestroyedByPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockLiquidMidichlorians.block.getDefaultState(), 3);
	}
}
