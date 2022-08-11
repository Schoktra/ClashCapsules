package net.mcreator.mineclash.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineclash.init.MineclashModItems;

public class WeaponClashCapsuleEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MineclashModItems.CLASH_CAPSULE_SWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
