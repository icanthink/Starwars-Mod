package net.icanthink.spacemod.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.icanthink.spacemod.ElementsSpaceMod;

import java.util.Iterator;

@ElementsSpaceMod.ModElement.Tag
public class ProcedurePermanentMidichlorianInjectionRightClickedInAir extends ElementsSpaceMod.ModElement {
	public ProcedurePermanentMidichlorianInjectionRightClickedInAir(ElementsSpaceMod instance) {
		super(instance, 37);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PermanentMidichlorianInjectionRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement8")))
						.isDone()
				: false)) {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("spacemod:forceachivement9"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		} else {
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 20);
		}
	}
}
