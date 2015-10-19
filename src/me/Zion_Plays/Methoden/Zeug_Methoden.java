package me.Zion_Plays.Methoden;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Zeug_Methoden {
	
	public static void loadZeug(Player p){
		
		
		Inventory inv = Bukkit.createInventory(null, 27, "§3Gadgets");
			
		//===========================================================
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
		ItemMeta bootsmeta = boots.getItemMeta();
		bootsmeta.setDisplayName("§eBoots");
		boots.setItemMeta(bootsmeta);
		//===========================================================

		inv.setItem(13, boots);
		
		
	}
	public static void loadZeugmenu(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 27, "§3Boots");
		//===========================================================
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
		ItemMeta bootsmeta = boots.getItemMeta();
		bootsmeta.setDisplayName("§9Flyboots");
		boots.setItemMeta(bootsmeta);
		//===========================================================
		ItemStack smokeboots = new ItemStack(Material.GOLD_BOOTS);
		ItemMeta smokebootsmeta = smokeboots.getItemMeta();
		smokebootsmeta.setDisplayName("§9Smokeboots");
		smokeboots.setItemMeta(smokebootsmeta);
		//===========================================================
		
		inv.setItem(10, boots);
        inv.setItem(12, smokeboots);
			
		
		
	}

}
