package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        simpleItem(ModItems.RESONATOR, itemModelGenerator);
        simpleItem(ModItems.INSTRUMENT_SHUFFLER, itemModelGenerator);
        simpleItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.ELEVATOR_JAM_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.GUIDING_LIGHT_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.UNHINGED_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.HERE_I_COME_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.JEFFS_JINGLE_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.UNHINGED_2_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.ELEVATOR_JAMMED_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.CURIOUS_LIGHT_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.MAKE_HASTE_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.READY_OR_NOT_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.READY_TO_RUMBLE_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.JEFFS_JAM_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.OH_DAM_MUSIC_DISC, itemModelGenerator);
        simpleItem(ModItems.FRESH_RAIN_MUSIC_DISC, itemModelGenerator);
    }

    private static void simpleItem(Item item, ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(item, Models.GENERATED);
    }
}
