
package net.mcreator.mineclash.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mineclash.entity.PetrolliumJellyEntity;
import net.mcreator.mineclash.client.model.Modelpetrolium_jelly;

public class PetrolliumJellyRenderer extends MobRenderer<PetrolliumJellyEntity, Modelpetrolium_jelly<PetrolliumJellyEntity>> {
	public PetrolliumJellyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpetrolium_jelly(context.bakeLayer(Modelpetrolium_jelly.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(PetrolliumJellyEntity entity) {
		return new ResourceLocation("mineclash:textures/entities/petrollium_jelly_texture.png");
	}
}
