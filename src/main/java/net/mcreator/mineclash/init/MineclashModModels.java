
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mineclash.client.model.Modeltwitter_message_bird_model;
import net.mcreator.mineclash.client.model.Modelpetrolium_jelly;
import net.mcreator.mineclash.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MineclashModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelpetrolium_jelly.LAYER_LOCATION, Modelpetrolium_jelly::createBodyLayer);
		event.registerLayerDefinition(Modeltwitter_message_bird_model.LAYER_LOCATION, Modeltwitter_message_bird_model::createBodyLayer);
	}
}
