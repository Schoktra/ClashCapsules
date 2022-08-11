
package net.mcreator.mineclash.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mineclash.entity.TwitterBirdEntity;
import net.mcreator.mineclash.client.model.Modeltwitter_message_bird_model;

public class TwitterBirdRenderer extends MobRenderer<TwitterBirdEntity, Modeltwitter_message_bird_model<TwitterBirdEntity>> {
	public TwitterBirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltwitter_message_bird_model(context.bakeLayer(Modeltwitter_message_bird_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TwitterBirdEntity entity) {
		return new ResourceLocation("mineclash:textures/twitter_bird_texture.png");
	}
}
