
package net.mcreator.mineclash.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mineclash.procedures.TimeClashCapsuleEffectProcedure;
import net.mcreator.mineclash.init.MineclashModTabs;

public class TimeClashCapsuleItem extends Item {
	public TimeClashCapsuleItem() {
		super(new Item.Properties().tab(MineclashModTabs.TAB_CLASH_CAPSULES).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TimeClashCapsuleEffectProcedure.execute(entity, sourceentity);
		return retval;
	}
}
