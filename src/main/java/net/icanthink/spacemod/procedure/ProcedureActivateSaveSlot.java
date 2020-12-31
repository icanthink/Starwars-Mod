package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureActivateSaveSlot extends ElementsSpaceMod.ModElement {
	public ProcedureActivateSaveSlot(ElementsSpaceMod instance) {
		super(instance, 49);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ActivateSaveSlot!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ActivateSaveSlot!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		String ForceString = "";
		double indexCounter = 0;
		double fullIndexCounter = 0;
		double forcePowerRequired = 0;
		double forcePower = 0;
		double effectLevel = 0;
		indexCounter = (double) 0;
		fullIndexCounter = (double) 0;
		forcePowerRequired = (double) 0;
		if (((SpaceModVariables.ForceAbilitySelected) == 0)) {
			ForceString = (String) (SpaceModVariables.ForceSlot1);
		}
		if (((SpaceModVariables.ForceAbilitySelected) == 1)) {
			ForceString = (String) (SpaceModVariables.ForceSlot2);
		}
		if (((SpaceModVariables.ForceAbilitySelected) == 2)) {
			ForceString = (String) (SpaceModVariables.ForceSlot3);
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachievement1")))
						.isDone()
				: false)) {
			forcePower = (double) 1;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement2")))
						.isDone()
				: false)) {
			forcePower = (double) 2;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement3")))
						.isDone()
				: false)) {
			forcePower = (double) 3;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement4")))
						.isDone()
				: false)) {
			forcePower = (double) 4;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachievement5")))
						.isDone()
				: false)) {
			forcePower = (double) 5;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement6")))
						.isDone()
				: false)) {
			forcePower = (double) 6;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement7")))
						.isDone()
				: false)) {
			forcePower = (double) 7;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement8")))
						.isDone()
				: false)) {
			forcePower = (double) 10;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement9")))
						.isDone()
				: false)) {
			forcePower = (double) 11;
		}
		for (int index0 = 0; index0 < (int) (((ForceString)).length()); index0++) {
			if (((indexCounter) == 0)) {
				effectLevel = (double) new Object() {
					int convert(String s) {
						try {
							return Integer.parseInt(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))));
				if (((((ForceString).substring((int) (fullIndexCounter), (int) ((fullIndexCounter) + 1)))).equals("S"))) {
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("f"))) {
						entity.setFire((int) (effectLevel));
						forcePowerRequired = (double) ((forcePowerRequired) + (1 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("s"))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity)
									.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 60, (int) (effectLevel), (false), (false)));
						forcePowerRequired = (double) ((forcePowerRequired) + (2 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("d"))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity)
									.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 60, (int) (effectLevel), (false), (false)));
						if (((effectLevel) > 3)) {
							entity.attackEntityFrom(DamageSource.MAGIC, (float) 4);
						}
						forcePowerRequired = (double) ((forcePowerRequired) + (3 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("j"))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(
									new PotionEffect(MobEffects.JUMP_BOOST, (int) (10 * (effectLevel)), (int) (2 * (effectLevel)), (false), (false)));
						forcePowerRequired = (double) ((forcePowerRequired) + (0.5 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("e"))) {
						if (!world.isRemote) {
							world.createExplosion(null, (int) (entity.posX), (int) (entity.posY), (int) (entity.posZ), (float) ((effectLevel) * 4),
									true);
						}
						forcePowerRequired = (double) ((forcePowerRequired) + (0.1 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("l"))) {
						for (int index1 = 0; index1 < (int) ((effectLevel)); index1++) {
							world.addWeatherEffect(
									new EntityLightningBolt(world, (int) (entity.posX), (int) (entity.posY), (int) (entity.posZ), false));
						}
						forcePowerRequired = (double) ((forcePowerRequired) + (1 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("v"))) {
						entity.fallDistance = (float) (0);
						entity.motionX = 0;
						entity.motionY = 0;
						entity.motionZ = 0;
						forcePowerRequired = (double) ((forcePowerRequired) + 2);
					}
				}
				if (((((ForceString).substring((int) (fullIndexCounter), (int) ((fullIndexCounter) + 1)))).equals("M"))) {
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("e"))) {
						if (world instanceof WorldServer)
							((WorldServer) world).spawnParticle(EnumParticleTypes.DRAGON_BREATH, (entity.posX), (entity.posY), (entity.posZ),
									(int) 100, 3, 3, 3, 20, new int[0]);
						if (world instanceof WorldServer)
							((WorldServer) world).spawnParticle(EnumParticleTypes.DRAGON_BREATH,
									(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * ((effectLevel) * 20),
													entity.getLook(1f).y * ((effectLevel) * 20), entity.getLook(1f).z * ((effectLevel) * 20)),
											false, false, true).getBlockPos().getX()),
									(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * ((effectLevel) * 20),
													entity.getLook(1f).y * ((effectLevel) * 20), entity.getLook(1f).z * ((effectLevel) * 20)),
											false, false, true).getBlockPos().getY()),
									(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
											entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * ((effectLevel) * 20),
													entity.getLook(1f).y * ((effectLevel) * 20), entity.getLook(1f).z * ((effectLevel) * 20)),
											false, false, true).getBlockPos().getZ()),
									(int) 100, 3, 3, 3, 20, new int[0]);
						entity.setPositionAndUpdate(
								(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * ((effectLevel) * 20),
												entity.getLook(1f).y * ((effectLevel) * 20), entity.getLook(1f).z * ((effectLevel) * 20)),
										false, false, true).getBlockPos().getX()),
								(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * ((effectLevel) * 20),
												entity.getLook(1f).y * ((effectLevel) * 20), entity.getLook(1f).z * ((effectLevel) * 20)),
										false, false, true).getBlockPos().getY()),
								(entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * ((effectLevel) * 20),
												entity.getLook(1f).y * ((effectLevel) * 20), entity.getLook(1f).z * ((effectLevel) * 20)),
										false, false, true).getBlockPos().getZ()));
						forcePowerRequired = (double) ((forcePowerRequired) + (1 * (effectLevel)));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("l"))) {
						for (int index2 = 0; index2 < (int) ((effectLevel)); index2++) {
							world.addWeatherEffect(
									new EntityLightningBolt(world,
											(int) (entity.world
													.rayTraceBlocks(entity.getPositionEyes(1f),
															entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100,
																	entity.getLook(1f).y * 100, entity.getLook(1f).z * 100),
															false, false, true)
													.getBlockPos().getX()),
											(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
													entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
															entity.getLook(1f).z * 100),
													false, false, true).getBlockPos().getY()),
											(int) (entity.world
													.rayTraceBlocks(entity.getPositionEyes(1f),
															entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100,
																	entity.getLook(1f).y * 100, entity.getLook(1f).z * 100),
															false, false, true)
													.getBlockPos().getZ()),
											false));
						}
						forcePowerRequired = (double) ((forcePowerRequired) + (4 * (effectLevel)));
					}
				}
				indexCounter = (double) ((indexCounter) + 1);
				if ((2 < (indexCounter))) {
					indexCounter = (double) 0;
				}
				fullIndexCounter = (double) ((fullIndexCounter) + 1);
			}
		}
		if ((((forcePowerRequired) - ((forcePower) / 2)) < 1)) {
			SpaceModVariables.forcePower = (double) ((SpaceModVariables.forcePower) - 1);
		} else {
			SpaceModVariables.forcePower = (double) ((SpaceModVariables.forcePower) - (((forcePowerRequired) - ((forcePower) / 2)) * 10));
		}
	}
}
