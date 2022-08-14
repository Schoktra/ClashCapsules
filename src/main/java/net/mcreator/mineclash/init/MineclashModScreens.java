
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mineclash.client.gui.Page16Screen;
import net.mcreator.mineclash.client.gui.Page15Screen;
import net.mcreator.mineclash.client.gui.Page14Screen;
import net.mcreator.mineclash.client.gui.Page13Screen;
import net.mcreator.mineclash.client.gui.Page12Screen;
import net.mcreator.mineclash.client.gui.Page11Screen;
import net.mcreator.mineclash.client.gui.Page10Screen;
import net.mcreator.mineclash.client.gui.Page09Screen;
import net.mcreator.mineclash.client.gui.Page08Screen;
import net.mcreator.mineclash.client.gui.Page07Screen;
import net.mcreator.mineclash.client.gui.Page06Screen;
import net.mcreator.mineclash.client.gui.Page05Screen;
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
			MenuScreens.register(MineclashModMenus.PAGE_05, Page05Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_06, Page06Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_07, Page07Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_08, Page08Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_09, Page09Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_10, Page10Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_11, Page11Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_12, Page12Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_13, Page13Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_14, Page14Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_15, Page15Screen::new);
			MenuScreens.register(MineclashModMenus.PAGE_16, Page16Screen::new);
		});
	}
}
