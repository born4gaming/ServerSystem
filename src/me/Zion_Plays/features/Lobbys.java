package me.Zion_Plays.features;

import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.Zion_Plays.main.mainclass;

public class Lobbys implements Listener {

	private mainclass plugin;

	public Lobbys(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
		
	}
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e){
		
		Player p = e.getPlayer();
		
		Set<Player> empfänger = e.getRecipients();
		
		if(plugin.lobby1.contains(p.getName())){
			
			empfänger.remove(plugin.lobby2);
			empfänger.remove(plugin.lobby3);
			empfänger.remove(plugin.lobby4);
			
			p.showPlayer((Player) plugin.lobby1);
			
		}else
			if(plugin.lobby2.contains(p.getName())){
				
				empfänger.remove(plugin.lobby1);
				empfänger.remove(plugin.lobby3);
				empfänger.remove(plugin.lobby4);
				p.showPlayer((Player) plugin.lobby2);
				
			}else
				if(plugin.lobby3.contains(p.getName())){
					
					empfänger.remove(plugin.lobby2);
					empfänger.remove(plugin.lobby1);
					empfänger.remove(plugin.lobby4);
					p.showPlayer((Player) plugin.lobby3);
					
				}else
					if(plugin.lobby4.contains(p.getName())){
						
						empfänger.remove(plugin.lobby2);
						empfänger.remove(plugin.lobby3);
						empfänger.remove(plugin.lobby1);
						p.showPlayer((Player) plugin.lobby4);
						
					}
		
		
		
		
		
		
		
		
	}

}
