package net.icanthink.spacemod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureUnlockForceAbility extends ElementsSpaceMod.ModElement {
	public ProcedureUnlockForceAbility(ElementsSpaceMod instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UnlockForceAbility!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) == 1)) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
