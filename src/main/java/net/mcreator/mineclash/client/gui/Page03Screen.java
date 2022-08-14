
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

import net.mcreator.mineclash.world.inventory.Page03Menu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Page03Screen extends AbstractContainerScreen<Page03Menu> {
	private final static HashMap<String, Object> guistate = Page03Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Page03Screen(Page03Menu container, Inventory inventory, Component text) {
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
		this.blit(ms, this.leftPos + -2, this.topPos + -11, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mineclash:textures/logo2b.png"));
		this.blit(ms, this.leftPos + 39, this.topPos + 102, 0, 0, 1649, 1000, 1649, 1000);

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
		this.font.draw(poseStack, "What is MineClash ?", 33, -2, -16777216);
		this.font.draw(poseStack, "MineClash is a passion", 33, 16, -16777216);
		this.font.draw(poseStack, "projeced based on the", 33, 25, -16777216);
		this.font.draw(poseStack, "YouTube series called", 33, 34, -16777216);
		this.font.draw(poseStack, "\"TubeClash\".", 33, 43, -16777216);
		this.font.draw(poseStack, "TubeClash pitted small", 33, 61, -16777216);
		this.font.draw(poseStack, "YouTuber aginst one", 33, 70, -16777216);
		this.font.draw(poseStack, "another in form of", 33, 79, -16777216);
		this.font.draw(poseStack, "two \"Clashes\", A and B.", 33, 88, -16777216);
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
