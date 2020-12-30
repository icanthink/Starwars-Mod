package net.icanthink.spacemod.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
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
		if (((0 < ((SpaceModVariables.forcePower) + ((SpaceModVariables.MapVariables.get(world).ForceStrength) + 1)))
				&& ((SpaceModVariables.forcePower) < 100))) {
			SpaceModVariables.forcePower = (double) ((SpaceModVariables.forcePower)
					+ ((SpaceModVariables.MapVariables.get(world).ForceStrength) + 1));
		}
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
