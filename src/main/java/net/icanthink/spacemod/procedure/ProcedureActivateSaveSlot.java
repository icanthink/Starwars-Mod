package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
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
				if (((((ForceString).substring((int) (fullIndexCounter), (int) ((fullIndexCounter) + 1)))).equals("S"))) {
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("f"))) {
						entity.setFire((int) new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3)))));
						forcePowerRequired = (double) ((forcePowerRequired) + (1 * new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("s"))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 60, (int) new Object() {
								int convert(String s) {
									try {
										return Integer.parseInt(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3)))), (false), (false)));
						forcePowerRequired = (double) ((forcePowerRequired) + (2 * new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("d"))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 60, (int) new Object() {
								int convert(String s) {
									try {
										return Integer.parseInt(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3)))), (false), (false)));
						if ((new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3)))) > 3)) {
							entity.attackEntityFrom(DamageSource.MAGIC, (float) 4);
						}
						forcePowerRequired = (double) ((forcePowerRequired) + (3 * new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))));
					}
					if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("j"))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (int) 20, (int) new Object() {
								int convert(String s) {
									try {
										return Integer.parseInt(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3)))), (false), (false)));
						forcePowerRequired = (double) ((forcePowerRequired) + (3 * new Object() {
							int convert(String s) {
								try {
									return Integer.parseInt(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))));
					}
				}
			}
			if (((((ForceString).substring((int) (fullIndexCounter), (int) ((fullIndexCounter) + 1)))).equals("M"))) {
				if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("e"))) {
					if (!world.isRemote) {
						world.createExplosion(null,
								(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100),
										false, false, true).getBlockPos().getX()),
								(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100),
										false, false, true).getBlockPos().getY()),
								(int) (entity.world
										.rayTraceBlocks(entity.getPositionEyes(1f),
												entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
														entity.getLook(1f).z * 100),
												false, false, true)
										.getBlockPos().getZ()),
								(float) (new Object() {
									int convert(String s) {
										try {
											return Integer.parseInt(s.trim());
										} catch (Exception e) {
										}
										return 0;
									}
								}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3)))) * 4), true);
					}
					forcePowerRequired = (double) ((forcePowerRequired) + (1 * new Object() {
						int convert(String s) {
							try {
								return Integer.parseInt(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))));
				}
				if (((((ForceString).substring((int) ((fullIndexCounter) + 1), (int) ((fullIndexCounter) + 2)))).equals("l"))) {
					for (int index1 = 0; index1 < (int) (new Object() {
						int convert(String s) {
							try {
								return Integer.parseInt(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))); index1++) {
						world.addWeatherEffect(new EntityLightningBolt(world,
								(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100),
										false, false, true).getBlockPos().getX()),
								(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
										entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
												entity.getLook(1f).z * 100),
										false, false, true).getBlockPos().getY()),
								(int) (entity.world
										.rayTraceBlocks(entity.getPositionEyes(1f), entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100,
												entity.getLook(1f).y * 100, entity.getLook(1f).z * 100), false, false, true)
										.getBlockPos().getZ()),
								false));
					}
					forcePowerRequired = (double) ((forcePowerRequired) + (1 * new Object() {
						int convert(String s) {
							try {
								return Integer.parseInt(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(((ForceString).substring((int) ((fullIndexCounter) + 2), (int) ((fullIndexCounter) + 3))))));
				}
			}
			indexCounter = (double) ((indexCounter) + 1);
			if ((2 < (indexCounter))) {
				indexCounter = (double) 0;
			}
			fullIndexCounter = (double) ((fullIndexCounter) + 1);
		}
		System.out.println(((forcePowerRequired) * 10));
		SpaceModVariables.forcePower = (double) ((SpaceModVariables.forcePower) - ((forcePowerRequired) * 10));
		if (((forcePowerRequired) > (forcePower))) {
			entity.attackEntityFrom(DamageSource.MAGIC, (float) ((forcePowerRequired) - (forcePower)));
		}
	}
}
