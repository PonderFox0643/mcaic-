
package top.pf43.mcaic.item;

import top.pf43.mcaic.init.McaicModTabs;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class BigstaffItem extends SwordItem {
	public BigstaffItem() {
		super(new Tier() {
			public int getUses() {
				return 2200;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 1f, new Item.Properties().tab(McaicModTabs.TAB_MCAIC));
	}
}
