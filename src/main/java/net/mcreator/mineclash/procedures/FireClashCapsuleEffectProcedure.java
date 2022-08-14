package net.mcreator.mineclash.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineclash.init.MineclashModItems;
import net.mcreator.mineclash.entity.FireClashCapsuleProjectileEntity;

public class FireClashCapsuleEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			FireClashCapsuleProjectileEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 5, 5);
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
		if (immediatesourceentity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(MineclashModItems.FIRE_CLASH_CAPSULE_PROJECTILE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
