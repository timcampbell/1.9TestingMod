package com.sopa89.testingmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.chain, 2), new ItemStack(Blocks.IRON_BARS), new ItemStack(Blocks.IRON_BARS), new ItemStack(Blocks.IRON_BARS), new ItemStack(Blocks.IRON_BARS)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_BOOTS), "c c", "c c", 'c', "chainIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS), "ccc", "c c", "c c", 'c', "chainIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE), "c c", "ccc", "ccc", 'c', "chainIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.CHAINMAIL_HELMET), "ccc", "c c", 'c', "chainIron"));
	}
}
