
package top.pf43.mcaic.item;

import top.pf43.mcaic.init.McaicModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReNoelBSPItem extends Item {
	public ReNoelBSPItem() {
		super(new Item.Properties().tab(McaicModTabs.TAB_MCAIC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
