package net.icanthink.spacemod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.potion.PotionMidichlorians;
import net.icanthink.spacemod.item.ItemMidichlorianinjectionInjection;
import net.icanthink.spacemod.item.ItemEmptySyringe;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.Collection;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureEmptySyringeRightClickOnBlock extends ElementsSpaceMod.ModElement {
	public ProcedureEmptySyringeRightClickOnBlock(ElementsSpaceMod instance) {
		super(instance, 91);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EmptySyringeRightClickOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionMidichlorians.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemEmptySyringe.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemMidichlorianinjectionInjection.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
