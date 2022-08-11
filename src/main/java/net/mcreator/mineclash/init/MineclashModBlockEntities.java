
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mineclash.block.entity.CpasuleCraftingtableBlockEntity;
import net.mcreator.mineclash.MineclashMod;

public class MineclashModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MineclashMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CAPSULE_CRAFTING_TABLE = register("capsule_crafting_table",
			MineclashModBlocks.CAPSULE_CRAFTING_TABLE, CpasuleCraftingtableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
