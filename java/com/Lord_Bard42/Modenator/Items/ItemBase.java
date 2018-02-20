package com.Lord_Bard42.Modenator.Items;

import com.Lord_Bard42.Modenator.init.ModItems;
import com.Lord_Bard42.Modenator.util.IHasModel;
import com.Lord_Bard42.Modenator.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
	
		
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}

}
