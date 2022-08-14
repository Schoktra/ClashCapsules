
package net.mcreator.mineclash.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mineclash.entity.CommunityGhostEntity;
import net.mcreator.mineclash.client.model.Modelcustom_model;

public class CommunityGhostRenderer extends MobRenderer<CommunityGhostEntity, Modelcustom_model<CommunityGhostEntity>> {
	public CommunityGhostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CommunityGhostEntity entity) {
		return new ResourceLocation("mineclash:textures/white_end.png");
	}
}
