
package net.mcreator.mineclash.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.mineclash.init.MineclashModTabs;

public class MagicalGirlStaffItem extends SwordItem {
	public MagicalGirlStaffItem() {
		super(new Tier() {
			public int getUses() {
				return 75;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_WEAPONS));
	}
}
