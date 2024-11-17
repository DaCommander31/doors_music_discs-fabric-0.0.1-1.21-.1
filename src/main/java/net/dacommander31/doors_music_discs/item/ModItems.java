package net.dacommander31.doors_music_discs.item;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.dacommander31.doors_music_discs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

public class ModItems {
    public static final Item RESONATOR = registerItem("resonator",
            new Item(new Item.Settings()));
    public static final Item INSTRUMENT_SHUFFLER = registerItem("instrument_shuffler",
            new Item(new Item.Settings()));
    public static final Item DAWN_OF_THE_DOORS_MUSIC_DISC = registerItem("dawn_of_the_doors_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DAWN_OF_THE_DOORS_KEY)));
    public static final Item ELEVATOR_JAM_MUSIC_DISC = registerItem("elevator_jam_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_KEY)));
    public static final Item GUIDING_LIGHT_MUSIC_DISC = registerItem("guiding_light_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_GUIDING_LIGHT_KEY)));
    public static final Item UNHINGED_MUSIC_DISC = registerItem("unhinged_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_UNHINGED_KEY)));
    public static final Item HERE_I_COME_MUSIC_DISC = registerItem("here_i_come_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_HERE_I_COME_KEY)));
    public static final Item JEFFS_JINGLE_MUSIC_DISC = registerItem("jeffs_jingle_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_JEFFS_JINGLE_KEY)));
    public static final Item UNHINGED_2_MUSIC_DISC = registerItem("unhinged_2_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_UNHINGED_2_KEY)));
    public static final Item ELEVATOR_JAMMED_MUSIC_DISC = registerItem("elevator_jammed_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAMMED_KEY)));
    public static final Item ELEVATOR_JAM_REMIX_MUSIC_DISC = registerItem("elevator_jam_remix_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_REMIX_KEY)));
    public static final Item DOORS_TRAILER_REMIX_MUSIC_DISC = registerItem("doors_trailer_remix_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DOORS_TRAILER_REMIX_KEY)));
    public static final Item DUSK_OF_THE_DOORS_MUSIC_DISC = registerItem("dusk_of_the_doors_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DUSK_OF_THE_DOORS_KEY)));
    public static final Item CURIOUS_LIGHT_MUSIC_DISC = registerItem("curious_light_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_CURIOUS_LIGHT_KEY)));
    public static final Item JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC = registerItem("jeffs_jingle_dnb_remix_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_JEFFS_JINGLE_DNB_REMIX_KEY)));
    public static final Item MAKE_HASTE_MUSIC_DISC = registerItem("make_haste_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_MAKE_HASTE_KEY)));
    public static final Item SEEK_MERCH_TRAILER_THEME_MUSIC_DISC = registerItem("seek_merch_trailer_theme_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_SEEK_MERCH_TRAILER_THEME_KEY)));
    public static final Item ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC = registerItem("elevator_jam_retro_mode_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_RETRO_MODE_KEY)));
    public static final Item ELEVATOR_JAM_VOICED_MUSIC_DISC = registerItem("elevator_jam_april_fools_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_VOICED_KEY)));
    public static final Item READY_OR_NOT_MUSIC_DISC = registerItem("ready_or_not_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_READY_OR_NOT_KEY)));
    public static final Item READY_TO_RUMBLE_MUSIC_DISC = registerItem("ready_to_rumble_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_READY_TO_RUMBLE_KEY)));
    public static final Item JEFFS_JAM_MUSIC_DISC = registerItem("jeffs_jam_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_JEFFS_JAM_KEY)));
    public static final Item OH_DAM_MUSIC_DISC = registerItem("oh_dam_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_OH_DAM_KEY)));
    public static final Item FRESH_RAIN_MUSIC_DISC = registerItem("fresh_rain_music_disc",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_FRESH_RAIN_KEY)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RobloxDoorsMusicDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RobloxDoorsMusicDiscs.LOGGER.info("Registering Mod Items for " + RobloxDoorsMusicDiscs.MOD_ID);
    }
}
