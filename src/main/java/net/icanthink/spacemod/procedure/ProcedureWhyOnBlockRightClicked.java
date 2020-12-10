package net.icanthink.spacemod.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.icanthink.spacemod.item.ItemForceXp;
import net.icanthink.spacemod.block.BlockLifeBlock;
import net.icanthink.spacemod.block.BlockCompressedPlantBlock;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureWhyOnBlockRightClicked extends ElementsSpaceMod.ModElement {
	public ProcedureWhyOnBlockRightClicked(ElementsSpaceMod instance) {
		super(instance, 78);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WhyOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WhyOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WhyOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WhyOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WhyOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double indexCounter = 0;
		double wheatCounter = 0;
		double compressedPlantBlockCounter = 0;
		indexCounter = (double) 1;
		wheatCounter = (double) 0;
		for (int index0 = 0; index0 < (int) (200); index0++) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - (indexCounter)), (int) z))).getBlock() == Blocks.HAY_BLOCK.getDefaultState()
					.getBlock())) {
				wheatCounter = (double) ((wheatCounter) + 1);
				world.setBlockState(new BlockPos((int) x, (int) (y - (indexCounter)), (int) z), Blocks.AIR.getDefaultState(), 3);
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - (indexCounter)), (int) z))).getBlock() == BlockCompressedPlantBlock.block
					.getDefaultState().getBlock())) {
				compressedPlantBlockCounter = (double) ((compressedPlantBlockCounter) + 1);
				world.setBlockState(new BlockPos((int) x, (int) (y - (indexCounter)), (int) z), Blocks.AIR.getDefaultState(), 3);
			}
			indexCounter = (double) ((indexCounter) + 1);
		}
		if ((150 <= (wheatCounter))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemForceXp.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if ((15 <= (compressedPlantBlockCounter))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(BlockLifeBlock.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
