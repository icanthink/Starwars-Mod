package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.potion.PotionMidichlorians;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.Collection;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureDuplicateLastButtonPressed extends ElementsSpaceMod.ModElement {
	public ProcedureDuplicateLastButtonPressed(ElementsSpaceMod instance) {
		super(instance, 109);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DuplicateLastButtonPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double target = 0;
		if (((new Object() {
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
		}.check()) || (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement9")))
						.isDone()
				: false))) {
			target = (double) 107;
			if (((target) == 99)) {
				target = (double) 116;
			}
			for (int index0 = 0; index0 < (int) (16); index0++) {
				if ((!((new Object() {
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
				}.getItemStack((int) ((target)))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
					target = (double) ((target) - 1);
				}
			}
			if (((target) == 116)) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = (new Object() {
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
							}.getItemStack((int) (100)));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) ((target)))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = (new Object() {
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
							}.getItemStack((int) (((target) + 1))));
							_setstack.setCount(1);
							((Slot) ((Map) invobj).get((int) ((target)))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		} else {
			target = (double) 107;
			for (int index1 = 0; index1 < (int) (8); index1++) {
				if ((!((new Object() {
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
				}.getItemStack((int) ((target)))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
					target = (double) ((target) - 1);
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = (new Object() {
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
						}.getItemStack((int) (((target) + 1))));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) ((target)))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
