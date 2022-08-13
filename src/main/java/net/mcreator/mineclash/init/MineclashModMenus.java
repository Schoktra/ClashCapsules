
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mineclash.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.mineclash.world.inventory.ManualtemplateMenu;
import net.mcreator.mineclash.world.inventory.CapsueltableoverlayMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineclashModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CapsueltableoverlayMenu> CAPSUELTABLEOVERLAY = register("capsueltableoverlay",
			(id, inv, extraData) -> new CapsueltableoverlayMenu(id, inv, extraData));
	public static final MenuType<ManualtemplateMenu> MANUALTEMPLATE = register("manualtemplate",
			(id, inv, extraData) -> new ManualtemplateMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
