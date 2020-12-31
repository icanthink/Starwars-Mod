package net.icanthink.spacemod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.icanthink.spacemod.block.BlockStoneOfDeathAndLife;
import net.icanthink.spacemod.block.BlockRiftStabilityCoil;
import net.icanthink.spacemod.block.BlockLiquidMidichlorians;
import net.icanthink.spacemod.SpaceModVariables;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class ProcedureRiftWarperUpdateBlock extends ElementsSpaceMod.ModElement {
	public ProcedureRiftWarperUpdateBlock(ElementsSpaceMod instance) {
		super(instance, 119);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RiftWarperUpdateBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RiftWarperUpdateBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RiftWarperUpdateBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RiftWarperUpdateBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double riftOpeningSize = 0;
		double index = 0;
		if ((((SpaceModVariables.MapVariables.get(world).riftX) == x) && ((SpaceModVariables.MapVariables.get(world).riftY) == z))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 0)))).getBlock() == BlockStoneOfDeathAndLife.block
					.getDefaultState().getBlock())
					&& (((world.getBlockState(new BlockPos((int) (x + -1), (int) y, (int) (z + 0)))).getBlock() == BlockStoneOfDeathAndLife.block
							.getDefaultState().getBlock())
							&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) y, (int) (z + 1))))
									.getBlock() == BlockStoneOfDeathAndLife.block.getDefaultState().getBlock())
									&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) y, (int) (z + -1))))
											.getBlock() == BlockStoneOfDeathAndLife.block.getDefaultState().getBlock()))))) {
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.GLASS.getDefaultState()
						.getBlock())
						&& (((world.getBlockState(new BlockPos((int) (x + -1), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.GLASS
								.getDefaultState().getBlock())
								&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.GLASS
										.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + -1))))
												.getBlock() == Blocks.GLASS.getDefaultState().getBlock()))))) {
					if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GOLD_BLOCK.getDefaultState()
							.getBlock())
							&& (((world.getBlockState(new BlockPos((int) (x + -1), (int) y, (int) (z + -1)))).getBlock() == Blocks.GOLD_BLOCK
									.getDefaultState().getBlock())
									&& (((world.getBlockState(new BlockPos((int) (x + -1), (int) y, (int) (z + 1)))).getBlock() == Blocks.GOLD_BLOCK
											.getDefaultState().getBlock())
											&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + -1))))
													.getBlock() == Blocks.GOLD_BLOCK.getDefaultState().getBlock()))))) {
						if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.GLOWSTONE
								.getDefaultState().getBlock())
								&& (((world.getBlockState(new BlockPos((int) (x + -1), (int) (y + 1), (int) (z + -1)))).getBlock() == Blocks.GLOWSTONE
										.getDefaultState().getBlock())
										&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + -1))))
												.getBlock() == Blocks.GLOWSTONE.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x + -1), (int) (y + 1), (int) (z + 1))))
														.getBlock() == Blocks.GLOWSTONE.getDefaultState().getBlock()))))) {
							if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockLiquidMidichlorians.block
									.getDefaultState().getBlock())) {
								index = (double) y;
								riftOpeningSize = (double) 0;
								SpaceModVariables.MapVariables
										.get(world).RiftSize = (double) ((SpaceModVariables.MapVariables.get(world).RiftSize) + 1);
								SpaceModVariables.MapVariables.get(world).syncData(world);
								SpaceModVariables.MapVariables
										.get(world).ForceStrength = (double) ((SpaceModVariables.MapVariables.get(world).ForceStrength) + 1);
								SpaceModVariables.MapVariables.get(world).syncData(world);
								world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
								while (((index) > 0)) {
									index = (double) ((index) - 1);
									if (((world.getBlockState(new BlockPos((int) x, (int) (index), (int) z)))
											.getBlock() == BlockRiftStabilityCoil.block.getDefaultState().getBlock())) {
										riftOpeningSize = (double) ((riftOpeningSize) + 1);
									}
								}
								if (((riftOpeningSize) < (SpaceModVariables.MapVariables.get(world).RiftSize))) {
									SpaceModVariables.WorldVariables.get(world).RiftMeltdown = (boolean) (true);
									SpaceModVariables.WorldVariables.get(world).syncData(world);
									SpaceModVariables.MapVariables
											.get(world).RiftCounter = (double) ((SpaceModVariables.MapVariables.get(world).RiftSize) * 20);
									SpaceModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
	}
}
