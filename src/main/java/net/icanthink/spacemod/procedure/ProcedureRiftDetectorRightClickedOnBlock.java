package net.icanthink.spacemod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.potion.PotionMidichlorians;
import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.Collection;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureRiftDetectorRightClickedOnBlock extends ElementsSpaceMod.ModElement {
	public ProcedureRiftDetectorRightClickedOnBlock(ElementsSpaceMod instance) {
		super(instance, 114);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RiftDetectorRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RiftDetectorRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double distance = 0;
		if ((((entity.posX) == (SpaceModVariables.WorldVariables.get(world).riftX))
				&& ((entity.posZ) == (SpaceModVariables.WorldVariables.get(world).riftY)))) {
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("You are standing on the rift"), (true));
			}
		} else {
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
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Rift detected 0 blocks away"), (true));
				}
			} else {
				if (((SpaceModVariables.WorldVariables.get(world).riftX) == 0)) {
					SpaceModVariables.WorldVariables.get(world).riftX = (double) Math.round(((Math.random() - 0.5) * 1000));
					SpaceModVariables.WorldVariables.get(world).syncData(world);
				}
				if (((SpaceModVariables.WorldVariables.get(world).riftY) == 0)) {
					SpaceModVariables.WorldVariables.get(world).riftY = (double) Math.round(((Math.random() - 0.5) * 1000));
					SpaceModVariables.WorldVariables.get(world).syncData(world);
				}
				distance = (double) Math.sqrt((Math.pow(((SpaceModVariables.WorldVariables.get(world).riftX) - (entity.posX)), 2)
						+ Math.pow(((SpaceModVariables.WorldVariables.get(world).riftY) - (entity.posZ)), 2)));
				if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false)) {
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity)
								.sendStatusMessage(
										new TextComponentString(
												(("Rift at ") + ""
														+ ((((new java.text.DecimalFormat("##.##")
																.format((SpaceModVariables.WorldVariables.get(world).riftX))))
																+ ""
																+ (((", ") + ""
																		+ ((new java.text.DecimalFormat("##.##")
																				.format((SpaceModVariables.WorldVariables.get(world).riftY)))))))))),
										(true));
					}
				} else {
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
								(("Rift detected ") + "" + ((((new java.text.DecimalFormat("##.##").format((distance)))) + "" + (" blocks away"))))),
								(true));
					}
				}
			}
		}
	}
}
