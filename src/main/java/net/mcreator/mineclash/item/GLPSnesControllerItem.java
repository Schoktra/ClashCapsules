
package net.mcreator.mineclash.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mineclash.init.MineclashModTabs;

public class GLPSnesControllerItem extends Item {
	public GLPSnesControllerItem() {
		super(new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_WEAPONS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
