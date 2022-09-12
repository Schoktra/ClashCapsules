
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mineclash.block.TransparencyLayerPortalBlock;
import net.mcreator.mineclash.block.DeepFreezeBlockBlock;
import net.mcreator.mineclash.block.CpasuleCraftingtableBlock;
import net.mcreator.mineclash.MineclashMod;

public class MineclashModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineclashMod.MODID);
	public static final RegistryObject<Block> CAPSULE_CRAFTING_TABLE = REGISTRY.register("capsule_crafting_table",
			() -> new CpasuleCraftingtableBlock());
	public static final RegistryObject<Block> DEEP_FREEZE_BLOCK = REGISTRY.register("deep_freeze_block", () -> new DeepFreezeBlockBlock());
	public static final RegistryObject<Block> TRANSPARENCY_LAYER_PORTAL = REGISTRY.register("transparency_layer_portal",
			() -> new TransparencyLayerPortalBlock());
}
