package net.icanthink.spacemod.procedure;

import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.Teleporter;
import net.minecraft.world.GameType;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.world.WorldForceDimension;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureSwitchRealityOnPress extends ElementsSpaceMod.ModElement {
	public ProcedureSwitchRealityOnPress(ElementsSpaceMod instance) {
		super(instance, 110);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SwitchRealityOnPress!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double lastZ = 0;
		double lastX = 0;
		double index = 0;
		double lastY = 0;
		lastX = (double) (entity.posX);
		lastZ = (double) (entity.posZ);
		lastY = (double) (entity.posY);
		if (((entity.dimension) == 6)) {
			if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
				int dimensionID = 0;
				class TeleporterDirect extends Teleporter {
					public TeleporterDirect(WorldServer worldserver) {
						super(worldserver);
					}

					@Override
					public void placeInPortal(Entity entity, float yawrotation) {
					}

					@Override
					public boolean placeInExistingPortal(Entity entity, float yawrotation) {
						return true;
					}

					@Override
					public boolean makePortal(Entity entity) {
						return true;
					}
				}
				EntityPlayerMP _player = (EntityPlayerMP) entity;
				_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
				_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.SPECTATOR);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).capabilities.allowFlying = (false);
				((EntityPlayer) entity).sendPlayerAbilities();
			}
			entity.setPositionAndUpdate((lastX), (lastY), (lastZ));
		} else {
			if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
				int dimensionID = WorldForceDimension.DIMID;
				class TeleporterDirect extends Teleporter {
					public TeleporterDirect(WorldServer worldserver) {
						super(worldserver);
					}

					@Override
					public void placeInPortal(Entity entity, float yawrotation) {
					}

					@Override
					public boolean placeInExistingPortal(Entity entity, float yawrotation) {
						return true;
					}

					@Override
					public boolean makePortal(Entity entity) {
						return true;
					}
				}
				EntityPlayerMP _player = (EntityPlayerMP) entity;
				_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
				_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
						DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).capabilities.allowFlying = (true);
				((EntityPlayer) entity).sendPlayerAbilities();
			}
			entity.setPositionAndUpdate((lastX), 255, (lastZ));
		}
	}
}
