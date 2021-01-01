package net.icanthink.spacemod.procedure;

import net.minecraft.world.World;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureSetRiftCommandExecuted extends ElementsSpaceMod.ModElement {
	public ProcedureSetRiftCommandExecuted(ElementsSpaceMod instance) {
		super(instance, 120);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SetRiftCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SetRiftCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SetRiftCommandExecuted!");
			return;
		}
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		SpaceModVariables.WorldVariables.get(world).riftX = (double) x;
		SpaceModVariables.WorldVariables.get(world).syncData(world);
		SpaceModVariables.WorldVariables.get(world).riftY = (double) z;
		SpaceModVariables.WorldVariables.get(world).syncData(world);
	}
}
