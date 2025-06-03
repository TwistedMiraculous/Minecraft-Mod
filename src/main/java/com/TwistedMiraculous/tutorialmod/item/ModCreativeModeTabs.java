package com.TwistedMiraculous.tutorialmod.item;

import com.TwistedMiraculous.tutorialmod.tutorialmod;
import com.TwistedMiraculous.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, tutorialmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_ITEMS_TAB = CREATIVE_MODE_TABS.register("custom_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPICEROCK_DUST.get()))
                    .title(Component.translatable("creativetab.tutorialmod.custom_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SPICEROCK_DUST.get());
                        output.accept(ModItems.RUBRANIUM.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> CUSTOM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("custom_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POTION_BLOCK.get()))
                    .withTabsBefore(CUSTOM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.custom_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.POTION_BLOCK.get());
                        output.accept(ModBlocks.RUBINITE_BLOCK.get());

                        output.accept(ModBlocks.RUBINITE_ORE.get());
                        output.accept(ModBlocks.SPICEROCK_BLOCK.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}