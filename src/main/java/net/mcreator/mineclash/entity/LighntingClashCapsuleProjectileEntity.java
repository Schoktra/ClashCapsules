
package net.mcreator.mineclash.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.mineclash.procedures.LighntingClashCapsuleEffectProcedure;
import net.mcreator.mineclash.init.MineclashModItems;
import net.mcreator.mineclash.init.MineclashModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class LighntingClashCapsuleProjectileEntity extends AbstractArrow implements ItemSupplier {
	public LighntingClashCapsuleProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MineclashModEntities.LIGHNTING_CLASH_CAPSULE_PROJECTILE.get(), world);
	}

	public LighntingClashCapsuleProjectileEntity(EntityType<? extends LighntingClashCapsuleProjectileEntity> type, Level world) {
		super(type, world);
	}

	public LighntingClashCapsuleProjectileEntity(EntityType<? extends LighntingClashCapsuleProjectileEntity> type, double x, double y, double z,
			Level world) {
		super(type, x, y, z, world);
	}

	public LighntingClashCapsuleProjectileEntity(EntityType<? extends LighntingClashCapsuleProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(MineclashModItems.LIGHNTING_CLASH_CAPSULE_PROJECTILE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		LighntingClashCapsuleEffectProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		LighntingClashCapsuleEffectProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static LighntingClashCapsuleProjectileEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage,
			int knockback) {
		LighntingClashCapsuleProjectileEntity entityarrow = new LighntingClashCapsuleProjectileEntity(
				MineclashModEntities.LIGHNTING_CLASH_CAPSULE_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
				SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static LighntingClashCapsuleProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		LighntingClashCapsuleProjectileEntity entityarrow = new LighntingClashCapsuleProjectileEntity(
				MineclashModEntities.LIGHNTING_CLASH_CAPSULE_PROJECTILE.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
				SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
