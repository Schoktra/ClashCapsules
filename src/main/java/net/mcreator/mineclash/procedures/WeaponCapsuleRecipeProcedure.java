package net.mcreator.mineclash.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mineclash.init.MineclashModItems;

import java.util.function.Supplier;
import java.util.Map;

public class WeaponCapsuleRecipeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (9); index0++) {
			if ((index0 == 2) || (index0 == 5) || (index0 == 8)) {
				continue;
			}
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) index0)).getItem() : ItemStack.EMPTY)
					.getItem() == MineclashModItems.PLAIN_CLASHCAPSULE.get()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) index0 + 1)).getItem() : ItemStack.EMPTY)
							.getItem() == Items.IRON_SWORD) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MineclashModItems.WEAPON_CLASH_CAPSULE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(9)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
