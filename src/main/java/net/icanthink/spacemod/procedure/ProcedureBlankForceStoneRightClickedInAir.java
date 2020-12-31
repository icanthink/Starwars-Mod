package net.icanthink.spacemod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemStoneOfTime;
import net.icanthink.spacemod.item.ItemStoneOfLife;
import net.icanthink.spacemod.item.ItemStoneOfInfinity;
import net.icanthink.spacemod.item.ItemStoneOfDimensions;
import net.icanthink.spacemod.item.ItemStoneOfDeath;
import net.icanthink.spacemod.item.ItemBlankForceStone;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureBlankForceStoneRightClickedInAir extends ElementsSpaceMod.ModElement {
	public ProcedureBlankForceStoneRightClickedInAir(ElementsSpaceMod instance) {
		super(instance, 85);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlankForceStoneRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlankForceStoneRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.BEDROCK.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfInfinity.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.POWERED_REPEATER.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfTime.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.LOG.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfLife.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.SKULL.getStateFromMeta(0).getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfDeath.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.SKULL.getStateFromMeta(2).getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfDeath.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.SKULL.getStateFromMeta(3).getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfDeath.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.SKULL.getStateFromMeta(4).getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfDeath.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.PORTAL.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfDimensions.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (((world
				.getBlockState(new BlockPos(
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getX()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getY()),
						(int) (entity.world.rayTraceBlocks(entity.getPositionEyes(1f),
								entity.getPositionEyes(1f).addVector(entity.getLook(1f).x * 100, entity.getLook(1f).y * 100,
										entity.getLook(1f).z * 100),
								false, false, true).getBlockPos().getZ())))).getBlock() == Blocks.END_PORTAL.getDefaultState().getBlock())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBlankForceStone.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemStoneOfDimensions.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
