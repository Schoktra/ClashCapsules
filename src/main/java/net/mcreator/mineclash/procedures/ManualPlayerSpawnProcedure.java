package net.mcreator.mineclash.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.mineclash.init.MineclashModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ManualPlayerSpawnProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (true && (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(MineclashModItems.MINE_CLASH_MANUAL.get()))
				: false)) {
			entity.hurt(DamageSource.GENERIC, 0);
		} else if (true == false && !(entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(MineclashModItems.MINE_CLASH_MANUAL.get()))
				: false)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MineclashModItems.MINE_CLASH_MANUAL.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
