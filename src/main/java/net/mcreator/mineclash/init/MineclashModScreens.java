
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mineclash.client.gui.Page04Screen;
import net.mcreator.mineclash.client.gui.Page03Screen;
import net.mcreator.mineclash.client.gui.Page02Screen;
import net.mcreator.mineclash.client.gui.Page01Screen;
import net.mcreator.mineclash.client.gui.ManualtemplateScreen;
import net.mcreator.mineclash.client.gui.CapsueltableoverlayScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MineclashModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MineclashModMenus.CAPSUELTABLEOVERLAY, CapsueltableoverlayScreen::new);
			MenuScreens.register(MineclashModMenus.MANUALTEMPLATE, ManualtemplateScreen::new);
			MenuScreens.register(MineclashModMenus.PAGE_01, Page01Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_02, Page02Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_03, Page03Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_04, Page04Screen::new);
		});
	}
}
