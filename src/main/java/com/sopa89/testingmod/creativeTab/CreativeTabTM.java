package com.sopa89.testingmod.creativeTab;

import com.sopa89.testingmod.init.ModItems;
import com.sopa89.testingmod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM 
{
	public static final CreativeTabs TM_TAB=new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.chain;
		}
	};
}
