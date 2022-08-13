package net.mcreator.mineclash.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class CapsuletableoverlaywhenitemtakenfromtheslotProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (9); index0++) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) index0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
