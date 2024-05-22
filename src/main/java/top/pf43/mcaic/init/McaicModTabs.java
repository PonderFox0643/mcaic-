
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McaicModTabs {
	public static CreativeModeTab TAB_MCAIC;

	public static void load() {
		TAB_MCAIC = new CreativeModeTab("tabmcaic") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(McaicModItems.NOEL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
