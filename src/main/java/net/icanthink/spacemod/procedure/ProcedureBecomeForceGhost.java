package net.icanthink.spacemod.procedure;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureBecomeForceGhost extends ElementsSpaceMod.ModElement {
	public ProcedureBecomeForceGhost(ElementsSpaceMod instance) {
		super(instance, 61);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BecomeForceGhost!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.SPECTATOR);
		entity.getEntityData().setBoolean("forceGhost", (true));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
