package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.icanthink.spacemod.item.ItemForceXp;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.Iterator;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureForceXpRightClick extends ElementsSpaceMod.ModElement {
	public ProcedureForceXpRightClick(ElementsSpaceMod instance) {
		super(instance, 23);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ForceXpRightClick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachievement1")))
						.isDone()
				: false)) {
			if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
					? ((EntityPlayerMP) entity).getAdvancements()
							.getProgress(((WorldServer) entity.world).getAdvancementManager()
									.getAdvancement(new ResourceLocation("spacemod:forceachivement2")))
							.isDone()
					: false)) {
				if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
						? ((EntityPlayerMP) entity).getAdvancements()
								.getProgress(((WorldServer) entity.world).getAdvancementManager()
										.getAdvancement(new ResourceLocation("spacemod:forceachivement3")))
								.isDone()
						: false)) {
					if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
							? ((EntityPlayerMP) entity).getAdvancements()
									.getProgress(((WorldServer) entity.world).getAdvancementManager()
											.getAdvancement(new ResourceLocation("spacemod:forceachivement4")))
									.isDone()
							: false)) {
						if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
								? ((EntityPlayerMP) entity).getAdvancements()
										.getProgress(((WorldServer) entity.world).getAdvancementManager()
												.getAdvancement(new ResourceLocation("spacemod:forceachievement5")))
										.isDone()
								: false)) {
							if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
									? ((EntityPlayerMP) entity).getAdvancements()
											.getProgress(((WorldServer) entity.world).getAdvancementManager()
													.getAdvancement(new ResourceLocation("spacemod:forceachivement6")))
											.isDone()
									: false)) {
								if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
										? ((EntityPlayerMP) entity).getAdvancements()
												.getProgress(((WorldServer) entity.world).getAdvancementManager()
														.getAdvancement(new ResourceLocation("spacemod:forceachivement7")))
												.isDone()
										: false)) {
									if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
											? ((EntityPlayerMP) entity).getAdvancements()
													.getProgress(((WorldServer) entity.world).getAdvancementManager()
															.getAdvancement(new ResourceLocation("spacemod:forceachivement8")))
													.isDone()
											: false)) {
										if (entity instanceof EntityPlayer)
											((EntityPlayer) entity).addExperienceLevel((int) 30);
									} else {
										if (entity instanceof EntityPlayerMP) {
											Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
													.getAdvancement(new ResourceLocation("spacemod:forceachivement8"));
											AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
											if (!_ap.isDone()) {
												Iterator _iterator = _ap.getRemaningCriteria().iterator();
												while (_iterator.hasNext()) {
													String _criterion = (String) _iterator.next();
													((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
												}
											}
										}
									}
								} else {
									if (entity instanceof EntityPlayerMP) {
										Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
												.getAdvancement(new ResourceLocation("spacemod:forceachivement7"));
										AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
										if (!_ap.isDone()) {
											Iterator _iterator = _ap.getRemaningCriteria().iterator();
											while (_iterator.hasNext()) {
												String _criterion = (String) _iterator.next();
												((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
											}
										}
									}
								}
							} else {
								if (entity instanceof EntityPlayerMP) {
									Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
											.getAdvancement(new ResourceLocation("spacemod:forceachivement6"));
									AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemaningCriteria().iterator();
										while (_iterator.hasNext()) {
											String _criterion = (String) _iterator.next();
											((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
										}
									}
								}
							}
						} else {
							if (entity instanceof EntityPlayerMP) {
								Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
										.getAdvancement(new ResourceLocation("spacemod:forceachievement5"));
								AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemaningCriteria().iterator();
									while (_iterator.hasNext()) {
										String _criterion = (String) _iterator.next();
										((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
									}
								}
							}
						}
					} else {
						if (entity instanceof EntityPlayerMP) {
							Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
									.getAdvancement(new ResourceLocation("spacemod:forceachivement4"));
							AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemaningCriteria().iterator();
								while (_iterator.hasNext()) {
									String _criterion = (String) _iterator.next();
									((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
								}
							}
						}
					}
				} else {
					if (entity instanceof EntityPlayerMP) {
						Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement3"));
						AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemaningCriteria().iterator();
							while (_iterator.hasNext()) {
								String _criterion = (String) _iterator.next();
								((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
							}
						}
					}
				}
			} else {
				if (entity instanceof EntityPlayerMP) {
					Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
							.getAdvancement(new ResourceLocation("spacemod:forceachivement2"));
					AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemaningCriteria().iterator();
						while (_iterator.hasNext()) {
							String _criterion = (String) _iterator.next();
							((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
						}
					}
				}
			}
		} else {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("spacemod:forceachievement1"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemForceXp.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
