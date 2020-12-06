package net.icanthink.spacemod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemFireModifier;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureFireModifierItemInInventoryTick extends ElementsSpaceMod.ModElement {
	public ProcedureFireModifierItemInInventoryTick(ElementsSpaceMod instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireModifierItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemFireModifier.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
