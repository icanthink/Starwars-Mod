package net.icanthink.spacemod.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureOnTIckWorld extends ElementsSpaceMod.ModElement {
	public ProcedureOnTIckWorld(ElementsSpaceMod instance) {
		super(instance, 122);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OnTIckWorld!");
			return;
		}
		World world = (World) dependencies.get("world");
		if ((0 > (SpaceModVariables.MapVariables.get(world).RiftCounter))) {
			SpaceModVariables.MapVariables.get(world).RiftMeltdown = (boolean) (false);
			SpaceModVariables.MapVariables.get(world).syncData(world);
		}
		if ((SpaceModVariables.MapVariables.get(world).RiftMeltdown)) {
			SpaceModVariables.MapVariables.get(world).RiftCounter = (double) ((SpaceModVariables.MapVariables.get(world).RiftCounter) - 1);
			SpaceModVariables.MapVariables.get(world).syncData(world);
			System.out.println((SpaceModVariables.MapVariables.get(world).RiftCounter));
		}
	}

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			World world = event.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
