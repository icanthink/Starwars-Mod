package net.icanthink.spacemod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemVisionModifier;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureVisionModifierItemInInventoryTick extends ElementsSpaceMod.ModElement {
	public ProcedureVisionModifierItemInInventoryTick(ElementsSpaceMod instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VisionModifierItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemVisionModifier.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
