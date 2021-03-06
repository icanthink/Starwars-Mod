package net.icanthink.spacemod.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureForceDimensionPlayerLeavesDimension extends ElementsSpaceMod.ModElement {
	public ProcedureForceDimensionPlayerLeavesDimension(ElementsSpaceMod instance) {
		super(instance, 108);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ForceDimensionPlayerLeavesDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.allowFlying = (false);
			((EntityPlayer) entity).sendPlayerAbilities();
		}
	}
}
