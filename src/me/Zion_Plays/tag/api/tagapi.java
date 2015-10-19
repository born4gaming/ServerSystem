package me.Zion_Plays.tag.api;



import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.Zion_Plays.main.mainclass;

public class tagapi implements Listener  {

	private mainclass plugin;

	public tagapi(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e){
		
		Player p = e.getPlayer();
		
		
		
		for(Player all: Bukkit.getOnlinePlayers()){
			
			
			//if(p.hasPermission("chat.Owner")){
			//all.sendMessage(plugin.owner + e.getPlayer() + "§e>>" + e.getMessage());
			//e.setCancelled(true);
			//	}else
			//	if(p.hasPermission("chat.Admin")){
					//		all.sendMessage(plugin.Admin + e.getPlayer() + "§e>>" + e.getMessage());
					
			//	}else
			//	if(p.hasPermission("chat.Moderator")){
			//		all.sendMessage(plugin.Moderator + e.getPlayer() + "§e>>" + e.getMessage());
						
			//}						
			//else
			//if(p.hasPermission("chat.Builder")){
			//	all.sendMessage(plugin.Builder + e.getPlayer() + "§e>>" + e.getMessage());
							
			//}else
			//	if(p.hasPermission("chat.VIP")){
			//	all.sendMessage(plugin.VIP + e.getPlayer() + "§e>>" + e.getMessage());
									

									
			//}else{
			//	all.sendMessage(plugin.Spieler + e.getPlayer() + "§e>>" + e.getMessage());
									
			//	}
						
					

									

			//		
			//	}
		

		if(!plugin.silent.contains(p.getName())){
				e.setCancelled(false);
				
			}
		
		if(plugin.silent.contains(p.getName())){
			    
			    e.setCancelled(true);
		


		}
	
		
	
		
	}
	

	

	}}
