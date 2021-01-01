package net.icanthink.spacemod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.world.WorldForceDimension;
import net.icanthink.spacemod.item.ItemStoneOfTheForce;
import net.icanthink.spacemod.item.ItemStoneOfDimensions;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureStoneOfDimensionsRightClickedInAir extends ElementsSpaceMod.ModElement {
	public ProcedureStoneOfDimensionsRightClickedInAir(ElementsSpaceMod instance) {
		super(instance, 133);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StoneOfDimensionsRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.dimension) == (WorldForceDimension.DIMID))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemStoneOfDimensions.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfTheForce.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
