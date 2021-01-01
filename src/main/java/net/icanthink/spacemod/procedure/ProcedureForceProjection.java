package net.icanthink.spacemod.procedure;

import net.minecraft.world.GameType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureForceProjection extends ElementsSpaceMod.ModElement {
	public ProcedureForceProjection(ElementsSpaceMod instance) {
		super(instance, 65);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ForceProjection!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 20000000, (int) 255, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 20000000, (int) 2, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 20000000, (int) 255, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 20000000, (int) 255, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 20000000, (int) 255, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, (int) 20000000, (int) 255, (false), (false)));
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.disableDamage = (true);
			((EntityPlayer) entity).sendPlayerAbilities();
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.ADVENTURE);
		entity.getEntityData().setBoolean("forceProject", (true));
	}
}
