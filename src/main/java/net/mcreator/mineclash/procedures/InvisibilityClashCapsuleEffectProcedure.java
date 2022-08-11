package net.mcreator.mineclash.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mineclash.init.MineclashModItems;

public class InvisibilityClashCapsuleEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 4200, 99));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MineclashModItems.INVISIBILITY_CLASH_CAPSULE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
