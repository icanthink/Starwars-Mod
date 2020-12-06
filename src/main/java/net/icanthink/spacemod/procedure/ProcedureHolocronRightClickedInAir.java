package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.potion.PotionMidichlorians;
import net.icanthink.spacemod.gui.GuiForceAbilitiesUpgrade;
import net.icanthink.spacemod.gui.GuiForceAbilities;
import net.icanthink.spacemod.SpaceMod;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.Collection;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureHolocronRightClickedInAir extends ElementsSpaceMod.ModElement {
	public ProcedureHolocronRightClickedInAir(ElementsSpaceMod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HolocronRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure HolocronRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure HolocronRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure HolocronRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure HolocronRightClickedInAir!");
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
								.getAdvancement(new ResourceLocation("spacemod:forceachievement1")))
						.isDone()
				: false)) {
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
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).openGui(SpaceMod.instance, GuiForceAbilitiesUpgrade.GUIID, world, x, y, z);
			} else {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).openGui(SpaceMod.instance, GuiForceAbilities.GUIID, world, x, y, z);
			}
		}
	}
}
