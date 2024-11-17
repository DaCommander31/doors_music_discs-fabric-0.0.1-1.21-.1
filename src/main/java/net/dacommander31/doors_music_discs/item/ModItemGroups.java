package net.dacommander31.doors_music_discs.item;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ROBLOX_DOORS_MUSIC_DISCS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RobloxDoorsMusicDiscs.MOD_ID, "roblox_doors_music_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RESONATOR))
                    .displayName(Text.translatable("itemgroup.doors_music_discs.roblox_doors_music_discs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RESONATOR);
                        entries.add(ModItems.INSTRUMENT_SHUFFLER);
                        entries.add(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC);
                        entries.add(ModItems.HERE_I_COME_MUSIC_DISC);
                        entries.add(ModItems.UNHINGED_MUSIC_DISC);
                        entries.add(ModItems.GUIDING_LIGHT_MUSIC_DISC);
                        entries.add(ModItems.ELEVATOR_JAM_MUSIC_DISC);
                        entries.add(ModItems.JEFFS_JINGLE_MUSIC_DISC);
                        entries.add(ModItems.UNHINGED_2_MUSIC_DISC);
                        entries.add(ModItems.ELEVATOR_JAMMED_MUSIC_DISC);
                        entries.add(ModItems.CURIOUS_LIGHT_MUSIC_DISC);
                        entries.add(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC);
                        entries.add(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC);
                        entries.add(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC);
                        entries.add(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC);
                        entries.add(ModItems.MAKE_HASTE_MUSIC_DISC);
                        entries.add(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC);
                        entries.add(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC);
                        entries.add(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC);
                        entries.add(ModItems.READY_OR_NOT_MUSIC_DISC);
                        entries.add(ModItems.READY_TO_RUMBLE_MUSIC_DISC);
                        entries.add(ModItems.JEFFS_JAM_MUSIC_DISC);
                        entries.add(ModItems.OH_DAM_MUSIC_DISC);
                        entries.add(ModItems.FRESH_RAIN_MUSIC_DISC);
                    })
                    .build());



    public static void registerItemGroups() {
        RobloxDoorsMusicDiscs.LOGGER.info("Registering Item Groups for " + RobloxDoorsMusicDiscs.MOD_ID);
    }
}
