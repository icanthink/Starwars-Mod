
package net.icanthink.spacemod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.icanthink.spacemod.item.ItemForceXp;
import net.icanthink.spacemod.ElementsSpaceMod;

@ElementsSpaceMod.ModElement.Tag
public class TabForceTab extends ElementsSpaceMod.ModElement {
	public TabForceTab(ElementsSpaceMod instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabforcetab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemForceXp.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
