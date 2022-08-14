
package net.mcreator.mineclash.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.mineclash.world.inventory.Page04Menu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Page04Screen extends AbstractContainerScreen<Page04Menu> {
	private final static HashMap<String, Object> guistate = Page04Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Page04Screen(Page04Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("mineclash:textures/book.png"));
		this.blit(ms, this.leftPos + -2, this.topPos + -20, 0, 0, 256, 256, 256, 256);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Every MineClash item", 33, -2, -16777216);
		this.font.draw(poseStack, "is based off of stuff", 33, 7, -16777216);
		this.font.draw(poseStack, "that occured in the", 33, 16, -16777216);
		this.font.draw(poseStack, "series. From mobs", 33, 25, -16777216);
		this.font.draw(poseStack, "to items, everything", 33, 34, -16777216);
		this.font.draw(poseStack, "has its roots in", 33, 43, -16777216);
		this.font.draw(poseStack, "the TubeClash", 33, 52, -16777216);
		this.font.draw(poseStack, "franchise.", 33, 61, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 169, 46, 20, new TextComponent("Next"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 169, 46, 20, new TextComponent("Back"), e -> {
		}));
	}
}