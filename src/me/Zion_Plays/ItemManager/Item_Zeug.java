package me.Zion_Plays.ItemManager;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import me.Zion_Plays.Methoden.Navigator_methoden;
import me.Zion_Plays.Methoden.Zeug_Methoden;
import me.Zion_Plays.main.mainclass;

public class Item_Zeug implements Listener {

	private mainclass plugin;

	public Item_Zeug(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	@EventHandler
	public void onGadgetsIntercat(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK | e.getAction() == Action.RIGHT_CLICK_AIR ){
			try{
				
			if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fGadgets")){
				
				Player p = e.getPlayer();
				Zeug_Methoden.loadZeug(p);
				
				
				
				
				
				
			}
				
			}catch(Exception ex){
				
			}}

		
	}
		
	@SuppressWarnings("static-access")
	@EventHandler
	public void onGadgets(InventoryClickEvent e){
		
		if(e.getInventory().getName().equalsIgnoreCase("§eBoots")){
			
			Player p = (Player) e.getWhoClicked();
			Zeug_Methoden.loadZeugmenu(p);
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Flyboots")){
				
				if(plugin.flyboots.contains(p.getName())){
					p.getInventory().getBoots().setType(null);
					plugin.flyboots.remove(p.getName());
                    p.closeInventory();
				}else
					if(!plugin.flyboots.contains(p.getName())){
						p.getInventory().getBoots().setType(Material.LEATHER_BOOTS);
						plugin.flyboots.add(p.getName());
                       
					}
				
			}} 

		
		
	}
	

	
	

}
