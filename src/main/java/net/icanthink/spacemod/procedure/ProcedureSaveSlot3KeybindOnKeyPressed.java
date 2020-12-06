package net.icanthink.spacemod.procedure;

import net.minecraft.entity.Entity;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureSaveSlot3KeybindOnKeyPressed extends ElementsSpaceMod.ModElement {
	public ProcedureSaveSlot3KeybindOnKeyPressed(ElementsSpaceMod instance) {
		super(instance, 52);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SaveSlot3KeybindOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		SpaceModVariables.ForceAbilitySelected = (double) 2;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			ProcedureActivateSaveSlot.executeProcedure($_dependencies);
		}
	}
}
