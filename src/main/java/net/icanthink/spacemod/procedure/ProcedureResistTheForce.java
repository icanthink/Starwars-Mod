package net.icanthink.spacemod.procedure;

import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureResistTheForce extends ElementsSpaceMod.ModElement {
	public ProcedureResistTheForce(ElementsSpaceMod instance) {
		super(instance, 66);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ResistTheForce!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ResistTheForce!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		SpaceModVariables.MapVariables.get(world).ForceStrength = (double) ((SpaceModVariables.MapVariables.get(world).ForceStrength) - 1);
		SpaceModVariables.MapVariables.get(world).syncData(world);
		SpaceModVariables.ForceConnectionInDeath = (double) ((SpaceModVariables.ForceConnectionInDeath) - 0.5);
		if (((SpaceModVariables.ForceConnectionInDeath) < 1)) {
			if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
				entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return entity.world;
					}

					@Override
					public MinecraftServer getServer() {
						return entity.world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return entity.getPosition();
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(entity.posX, entity.posY, entity.posZ);
					}

					@Override
					public Entity getCommandSenderEntity() {
						return entity;
					}
				}, "kill");
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.ADVENTURE);
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 9999);
		}
	}
}
