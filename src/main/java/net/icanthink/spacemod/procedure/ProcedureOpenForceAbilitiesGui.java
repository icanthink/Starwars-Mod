package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.potion.PotionMidichlorians;
import net.icanthink.spacemod.item.ItemPowerModifier;
import net.icanthink.spacemod.item.ItemPositiveModifier;
import net.icanthink.spacemod.item.ItemPlayerTarget;
import net.icanthink.spacemod.item.ItemNegativeModifier;
import net.icanthink.spacemod.gui.GuiForceGhostGui;
import net.icanthink.spacemod.gui.GuiForceAbilitiesUpgrade;
import net.icanthink.spacemod.gui.GuiForceAbilities;
import net.icanthink.spacemod.SpaceMod;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.Collection;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureOpenForceAbilitiesGui extends ElementsSpaceMod.ModElement {
	public ProcedureOpenForceAbilitiesGui(ElementsSpaceMod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenForceAbilitiesGui!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenForceAbilitiesGui!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenForceAbilitiesGui!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenForceAbilitiesGui!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenForceAbilitiesGui!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity.getEntityData().getBoolean("forceGhost")) == (false))) {
			if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
					? ((EntityPlayerMP) entity).getAdvancements()
							.getProgress(((WorldServer) entity.world).getAdvancementManager()
									.getAdvancement(new ResourceLocation("spacemod:forceachivement4")))
							.isDone()
					: false)) {
				if (((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
						? ((EntityPlayerMP) entity).getAdvancements()
								.getProgress(((WorldServer) entity.world).getAdvancementManager()
										.getAdvancement(new ResourceLocation("spacemod:forceachivement9")))
								.isDone()
						: false) || (new Object() {
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
						}.check()))) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).openGui(SpaceMod.instance, GuiForceAbilitiesUpgrade.GUIID, world, x, y, z);
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(ItemPlayerTarget.block, (int) (1));
								_setstack.setCount(1);
								((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
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
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
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
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(ItemPowerModifier.block, (int) (1));
								_setstack.setCount(1);
								((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).openGui(SpaceMod.instance, GuiForceAbilities.GUIID, world, x, y, z);
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(ItemPlayerTarget.block, (int) (1));
								_setstack.setCount(1);
								((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else {
			if (((entity.dimension) == 6)) {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureSwitchRealityOnPress.executeProcedure($_dependencies);
				}
			} else {
				if ((entity.getEntityData().getBoolean("forceProject"))) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).setGameType(GameType.SPECTATOR);
					entity.getEntityData().setBoolean("forceProject", (false));
				} else {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).setGameType(GameType.SPECTATOR);
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).openGui(SpaceMod.instance, GuiForceGhostGui.GUIID, world, x, y, z);
				}
			}
		}
	}
}
