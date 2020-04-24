package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus=Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class iteminit 
{	
	public static final Item example_item = null;
	
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
	}
}
