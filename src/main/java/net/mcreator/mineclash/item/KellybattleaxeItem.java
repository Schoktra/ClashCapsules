
package net.mcreator.mineclash.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.mineclash.init.MineclashModTabs;

public class KellybattleaxeItem extends AxeItem {
	public KellybattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 70;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_WEAPONS));
	}
}
