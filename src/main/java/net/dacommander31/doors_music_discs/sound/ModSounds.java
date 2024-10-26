package net.dacommander31.doors_music_discs.sound;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static RegistryEntry.Reference<SoundEvent> DAWN_OF_THE_DOORS = registerReference("music_disc.dawn_of_the_doors");
    public static RegistryEntry.Reference<SoundEvent> ELEVATOR_JAM = registerReference("music_disc.elevator_jam");
    public static RegistryEntry.Reference<SoundEvent> GUIDING_LIGHT = registerReference("music_disc.guiding_light");
    public static RegistryEntry.Reference<SoundEvent> UNHINGED = registerReference("music_disc.unhinged");
    public static RegistryEntry.Reference<SoundEvent> JEFFS_JINGLE = registerReference("music_disc.jeffs_jingle");
    public static RegistryEntry.Reference<SoundEvent> UNHINGED_2 = registerReference("music_disc.unhinged_2");
    public static RegistryEntry.Reference<SoundEvent> ELEVATOR_JAMMED = registerReference("music_disc.elevator_jammed");
    public static RegistryEntry.Reference<SoundEvent> CURIOUS_LIGHT = registerReference("music_disc.curious_light");
    public static RegistryEntry.Reference<SoundEvent> ELEVATOR_JAM_REMIX = registerReference("music_disc.elevator_jam_remix");
    public static RegistryEntry.Reference<SoundEvent> DOORS_TRAILER_REMIX = registerReference("music_disc.doors_trailer_remix");
    public static RegistryEntry.Reference<SoundEvent> DUSK_OF_THE_DOORS = registerReference("music_disc.dusk_of_the_doors");
    public static RegistryEntry.Reference<SoundEvent> JEFFS_JINGLE_DNB_REMIX = registerReference("music_disc.jeffs_jingle_dnb_remix");
    public static RegistryEntry.Reference<SoundEvent> MAKE_HASTE = registerReference("music_disc.make_haste");
    public static RegistryEntry.Reference<SoundEvent> SEEK_MERCH_TRAILER_THEME = registerReference("music_disc.seek_merch_trailer_theme");
    public static RegistryEntry.Reference<SoundEvent> ELEVATOR_JAM_RETRO_MODE = registerReference("music_disc.elevator_jam_retro_mode");
    public static RegistryEntry.Reference<SoundEvent> ELEVATOR_JAM_VOICED = registerReference("music_disc.elevator_jam_voiced");
    public static RegistryEntry.Reference<SoundEvent> READY_OR_NOT = registerReference("music_disc.ready_or_not");
    public static RegistryEntry.Reference<SoundEvent> READY_TO_RUMBLE = registerReference("music_disc.ready_to_rumble");
    public static RegistryEntry.Reference<SoundEvent> JEFFS_JAM = registerReference("music_disc.jeffs_jam");
    public static RegistryEntry.Reference<SoundEvent> OH_DAM = registerReference("music_disc.oh_dam");
    public static RegistryEntry.Reference<SoundEvent> FRESH_RAIN = registerReference("music_disc.fresh_rain");


    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(RobloxDoorsMusicDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static RegistryEntry.Reference<SoundEvent> registerReference(String name) {
        Identifier id = Identifier.of(RobloxDoorsMusicDiscs.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        RobloxDoorsMusicDiscs.LOGGER.info("Registering Sounds for " + RobloxDoorsMusicDiscs.MOD_ID);
    }
}
