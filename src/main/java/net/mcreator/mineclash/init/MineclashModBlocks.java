
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mineclash.block.CpasuleCraftingtableBlock;
import net.mcreator.mineclash.MineclashMod;

public class MineclashModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineclashMod.MODID);
	public static final RegistryObject<Block> CAPSULE_CRAFTING_TABLE = REGISTRY.register("capsule_crafting_table",
			() -> new CpasuleCraftingtableBlock());
}
