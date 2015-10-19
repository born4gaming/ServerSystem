package me.Zion_Plays.ItemManager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import com.google.common.util.concurrent.ExecutionError;

import me.Zion_Plays.Methoden.Navigator_methoden;
import me.Zion_Plays.Methoden.spawnloc_Methoden;
import me.Zion_Plays.main.mainclass;

public class Item_navigator implements Listener {

	private mainclass plugin;

	public Item_navigator(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	/*
	 * MagicGames
	 * Spawn
	 * BedWars
	 * Spleef
	 * 1vs1
	 * HungerGames
	 */
	
	@EventHandler
	public void onNavigatorInteract(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK | e.getAction() == Action.RIGHT_CLICK_AIR ){
			try{
				
			if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eGames Teleporter")){
				
				Player p = e.getPlayer();
				
				Navigator_methoden.loadNavigatorInv(p);
				
				
				
				
				
			}
				
			}catch(Exception ex){
				
			}
			

	}
		

			
			
		
		
		
		
	}
	@EventHandler
	public void onNavigatorInvInteract(InventoryClickEvent e){

			if(e.getInventory().getName().equalsIgnoreCase("§eWähle deinen SpielModu")){
				Player p =(Player) e.getWhoClicked();
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bSpawn")){
					spawnloc_Methoden.teleportspawn(p);
					
				}
				}catch(Exception ex){
					
				}
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dMagicGames")){
					
				}
				}catch(Exception ex){
					
				}
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cHungerGames")){
					
				}
				}catch(Exception ex){
					
				}
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eBedWars")){
					
				}
				}catch(Exception ex){
					
				}
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§71vs1")){
					
				}
				}catch(Exception ex){
					
				}
				try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Spleef")){
					
				}
				}catch(Exception ex){
					
				}
				
				
			}
		}
	
		

}
