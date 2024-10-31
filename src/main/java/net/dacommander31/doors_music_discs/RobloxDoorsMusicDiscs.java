package net.dacommander31.doors_music_discs;

import net.dacommander31.doors_music_discs.item.ModItemGroups;
import net.dacommander31.doors_music_discs.item.ModItems;
import net.dacommander31.doors_music_discs.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RobloxDoorsMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "doors_music_discs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModSounds.registerSounds();

	}
}