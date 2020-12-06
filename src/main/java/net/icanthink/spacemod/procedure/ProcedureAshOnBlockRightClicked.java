package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemPositiveModifier;
import net.icanthink.spacemod.item.ItemNegativeModifier;
import net.icanthink.spacemod.gui.GuiInfuserGui;
import net.icanthink.spacemod.SpaceMod;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureAshOnBlockRightClicked extends ElementsSpaceMod.ModElement {
	public ProcedureAshOnBlockRightClicked(ElementsSpaceMod instance) {
		super(instance, 41);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AshOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AshOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AshOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AshOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AshOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement4")))
						.isDone()
				: false)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(SpaceMod.instance, GuiInfuserGui.GUIID, world, x, y, z);
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemNegativeModifier.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemPositiveModifier.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemNegativeModifier.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(ItemPositiveModifier.block, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		} else {
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 4);
		}
	}
}
