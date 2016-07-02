package com.sopa89.testingmod.init;

import com.sopa89.testingmod.item.ItemChain;
import com.sopa89.testingmod.item.ItemTM;
import com.sopa89.testingmod.reference.Names;
import com.sopa89.testingmod.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems 
{
	public static final String INV="inventory";
	
	public static final ItemTM chain=new ItemChain();
	
	public static void init()
	{
		GameRegistry.register(chain, new ResourceLocation(Reference.MOD_PREFIX+Names.Items.CHAIN));
		OreDictionary.registerOre("chainIron", new ItemStack(chain));
	}	
	
	public static void reg()
	{
		regHelper(Reference.MOD_PREFIX+Names.Items.CHAIN, chain);
	}
	
	private static void regHelper(String name, Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(name , "inventory"));
	}
}
