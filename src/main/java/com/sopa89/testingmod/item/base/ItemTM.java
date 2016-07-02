package com.sopa89.testingmod.item.base;

import com.sopa89.testingmod.creativeTab.CreativeTabTM;
import com.sopa89.testingmod.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTM extends Item
{
	public ItemTM()
	{
		super();
		this.setCreativeTab(CreativeTabTM.TM_TAB);
	}
	
//	@Override
//	public Item setUnlocalizedName(String name)
//	{
//		super.setUnlocalizedName(name);
//		GameRegistry.register(this, new ResourceLocation(Reference.MOD_PREFIX+name));
//		
//		return this;
//	}
	
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
