
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mineclash.client.renderer.TwitterBirdRenderer;
import net.mcreator.mineclash.client.renderer.PlayerCloneRenderer;
import net.mcreator.mineclash.client.renderer.CommunityGhostRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineclashModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MineclashModEntities.FIRE_CLASH_CAPSULE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.LIGHNTING_CLASH_CAPSULE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.COMMUNITY_GHOST.get(), CommunityGhostRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.PLAYER_CLONE.get(), PlayerCloneRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.TWITTER_BIRD.get(), TwitterBirdRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.COLDMIRRORS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.TADDL_NOODLEZOOKA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MineclashModEntities.COLDMIRROR_WAND_BAMBOO.get(), ThrownItemRenderer::new);
	}
}
