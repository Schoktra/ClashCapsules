
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

import net.mcreator.mineclash.world.inventory.Page19Menu;
import net.mcreator.mineclash.world.inventory.Page18Menu;
import net.mcreator.mineclash.world.inventory.Page17Menu;
import net.mcreator.mineclash.world.inventory.Page16Menu;
import net.mcreator.mineclash.world.inventory.Page15Menu;
import net.mcreator.mineclash.world.inventory.Page14Menu;
import net.mcreator.mineclash.world.inventory.Page13Menu;
import net.mcreator.mineclash.world.inventory.Page12Menu;
import net.mcreator.mineclash.world.inventory.Page11Menu;
import net.mcreator.mineclash.world.inventory.Page10Menu;
import net.mcreator.mineclash.world.inventory.Page09Menu;
import net.mcreator.mineclash.world.inventory.Page08Menu;
import net.mcreator.mineclash.world.inventory.Page07Menu;
import net.mcreator.mineclash.world.inventory.Page06Menu;
import net.mcreator.mineclash.world.inventory.Page05Menu;
import net.mcreator.mineclash.world.inventory.Page04Menu;
import net.mcreator.mineclash.world.inventory.Page03Menu;
import net.mcreator.mineclash.world.inventory.Page02Menu;
import net.mcreator.mineclash.world.inventory.Page01Menu;
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
	public static final MenuType<Page01Menu> PAGE_01 = register("page_01", (id, inv, extraData) -> new Page01Menu(id, inv, extraData));
	public static final MenuType<Page02Menu> PAGE_02 = register("page_02", (id, inv, extraData) -> new Page02Menu(id, inv, extraData));
	public static final MenuType<Page03Menu> PAGE_03 = register("page_03", (id, inv, extraData) -> new Page03Menu(id, inv, extraData));
	public static final MenuType<Page04Menu> PAGE_04 = register("page_04", (id, inv, extraData) -> new Page04Menu(id, inv, extraData));
	public static final MenuType<Page05Menu> PAGE_05 = register("page_05", (id, inv, extraData) -> new Page05Menu(id, inv, extraData));
	public static final MenuType<Page06Menu> PAGE_06 = register("page_06", (id, inv, extraData) -> new Page06Menu(id, inv, extraData));
	public static final MenuType<Page07Menu> PAGE_07 = register("page_07", (id, inv, extraData) -> new Page07Menu(id, inv, extraData));
	public static final MenuType<Page08Menu> PAGE_08 = register("page_08", (id, inv, extraData) -> new Page08Menu(id, inv, extraData));
	public static final MenuType<Page09Menu> PAGE_09 = register("page_09", (id, inv, extraData) -> new Page09Menu(id, inv, extraData));
	public static final MenuType<Page10Menu> PAGE_10 = register("page_10", (id, inv, extraData) -> new Page10Menu(id, inv, extraData));
	public static final MenuType<Page11Menu> PAGE_11 = register("page_11", (id, inv, extraData) -> new Page11Menu(id, inv, extraData));
	public static final MenuType<Page12Menu> PAGE_12 = register("page_12", (id, inv, extraData) -> new Page12Menu(id, inv, extraData));
	public static final MenuType<Page13Menu> PAGE_13 = register("page_13", (id, inv, extraData) -> new Page13Menu(id, inv, extraData));
	public static final MenuType<Page14Menu> PAGE_14 = register("page_14", (id, inv, extraData) -> new Page14Menu(id, inv, extraData));
	public static final MenuType<Page15Menu> PAGE_15 = register("page_15", (id, inv, extraData) -> new Page15Menu(id, inv, extraData));
	public static final MenuType<Page16Menu> PAGE_16 = register("page_16", (id, inv, extraData) -> new Page16Menu(id, inv, extraData));
	public static final MenuType<Page17Menu> PAGE_17 = register("page_17", (id, inv, extraData) -> new Page17Menu(id, inv, extraData));
	public static final MenuType<Page18Menu> PAGE_18 = register("page_18", (id, inv, extraData) -> new Page18Menu(id, inv, extraData));
	public static final MenuType<Page19Menu> PAGE_19 = register("page_19", (id, inv, extraData) -> new Page19Menu(id, inv, extraData));

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
