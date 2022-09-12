
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
import net.mcreator.mineclash.item.TweetFeatherItem;
import net.mcreator.mineclash.item.TransparencyLayerItem;
import net.mcreator.mineclash.item.TimeClashCapsuleItem;
import net.mcreator.mineclash.item.TaddlzookaNoodlesItem;
import net.mcreator.mineclash.item.TaddlNoodlezookaItem;
import net.mcreator.mineclash.item.TaddlArmorSetItem;
import net.mcreator.mineclash.item.PlainPowerbeanItem;
import net.mcreator.mineclash.item.MineClashManualItem;
import net.mcreator.mineclash.item.MagicalGirlStaffItem;
import net.mcreator.mineclash.item.LighntingClashCapsuleProjectileItem;
import net.mcreator.mineclash.item.LefloidswordItem;
import net.mcreator.mineclash.item.LeFloidArmorSetItem;
import net.mcreator.mineclash.item.KellybattleaxeItem;
import net.mcreator.mineclash.item.KellyArmorSetItem;
import net.mcreator.mineclash.item.InvisibilityClashCapsuleItem;
import net.mcreator.mineclash.item.IblalisbratwurstchainItem;
import net.mcreator.mineclash.item.IBlaliArmorSetItem;
import net.mcreator.mineclash.item.GronkhArmorSetItem;
import net.mcreator.mineclash.item.GLPArmorSetItem;
import net.mcreator.mineclash.item.FlighClashCapsuleItem;
import net.mcreator.mineclash.item.FireClashCapsuleProjectileItem;
import net.mcreator.mineclash.item.DoktorArmorSetItem;
import net.mcreator.mineclash.item.ColdmirrorwandprojectileItem;
import net.mcreator.mineclash.item.ColdmirrorsWandItem;
import net.mcreator.mineclash.item.ColdmirrorWandBambooItem;
import net.mcreator.mineclash.item.ColdmirrorArmorSetItem;
import net.mcreator.mineclash.item.CloningClashCapsuleItem;
import net.mcreator.mineclash.item.ClashCapsuleSwordItem;
import net.mcreator.mineclash.item.ChanArmorSetItem;
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
	public static final RegistryObject<Item> TWEET_FEATHER = REGISTRY.register("tweet_feather", () -> new TweetFeatherItem());
	public static final RegistryObject<Item> MINE_CLASH_MANUAL = REGISTRY.register("mine_clash_manual", () -> new MineClashManualItem());
	public static final RegistryObject<Item> COMMUNITY_GHOST = REGISTRY.register("community_ghost_spawn_egg",
			() -> new ForgeSpawnEggItem(MineclashModEntities.COMMUNITY_GHOST, -1, -16711681,
					new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_MCS)));
	public static final RegistryObject<Item> TWITTER_BIRD = REGISTRY.register("twitter_bird_spawn_egg",
			() -> new ForgeSpawnEggItem(MineclashModEntities.TWITTER_BIRD, -16744193, -16727843,
					new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_MCS)));
	public static final RegistryObject<Item> PETROLLIUM_JELLY = REGISTRY.register("petrollium_jelly_spawn_egg",
			() -> new ForgeSpawnEggItem(MineclashModEntities.PETROLLIUM_JELLY, -10027009, -16724992,
					new Item.Properties().tab(MineclashModTabs.TAB_MINE_CLASH_MCS)));
	public static final RegistryObject<Item> CLASH_CAPSULE_SWORD = REGISTRY.register("clash_capsule_sword", () -> new ClashCapsuleSwordItem());
	public static final RegistryObject<Item> UKULELI = REGISTRY.register("ukuleli", () -> new UkuleliItem());
	public static final RegistryObject<Item> LEFLOIDSWORD = REGISTRY.register("lefloidsword", () -> new LefloidswordItem());
	public static final RegistryObject<Item> COLDMIRRORS_WAND = REGISTRY.register("coldmirrors_wand", () -> new ColdmirrorsWandItem());
	public static final RegistryObject<Item> TADDL_NOODLEZOOKA = REGISTRY.register("taddl_noodlezooka", () -> new TaddlNoodlezookaItem());
	public static final RegistryObject<Item> IBLALISBRATWURSTCHAIN = REGISTRY.register("iblalisbratwurstchain",
			() -> new IblalisbratwurstchainItem());
	public static final RegistryObject<Item> KELLYBATTLEAXE = REGISTRY.register("kellybattleaxe", () -> new KellybattleaxeItem());
	public static final RegistryObject<Item> MAGICAL_GIRL_STAFF = REGISTRY.register("magical_girl_staff", () -> new MagicalGirlStaffItem());
	public static final RegistryObject<Item> COLDMIRROR_WAND_BAMBOO = REGISTRY.register("coldmirror_wand_bamboo",
			() -> new ColdmirrorWandBambooItem());
	public static final RegistryObject<Item> TADDLZOOKA_NOODLES = REGISTRY.register("taddlzooka_noodles", () -> new TaddlzookaNoodlesItem());
	public static final RegistryObject<Item> COLDMIRRORWANDPROJECTILE = REGISTRY.register("coldmirrorwandprojectile",
			() -> new ColdmirrorwandprojectileItem());
	public static final RegistryObject<Item> GLP_ARMOR_SET_HELMET = REGISTRY.register("glp_armor_set_helmet", () -> new GLPArmorSetItem.Helmet());
	public static final RegistryObject<Item> GLP_ARMOR_SET_CHESTPLATE = REGISTRY.register("glp_armor_set_chestplate",
			() -> new GLPArmorSetItem.Chestplate());
	public static final RegistryObject<Item> GLP_ARMOR_SET_LEGGINGS = REGISTRY.register("glp_armor_set_leggings",
			() -> new GLPArmorSetItem.Leggings());
	public static final RegistryObject<Item> GLP_ARMOR_SET_BOOTS = REGISTRY.register("glp_armor_set_boots", () -> new GLPArmorSetItem.Boots());
	public static final RegistryObject<Item> LE_FLOID_ARMOR_SET_HELMET = REGISTRY.register("le_floid_armor_set_helmet",
			() -> new LeFloidArmorSetItem.Helmet());
	public static final RegistryObject<Item> LE_FLOID_ARMOR_SET_CHESTPLATE = REGISTRY.register("le_floid_armor_set_chestplate",
			() -> new LeFloidArmorSetItem.Chestplate());
	public static final RegistryObject<Item> LE_FLOID_ARMOR_SET_LEGGINGS = REGISTRY.register("le_floid_armor_set_leggings",
			() -> new LeFloidArmorSetItem.Leggings());
	public static final RegistryObject<Item> LE_FLOID_ARMOR_SET_BOOTS = REGISTRY.register("le_floid_armor_set_boots",
			() -> new LeFloidArmorSetItem.Boots());
	public static final RegistryObject<Item> CHAN_ARMOR_SET_CHESTPLATE = REGISTRY.register("chan_armor_set_chestplate",
			() -> new ChanArmorSetItem.Chestplate());
	public static final RegistryObject<Item> CHAN_ARMOR_SET_LEGGINGS = REGISTRY.register("chan_armor_set_leggings",
			() -> new ChanArmorSetItem.Leggings());
	public static final RegistryObject<Item> CHAN_ARMOR_SET_BOOTS = REGISTRY.register("chan_armor_set_boots", () -> new ChanArmorSetItem.Boots());
	public static final RegistryObject<Item> I_BLALI_ARMOR_SET_CHESTPLATE = REGISTRY.register("i_blali_armor_set_chestplate",
			() -> new IBlaliArmorSetItem.Chestplate());
	public static final RegistryObject<Item> I_BLALI_ARMOR_SET_LEGGINGS = REGISTRY.register("i_blali_armor_set_leggings",
			() -> new IBlaliArmorSetItem.Leggings());
	public static final RegistryObject<Item> I_BLALI_ARMOR_SET_BOOTS = REGISTRY.register("i_blali_armor_set_boots",
			() -> new IBlaliArmorSetItem.Boots());
	public static final RegistryObject<Item> TADDL_ARMOR_SET_CHESTPLATE = REGISTRY.register("taddl_armor_set_chestplate",
			() -> new TaddlArmorSetItem.Chestplate());
	public static final RegistryObject<Item> TADDL_ARMOR_SET_LEGGINGS = REGISTRY.register("taddl_armor_set_leggings",
			() -> new TaddlArmorSetItem.Leggings());
	public static final RegistryObject<Item> TADDL_ARMOR_SET_BOOTS = REGISTRY.register("taddl_armor_set_boots", () -> new TaddlArmorSetItem.Boots());
	public static final RegistryObject<Item> KELLY_ARMOR_SET_CHESTPLATE = REGISTRY.register("kelly_armor_set_chestplate",
			() -> new KellyArmorSetItem.Chestplate());
	public static final RegistryObject<Item> KELLY_ARMOR_SET_LEGGINGS = REGISTRY.register("kelly_armor_set_leggings",
			() -> new KellyArmorSetItem.Leggings());
	public static final RegistryObject<Item> KELLY_ARMOR_SET_BOOTS = REGISTRY.register("kelly_armor_set_boots", () -> new KellyArmorSetItem.Boots());
	public static final RegistryObject<Item> GRONKH_ARMOR_SET_CHESTPLATE = REGISTRY.register("gronkh_armor_set_chestplate",
			() -> new GronkhArmorSetItem.Chestplate());
	public static final RegistryObject<Item> GRONKH_ARMOR_SET_LEGGINGS = REGISTRY.register("gronkh_armor_set_leggings",
			() -> new GronkhArmorSetItem.Leggings());
	public static final RegistryObject<Item> GRONKH_ARMOR_SET_BOOTS = REGISTRY.register("gronkh_armor_set_boots",
			() -> new GronkhArmorSetItem.Boots());
	public static final RegistryObject<Item> DOKTOR_ARMOR_SET_HELMET = REGISTRY.register("doktor_armor_set_helmet",
			() -> new DoktorArmorSetItem.Helmet());
	public static final RegistryObject<Item> DOKTOR_ARMOR_SET_CHESTPLATE = REGISTRY.register("doktor_armor_set_chestplate",
			() -> new DoktorArmorSetItem.Chestplate());
	public static final RegistryObject<Item> DOKTOR_ARMOR_SET_LEGGINGS = REGISTRY.register("doktor_armor_set_leggings",
			() -> new DoktorArmorSetItem.Leggings());
	public static final RegistryObject<Item> DOKTOR_ARMOR_SET_BOOTS = REGISTRY.register("doktor_armor_set_boots",
			() -> new DoktorArmorSetItem.Boots());
	public static final RegistryObject<Item> COLDMIRROR_ARMOR_SET_CHESTPLATE = REGISTRY.register("coldmirror_armor_set_chestplate",
			() -> new ColdmirrorArmorSetItem.Chestplate());
	public static final RegistryObject<Item> COLDMIRROR_ARMOR_SET_LEGGINGS = REGISTRY.register("coldmirror_armor_set_leggings",
			() -> new ColdmirrorArmorSetItem.Leggings());
	public static final RegistryObject<Item> COLDMIRROR_ARMOR_SET_BOOTS = REGISTRY.register("coldmirror_armor_set_boots",
			() -> new ColdmirrorArmorSetItem.Boots());
	public static final RegistryObject<Item> DEEP_FREEZE_BLOCK = block(MineclashModBlocks.DEEP_FREEZE_BLOCK, MineclashModTabs.TAB_MINE_CLASH_MCS);
	public static final RegistryObject<Item> TRANSPARENCY_LAYER = REGISTRY.register("transparency_layer", () -> new TransparencyLayerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
