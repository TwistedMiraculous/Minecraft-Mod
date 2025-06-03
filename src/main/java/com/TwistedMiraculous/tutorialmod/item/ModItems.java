package com.TwistedMiraculous.tutorialmod.item;

import com.TwistedMiraculous.tutorialmod.tutorialmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialmod.MOD_ID);

    public static final RegistryObject<Item> SPICEROCK_DUST = ITEMS.register("spicerock_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBRANIUM = ITEMS.register("rubranium",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}