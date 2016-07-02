package com.sopa89.testingmod;

import com.sopa89.testingmod.handler.ConfigurationHandler;
import com.sopa89.testingmod.init.ModItems;
import com.sopa89.testingmod.init.Recipes;
import com.sopa89.testingmod.proxy.IProxy;
import com.sopa89.testingmod.reference.Reference;
import com.sopa89.testingmod.utility.LogHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class TestingMod
{
	@Mod.Instance(Reference.MOD_ID)
	public static TestingMod instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
		
		ModItems.init();
		
		LogHelper.info("Pre-init finished");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModItems.reg();
		
		Recipes.init();
		
		LogHelper.info("Init finished");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post-init finished");
	}
}
