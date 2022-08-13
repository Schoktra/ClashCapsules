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
		if (Math.random() <= 0.25) {
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
		} else {
			if (Math.random() <= 0.4) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(MineclashModItems.UKULELI.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			} else {
				if (Math.random() <= 0.3) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(MineclashModItems.LEFLOIDSWORD.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				} else {
					if (Math.random() <= 0.1) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(MineclashModItems.COLDMIRRORS_WAND.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
					} else {
						if (Math.random() <= 0.1) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(MineclashModItems.COLDMIRROR_WAND_BAMBOO.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
						} else {
							if (Math.random() <= 0.1) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(MineclashModItems.TADDL_NOODLEZOOKA.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
											_player.inventoryMenu.getCraftSlots());
								}
							} else {
								if (Math.random() <= 0.4) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(MineclashModItems.IBLALISBRATWURSTCHAIN.get());
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (entity instanceof Player _player) {
										ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
										_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
												_player.inventoryMenu.getCraftSlots());
									}
								} else {
									if (Math.random() <= 0.3) {
										if (entity instanceof Player _player) {
											ItemStack _setstack = new ItemStack(MineclashModItems.KELLYBATTLEAXE.get());
											_setstack.setCount(1);
											ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
										}
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
													_player.inventoryMenu.getCraftSlots());
										}
									} else {
										if (Math.random() <= 0.4) {
											if (entity instanceof Player _player) {
												ItemStack _setstack = new ItemStack(MineclashModItems.MAGICAL_GIRL_STAFF.get());
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
							}
						}
					}
				}
			}
		}
	}
}
