package net.icanthink.spacemod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.potion.PotionMidichlorians;
import net.icanthink.spacemod.item.ItemVisionModifier;
import net.icanthink.spacemod.item.ItemTimeModifier;
import net.icanthink.spacemod.item.ItemPowerModifier;
import net.icanthink.spacemod.item.ItemPositiveModifier;
import net.icanthink.spacemod.item.ItemPlayerTarget;
import net.icanthink.spacemod.item.ItemNegativeModifier;
import net.icanthink.spacemod.item.ItemFireModifier;
import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.Collection;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureUseAbility extends ElementsSpaceMod.ModElement {
	public ProcedureUseAbility(ElementsSpaceMod instance) {
		super(instance, 17);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UseAbility!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure UseAbility!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double loopIndex = 0;
		double power = 0;
		double effectTIme = 0;
		double forceLevel = 0;
		double forceLevelRequired = 0;
		double slots = 0;
		loopIndex = (double) 100;
		power = (double) 0;
		effectTIme = (double) 1;
		slots = (double) 8;
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachievement1")))
						.isDone()
				: false)) {
			forceLevel = (double) 1;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement2")))
						.isDone()
				: false)) {
			forceLevel = (double) 2;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement3")))
						.isDone()
				: false)) {
			forceLevel = (double) 3;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement4")))
						.isDone()
				: false)) {
			forceLevel = (double) 4;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachievement5")))
						.isDone()
				: false)) {
			forceLevel = (double) 5;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement6")))
						.isDone()
				: false)) {
			forceLevel = (double) 6;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement7")))
						.isDone()
				: false)) {
			forceLevel = (double) 7;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement8")))
						.isDone()
				: false)) {
			forceLevel = (double) 10;
		}
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement9")))
						.isDone()
				: false)) {
			forceLevel = (double) 11;
			slots = (double) 15;
		}
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
			slots = (double) 15;
		}
		if (((entity.dimension) == 6)) {
			forceLevel = (double) 100;
		}
		for (int index0 = 0; index0 < (int) ((slots)); index0++) {
			if ((new ItemStack(ItemTimeModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) ((loopIndex)))).getItem())) {
				effectTIme = (double) (1 + (effectTIme));
				forceLevelRequired = (double) (1 + (forceLevelRequired));
			}
			loopIndex = (double) (1 + (loopIndex));
		}
		loopIndex = (double) 100;
		for (int index1 = 0; index1 < (int) ((slots)); index1++) {
			if ((new ItemStack(ItemPositiveModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) ((loopIndex)))).getItem())) {
				power = (double) (1 + (power));
				forceLevelRequired = (double) (1 + (forceLevelRequired));
			}
			if ((new ItemStack(ItemNegativeModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) ((loopIndex)))).getItem())) {
				power = (double) ((power) - 1);
				forceLevelRequired = (double) (1 + (forceLevelRequired));
			}
			loopIndex = (double) (1 + (loopIndex));
		}
		if ((new ItemStack(ItemPlayerTarget.block, (int) (1)).getItem() == (new Object() {
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
		}.getItemStack((int) (108))).getItem())) {
			if ((new ItemStack(ItemPositiveModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (107))).getItem())) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity)
							.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) (50 * (power)), (int) 0, (false), (false)));
				forceLevelRequired = (double) (1 + (forceLevelRequired));
			}
			if ((new ItemStack(ItemNegativeModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (107))).getItem())) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity)
							.addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) (-50 * (power)), (int) 0, (false), (false)));
				forceLevelRequired = (double) (1 + (forceLevelRequired));
			}
			if ((new ItemStack(ItemPowerModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (107))).getItem())) {
				forceLevelRequired = (double) (1 + (forceLevelRequired));
				if ((new ItemStack(Items.DIAMOND_SWORD, (int) (1)).getItem() == (new Object() {
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
				}.getItemStack((int) (106))).getItem())) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity)
								.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) ((effectTIme) * 600), (int) (power), (false), (false)));
					forceLevelRequired = (double) (1 + (forceLevelRequired));
				} else {
					if ((new ItemStack(ItemFireModifier.block, (int) (1)).getItem() == (new Object() {
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
					}.getItemStack((int) (106))).getItem())) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(
									new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) ((effectTIme) * 600), (int) (power), (false), (false)));
						forceLevelRequired = (double) (1 + (forceLevelRequired));
					} else {
						if ((3 < (power))) {
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity).addPotionEffect(
										new PotionEffect(MobEffects.RESISTANCE, (int) ((effectTIme) * 600), (int) (power), (false), (false)));
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity).addPotionEffect(
										new PotionEffect(MobEffects.SLOWNESS, (int) ((effectTIme) * 600), (int) 255, (false), (false)));
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity).addPotionEffect(
										new PotionEffect(MobEffects.WEAKNESS, (int) ((effectTIme) * 600), (int) 255, (false), (false)));
						} else {
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity).addPotionEffect(
										new PotionEffect(MobEffects.RESISTANCE, (int) ((effectTIme) * 600), (int) (power), (false), (false)));
						}
					}
				}
			}
			if ((new ItemStack(ItemFireModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (107))).getItem())) {
				if ((new ItemStack(ItemNegativeModifier.block, (int) (1)).getItem() == (new Object() {
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
				}.getItemStack((int) (106))).getItem())) {
					entity.extinguish();
				} else {
					forceLevelRequired = (double) (1 + (forceLevelRequired));
					entity.setFire((int) (15 * (effectTIme)));
				}
			}
			if ((new ItemStack(ItemVisionModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (107))).getItem())) {
				forceLevelRequired = (double) (1 + (forceLevelRequired));
				if ((new ItemStack(ItemPositiveModifier.block, (int) (1)).getItem() == (new Object() {
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
				}.getItemStack((int) (106))).getItem())) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(
								new PotionEffect(MobEffects.NIGHT_VISION, (int) ((effectTIme) * 600), (int) (power), (false), (false)));
					forceLevelRequired = (double) (1 + (forceLevelRequired));
				}
				if ((new ItemStack(ItemNegativeModifier.block, (int) (1)).getItem() == (new Object() {
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
				}.getItemStack((int) (106))).getItem())) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity)
								.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) ((effectTIme) * 600), (int) (power), (false), (false)));
					forceLevelRequired = (double) (1 + (forceLevelRequired));
				}
			}
		}
		if ((new ItemStack(Items.BUCKET, (int) (1)).getItem() == (new Object() {
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
		}.getItemStack((int) (108))).getItem())) {
			if ((new ItemStack(ItemFireModifier.block, (int) (1)).getItem() == (new Object() {
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
			}.getItemStack((int) (107))).getItem())) {
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(Items.LAVA_BUCKET, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
			}
		}
		forceLevelRequired = (double) (((SpaceModVariables.MapVariables.get(world).ForceStrength) / 20) + (forceLevelRequired));
		if (((forceLevelRequired) > (forceLevel))) {
			entity.attackEntityFrom(DamageSource.MAGIC, (float) (((forceLevelRequired) - (forceLevel)) * 10));
		}
		loopIndex = (double) 100;
		for (int index2 = 0; index2 < (int) ((slots)); index2++) {
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Blocks.AIR, (int) (1));
						_setstack.setCount(1);
						((Slot) ((Map) invobj).get((int) ((loopIndex)))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			loopIndex = (double) (1 + (loopIndex));
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
