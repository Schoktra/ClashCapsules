
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MineclashModTabs {
	public static CreativeModeTab TAB_CLASH_CAPSULES;

	public static void load() {
		TAB_CLASH_CAPSULES = new CreativeModeTab("tabclash_capsules") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MineclashModItems.PLAIN_CLASHCAPSULE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
