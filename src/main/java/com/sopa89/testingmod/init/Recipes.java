package com.sopa89.testingmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.chain, 2), "barsIron", "barsIron", "barsIron", "barsIron"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_BOOTS), "c c", "c c", 'c', "chainIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS), "ccc", "c c", "c c", 'c', "chainIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE), "c c", "ccc", "ccc", 'c', "chainIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_HELMET), "ccc", "c c", 'c', "chainIron"));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.sandwich), "meatCooked", "bread"));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.NAME_TAG), "chainIron", "tagGold"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.goldTag), "ggg", 'g', "ingotGold"));
	}
}
