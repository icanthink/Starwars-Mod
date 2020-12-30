package net.icanthink.spacemod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.GuiTextField;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureForceEnchanterGo extends ElementsSpaceMod.ModElement {
	public ProcedureForceEnchanterGo(ElementsSpaceMod instance) {
		super(instance, 105);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ForceEnchanterGo!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure ForceEnchanterGo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		double enchantmentLocation = 0;
		if (((((new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).hasTagCompound() ? (new Object() {
			public ItemStack getItemStack(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getTagCompound().getString((("forceEnchantTrigger") + "" + ((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:enchantId");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())))) : "")).length() < 1000)) {
			SpaceModVariables.ForceSlot1 = (String) "forceEnchantTrigger";
		}
	}
}
