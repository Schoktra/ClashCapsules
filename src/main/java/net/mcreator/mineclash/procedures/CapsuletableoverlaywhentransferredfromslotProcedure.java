package net.mcreator.mineclash.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class CapsuletableoverlaywhentransferredfromslotProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double LowestStackSize = 0;
		LowestStackSize = MinnonzerostacksizeProcedure.execute(entity);
		for (int index0 = 0; index0 < (int) (9); index0++) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) index0)).remove((int) LowestStackSize);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY).copy());
			_setstack.setCount((int) LowestStackSize);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(9)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
	}
}
