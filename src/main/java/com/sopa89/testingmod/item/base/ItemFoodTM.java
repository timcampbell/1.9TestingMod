package com.sopa89.testingmod.item.base;

import com.sopa89.testingmod.creativeTab.CreativeTabTM;
import com.sopa89.testingmod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFoodTM extends ItemFood
{
	public ItemFoodTM(int amount, float sat)
	{
		super(amount, sat, false);
		setCreativeTab(CreativeTabTM.TM_TAB);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s",Reference.MOD_ID+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s",Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
