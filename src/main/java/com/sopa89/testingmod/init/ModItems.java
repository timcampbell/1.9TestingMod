package com.sopa89.testingmod.init;

import java.util.ArrayList;

import com.sopa89.testingmod.item.ItemChain;
import com.sopa89.testingmod.item.ItemFoodSandwich;
import com.sopa89.testingmod.item.base.ItemFoodTM;
import com.sopa89.testingmod.item.base.ItemTM;
import com.sopa89.testingmod.reference.Names;
import com.sopa89.testingmod.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems 
{
	
	public static final ItemTM chain=new ItemChain();
	public static final ItemFoodTM sandwich=new ItemFoodSandwich();
	
	public static void init()
	{
		GameRegistry.register(chain, new ResourceLocation(Reference.MOD_PREFIX+Names.Items.CHAIN));
		GameRegistry.register(sandwich, new ResourceLocation(Reference.MOD_PREFIX+Names.Items.SANDWICH));
		
		OreDictionary.registerOre("chainIron", new ItemStack(chain));
		
		OreDictionary.registerOre("bread", Items.BREAD);
		
		OreDictionary.registerOre("meatCooked", Items.COOKED_PORKCHOP);
		OreDictionary.registerOre("meatCooked", Items.COOKED_BEEF);
		OreDictionary.registerOre("meatCooked", Items.COOKED_CHICKEN);
		OreDictionary.registerOre("meatCooked", Items.COOKED_MUTTON);
		OreDictionary.registerOre("meatCooked", Items.COOKED_RABBIT);
		OreDictionary.registerOre("meatCooked", new ItemStack(Items.COOKED_FISH, 1, 0));
		OreDictionary.registerOre("meatCooked", new ItemStack(Items.COOKED_FISH, 1, 1));
		
		OreDictionary.registerOre("barIron", Blocks.IRON_BARS);
		
	}	
	
	public static void reg()
	{
		regHelper(Reference.MOD_PREFIX+Names.Items.CHAIN, chain);
		regHelper(Reference.MOD_PREFIX+Names.Items.SANDWICH, sandwich);
	}
	
	private static void regHelper(String name, Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(name , "inventory"));
	}
}
