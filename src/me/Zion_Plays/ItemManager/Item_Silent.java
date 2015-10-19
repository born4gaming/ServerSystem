package me.Zion_Plays.ItemManager;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Zion_Plays.Methoden.item_methoden;
import me.Zion_Plays.main.mainclass;

public class Item_Silent implements Listener {

	private mainclass plugin;

	public Item_Silent(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	

	@EventHandler
	
	public void onInteract(PlayerInteractEvent e){
	
	if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
		
		Player empfaenger = e.getPlayer();
		Player p = e.getPlayer();
		
		if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fSilent Lobby")){
							
			if(!plugin.SilentLobby.contains(p.getName())){
				plugin.SilentLobby.add(empfaenger);
				
				
				
				for(Player players: Bukkit.getOnlinePlayers()){
					p.hidePlayer(players);
					p.sendMessage(ChatColor.RED + "Du bist nun in der Silent Lobby!");
				}}else{
					
					
					if(plugin.SilentLobby.contains(p.getName())){
						
						plugin.SilentLobby.remove(p.getName());
						
					}
					for(Player players: Bukkit.getOnlinePlayers()){
						p.showPlayer(players);
						p.sendMessage(ChatColor.RED + "Du bist nun in der Silent Lobby!");
					}}}}
					
					
				}
			@EventHandler
			public void onPlayerChatEvent(AsyncPlayerChatEvent e){
				
				
				Set<Player> empfaenger = e.getRecipients();

	
				
				for(Player player : plugin.SilentLobby){
					
					empfaenger.remove(player);
					
				}

			}}
			
		
	



