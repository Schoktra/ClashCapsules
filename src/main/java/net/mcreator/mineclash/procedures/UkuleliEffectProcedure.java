package net.mcreator.mineclash.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class UkuleliEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")), SoundSource.RECORDS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
							SoundSource.RECORDS, 1, 1, false);
				}
			}
		} else {
			if (Math.random() <= 0.1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")), SoundSource.RECORDS, 1, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
								SoundSource.RECORDS, 1, 2, false);
					}
				}
			} else {
				if (Math.random() <= 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")), SoundSource.RECORDS, 1, 3);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
									SoundSource.RECORDS, 1, 3, false);
						}
					}
				} else {
					if (Math.random() <= 0.1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")), SoundSource.RECORDS, 1,
										4);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
										SoundSource.RECORDS, 1, 4, false);
							}
						}
					} else {
						if (Math.random() <= 0.1) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
											SoundSource.RECORDS, 1, 5);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
											SoundSource.RECORDS, 1, 5, false);
								}
							}
						} else {
							if (Math.random() <= 0.1) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
												SoundSource.RECORDS, 1, 6);
									} else {
										_level.playLocalSound(x, y, z,
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")),
												SoundSource.RECORDS, 1, 6, false);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
