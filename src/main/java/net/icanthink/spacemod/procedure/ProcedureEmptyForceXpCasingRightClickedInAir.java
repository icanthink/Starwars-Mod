package net.icanthink.spacemod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemForceXp;
import net.icanthink.spacemod.item.ItemEmptyForceXpCasing;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.Random;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureEmptyForceXpCasingRightClickedInAir extends ElementsSpaceMod.ModElement {
	public ProcedureEmptyForceXpCasingRightClickedInAir(ElementsSpaceMod instance) {
		super(instance, 71);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmptyForceXpCasingRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure EmptyForceXpCasingRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((30 <= ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).experienceLevel : 0))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).addExperienceLevel(-((int) 30));
			if (itemstack.attemptDamageItem((int) 23, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEmptyForceXpCasing.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemForceXp.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
