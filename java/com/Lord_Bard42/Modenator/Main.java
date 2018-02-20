package com.Lord_Bard42.Modenator;
import com.Lord_Bard42.Modenator.proxy.CommonProxy;
import com.Lord_Bard42.Modenator.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name= Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler()
	public void preinit(FMLPreInitializationEvent event){
		
	}
	

	@EventHandler()
	public void init(FMLInitializationEvent event){
		
	}
	

	@EventHandler()
	public void Postinit(FMLPostInitializationEvent event){
		
	}
	
	
}

