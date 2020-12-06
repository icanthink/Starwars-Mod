package net.icanthink.spacemod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemPlayerTarget;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedurePlayerTargetItemInInventoryTick extends ElementsSpaceMod.ModElement {
	public ProcedurePlayerTargetItemInInventoryTick(ElementsSpaceMod instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlayerTargetItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemPlayerTarget.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
