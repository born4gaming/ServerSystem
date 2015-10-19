package me.Zion_Plays.ItemManager;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Zion_Plays.Methoden.HideItem_Methoden;
import me.Zion_Plays.main.mainclass;

public class Item_hider implements Listener {

	private mainclass plugin;

	public Item_hider(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	
	}
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		
		if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
			Player p = e.getPlayer();
			try{
				if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4Spieler Verstecken")){
					HideItem_Methoden.openHideInv(p);
					
				}
				
			}catch(Exception ex){
				
			}

			
		}
		
	}
	
	@EventHandler
	public void onInvnteract(InventoryClickEvent e){
		
		Player p = (Player) e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§4Spieler Verstecken")){
			try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(" ")){
					e.setCancelled(true);
				}
				
			}catch(Exception ex){
				
			}
			p.closeInventory();
			try{
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aAlle Spieler anzeigen!")){
					e.setCancelled(true);
					
					if(plugin.hidden1.contains(p.getName())){
						plugin.hidden1.remove(p.getName());
					}
					if(!plugin.hidden2.contains(p.getName())){
						plugin.hidden2.add(p.getName());
					}
					
					for(Player players: Bukkit.getOnlinePlayers()) {
						p.showPlayer(players);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
					}
				}
				p.closeInventory();	
			}catch(Exception ex){
		}
			try{
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§1Nur Admins und VIPs anzeigen!")){
				e.setCancelled(true);
				
				if(plugin.hidden2.contains(p.getName())){
					plugin.hidden2.remove(p.getName());
				
				if(!plugin.hidden1.contains(p.getName())){
					plugin.hidden1.add(p.getName());
				}

				}
				for(Player players: Bukkit.getOnlinePlayers()) {
					if(players.hasPermission("server.visible")){
						p.showPlayer(players);
						p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
						
					}else{
						p.hidePlayer(players);
					}
				}
				
			}
			p.closeInventory();
		}catch(Exception ex){
			
	}
			try{
			if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAlle Spieler verstecken!")){
				e.setCancelled(true);
				for(Player players: Bukkit.getOnlinePlayers()) {
					p.hidePlayer(players);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
				}
				
				
			}
			
		}catch(Exception ex){
			
	}
		
		
		
		
		}
	
	

}
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		
		for(Player players: Bukkit.getOnlinePlayers()){
			
			if(plugin.hidden1.contains(players.getName())){
				players.hidePlayer(p);
				return;
			}
			if(plugin.hidden2.contains(players.getName())){
				if(p.hasPermission("server.visible")){
					players.showPlayer(players);
					
				}else{
					players.hidePlayer(p);
				}
				return;
			}
			if(plugin.hidden1.contains(players.getName()) & !plugin.hidden2.contains(players.getName())){
				players.showPlayer(p);
			}
			
		}
		
	}
	}
