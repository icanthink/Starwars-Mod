package net.icanthink.spacemod.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureOnTick extends ElementsSpaceMod.ModElement {
	public ProcedureOnTick(ElementsSpaceMod instance) {
		super(instance, 111);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OnTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OnTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		SpaceModVariables.RechargeCounter = (double) ((SpaceModVariables.RechargeCounter) + 1);
		if (((SpaceModVariables.RechargeCounter) > 20)) {
			SpaceModVariables.RechargeCounter = (double) 0;
		}
		if ((((SpaceModVariables.RechargeCounter) > 10) && (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement3")))
						.isDone()
				: false))) {
			SpaceModVariables.RechargeCounter = (double) 0;
		}
		if ((((SpaceModVariables.RechargeCounter) > 5) && (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement6")))
						.isDone()
				: false))) {
			SpaceModVariables.RechargeCounter = (double) 0;
		}
		if ((((SpaceModVariables.RechargeCounter) > 3) && (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement8")))
						.isDone()
				: false))) {
			SpaceModVariables.RechargeCounter = (double) 0;
		}
		if ((((SpaceModVariables.RechargeCounter) > 2) && (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
				? ((EntityPlayerMP) entity).getAdvancements()
						.getProgress(((WorldServer) entity.world).getAdvancementManager()
								.getAdvancement(new ResourceLocation("spacemod:forceachivement9")))
						.isDone()
				: false))) {
			SpaceModVariables.RechargeCounter = (double) 0;
		}
		if (((((SpaceModVariables.RechargeCounter) == 0)
				|| (((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
						? ((EntityPlayerMP) entity).getAdvancements()
								.getProgress(((WorldServer) entity.world).getAdvancementManager()
										.getAdvancement(new ResourceLocation("spacemod:cheatingdeath")))
								.isDone()
						: false))
				&& ((SpaceModVariables.forcePower) < 100))) {
			SpaceModVariables.forcePower = (double) ((SpaceModVariables.forcePower)
					+ (((SpaceModVariables.MapVariables.get(world).ForceStrength) + 40) / 40));
		}
		SpaceModVariables.forcePowerString = (String) (new java.text.DecimalFormat("##.##").format(Math.round((SpaceModVariables.forcePower))));
		if ((0 > (SpaceModVariables.forcePower))) {
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 999);
		}
		if (((SpaceModVariables.forcePower) > 100)) {
			SpaceModVariables.forcePower = (double) 100;
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
