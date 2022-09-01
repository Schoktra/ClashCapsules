
package net.mcreator.mineclash.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mineclash.init.MineclashModTabs;

public abstract class ColdmirrorArmorSetItem extends ArmorItem {
	public ColdmirrorArmorSetItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "coldmirror_armor_set";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends ColdmirrorArmorSetItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_CLOTHING));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mineclash:textures/models/armor/kaddi_armor_layer_1_layer_1.png";
		}
	}

	public static class Leggings extends ColdmirrorArmorSetItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_CLOTHING));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mineclash:textures/models/armor/kaddi_armor_layer_1_layer_2.png";
		}
	}

	public static class Boots extends ColdmirrorArmorSetItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_CLOTHING));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mineclash:textures/models/armor/kaddi_armor_layer_1_layer_1.png";
		}
	}
}
