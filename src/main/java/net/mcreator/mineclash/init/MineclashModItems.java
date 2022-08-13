
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mineclash.item.WeaponClashCapsuleItem;
import net.mcreator.mineclash.item.UkuleliItem;
import net.mcreator.mineclash.item.TimeClashCapsuleItem;
import net.mcreator.mineclash.item.TaddlzookaNoodlesItem;
import net.mcreator.mineclash.item.TaddlNoodlezookaItem;
import net.mcreator.mineclash.item.PlainPowerbeanItem;
import net.mcreator.mineclash.item.LighntingClashCapsuleProjectileItem;
import net.mcreator.mineclash.item.LefloidswordItem;
import net.mcreator.mineclash.item.KellybattleaxeItem;
import net.mcreator.mineclash.item.InvisibilityClashCapsuleItem;
import net.mcreator.mineclash.item.IblalisbratwurstchainItem;
import net.mcreator.mineclash.item.FlighClashCapsuleItem;
import net.mcreator.mineclash.item.FireClashCapsuleProjectileItem;
import net.mcreator.mineclash.item.ColdmirrorsWandItem;
import net.mcreator.mineclash.item.CloningClashCapsuleItem;
import net.mcreator.mineclash.item.ClashCapsuleSwordItem;
import net.mcreator.mineclash.MineclashMod;

public class MineclashModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineclashMod.MODID);
	public static final RegistryObject<Item> PLAIN_CLASHCAPSULE = REGISTRY.register("plain_clashcapsule", () -> new PlainPowerbeanItem());
	public static final RegistryObject<Item> FLIGH_CLASH_CAPSULE = REGISTRY.register("fligh_clash_capsule", () -> new FlighClashCapsuleItem());
	public static final RegistryObject<Item> CLONING_CLASH_CAPSULE = REGISTRY.register("cloning_clash_capsule", () -> new CloningClashCapsuleItem());
	public static final RegistryObject<Item> WEAPON_CLASH_CAPSULE = REGISTRY.register("weapon_clash_capsule", () -> new WeaponClashCapsuleItem());
	public static final RegistryObject<Item> TIME_CLASH_CAPSULE = REGISTRY.register("time_clash_capsule", () -> new TimeClashCapsuleItem());
	public static final RegistryObject<Item> INVISIBILITY_CLASH_CAPSULE = REGISTRY.register("invisibility_clash_capsule",
			() -> new InvisibilityClashCapsuleItem());
	public static final RegistryObject<Item> FIRE_CLASH_CAPSULE_PROJECTILE = REGISTRY.register("fire_clash_capsule_projectile",
			() -> new FireClashCapsuleProjectileItem());
	public static final RegistryObject<Item> LIGHNTING_CLASH_CAPSULE_PROJECTILE = REGISTRY.register("lighnting_clash_capsule_projectile",
			() -> new LighntingClashCapsuleProjectileItem());
	public static final RegistryObject<Item> CAPSULE_CRAFTING_TABLE = block(MineclashModBlocks.CAPSULE_CRAFTING_TABLE,
			MineclashModTabs.TAB_MINE_CLASH_MCS);
	public static final RegistryObject<Item> CLASH_CAPSULE_SWORD = REGISTRY.register("clash_capsule_sword", () -> new ClashCapsuleSwordItem());
	public static final RegistryObject<Item> UKULELI = REGISTRY.register("ukuleli", () -> new UkuleliItem());
	public static final RegistryObject<Item> COMMUNITY_GHOST = REGISTRY.register("community_ghost_spawn_egg",
			() -> new ForgeSpawnEggItem(MineclashModEntities.COMMUNITY_GHOST, -1, -16711681,
					new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_MCS)));
	public static final RegistryObject<Item> LEFLOIDSWORD = REGISTRY.register("lefloidsword", () -> new LefloidswordItem());
	public static final RegistryObject<Item> TWITTER_BIRD = REGISTRY.register("twitter_bird_spawn_egg",
			() -> new ForgeSpawnEggItem(MineclashModEntities.TWITTER_BIRD, -16744193, -16727843,
					new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_MCS)));
	public static final RegistryObject<Item> COLDMIRRORS_WAND = REGISTRY.register("coldmirrors_wand", () -> new ColdmirrorsWandItem());
	public static final RegistryObject<Item> TADDL_NOODLEZOOKA = REGISTRY.register("taddl_noodlezooka", () -> new TaddlNoodlezookaItem());
	public static final RegistryObject<Item> TADDLZOOKA_NOODLES = REGISTRY.register("taddlzooka_noodles", () -> new TaddlzookaNoodlesItem());
	public static final RegistryObject<Item> IBLALISBRATWURSTCHAIN = REGISTRY.register("iblalisbratwurstchain",
			() -> new IblalisbratwurstchainItem());
	public static final RegistryObject<Item> KELLYBATTLEAXE = REGISTRY.register("kellybattleaxe", () -> new KellybattleaxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
