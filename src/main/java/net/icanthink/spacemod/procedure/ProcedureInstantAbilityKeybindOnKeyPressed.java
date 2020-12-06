package net.icanthink.spacemod.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.gui.GuiInstantAbilityGui;
import net.icanthink.spacemod.SpaceMod;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureInstantAbilityKeybindOnKeyPressed extends ElementsSpaceMod.ModElement {
	public ProcedureInstantAbilityKeybindOnKeyPressed(ElementsSpaceMod instance) {
		super(instance, 48);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure InstantAbilityKeybindOnKeyPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure InstantAbilityKeybindOnKeyPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure InstantAbilityKeybindOnKeyPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure InstantAbilityKeybindOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure InstantAbilityKeybindOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(SpaceMod.instance, GuiInstantAbilityGui.GUIID, world, x, y, z);
	}
}
