
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mineclash.entity.TwitterBirdEntity;
import net.mcreator.mineclash.entity.PlayerCloneEntity;
import net.mcreator.mineclash.entity.LighntingClashCapsuleProjectileEntity;
import net.mcreator.mineclash.entity.FireClashCapsuleProjectileEntity;
import net.mcreator.mineclash.entity.CommunityGhostEntity;
import net.mcreator.mineclash.MineclashMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineclashModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MineclashMod.MODID);
	public static final RegistryObject<EntityType<FireClashCapsuleProjectileEntity>> FIRE_CLASH_CAPSULE_PROJECTILE = register(
			"projectile_fire_clash_capsule_projectile",
			EntityType.Builder.<FireClashCapsuleProjectileEntity>of(FireClashCapsuleProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(FireClashCapsuleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LighntingClashCapsuleProjectileEntity>> LIGHNTING_CLASH_CAPSULE_PROJECTILE = register(
			"projectile_lighnting_clash_capsule_projectile",
			EntityType.Builder.<LighntingClashCapsuleProjectileEntity>of(LighntingClashCapsuleProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(LighntingClashCapsuleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CommunityGhostEntity>> COMMUNITY_GHOST = register("community_ghost",
			EntityType.Builder.<CommunityGhostEntity>of(CommunityGhostEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommunityGhostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PlayerCloneEntity>> PLAYER_CLONE = register("player_clone",
			EntityType.Builder.<PlayerCloneEntity>of(PlayerCloneEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlayerCloneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TwitterBirdEntity>> TWITTER_BIRD = register("twitter_bird",
			EntityType.Builder.<TwitterBirdEntity>of(TwitterBirdEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwitterBirdEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CommunityGhostEntity.init();
			PlayerCloneEntity.init();
			TwitterBirdEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COMMUNITY_GHOST.get(), CommunityGhostEntity.createAttributes().build());
		event.put(PLAYER_CLONE.get(), PlayerCloneEntity.createAttributes().build());
		event.put(TWITTER_BIRD.get(), TwitterBirdEntity.createAttributes().build());
	}
}
