package me.Zion_Plays.Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Zion_Plays.Countdowns.COUNTDOWN_Time;
import me.Zion_Plays.Methoden.item_methoden;
import me.Zion_Plays.Methoden.spawnloc_Methoden;
import me.Zion_Plays.main.mainclass;

public class PlayerJoinEvent_Listener implements Listener {

	private mainclass plugin;

	public PlayerJoinEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
		
		
		
	}
	
	@SuppressWarnings({ "static-access", "deprecation" })
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		
		for(Player player : Bukkit.getOnlinePlayers()){
			
			p.hidePlayer(player);
			item_methoden.getIngameItems(p);
			
			
		}
		
		if(plugin.lobby.size() < 100 ){
			
			plugin.lobby1.add(p);
			plugin.lobby.add(p.getName());
			p.showPlayer((Player) plugin.lobby1);
			
		}else
			if(plugin.lobbye.size() < 100){
				
				plugin.lobby2.add(p);
				p.showPlayer((Player) plugin.lobby2);
				plugin.lobbye.add(p.getName());
				
			}else
				if(plugin.lobbyz.size() < 100){
					
					plugin.lobby3.add(p);
					p.showPlayer((Player) plugin.lobby3);
					plugin.lobbyz.add(p.getName());
					
				}else
					if(plugin.lobbyd.size() < 100){
						
						plugin.lobby4.add(p);
						p.showPlayer((Player) plugin.lobby4);
						plugin.lobbyd.add(p.getName());
						
					}else{
						
						p.kickPlayer(plugin.prefix + ChatColor.RED + "Der Server ist voll! Das tut uns leid! Mehr Lobbys werden folgen!");
						
						Bukkit.broadcastMessage(ChatColor.RED + "Das Netzwerk ist voll geworden! Achtung!");
						
						
					}
					
		
		
		
		item_methoden.clearInventory(p);
		spawnloc_Methoden.teleportspawn(p);
		
		
		if(Bukkit.getOnlinePlayers().size() == 1){
			plugin.timecount = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new COUNTDOWN_Time(), 0, 20*1);
		}

		item_methoden.getIngameItems(p);
		if(p.hasPermission("server.join.message")){
			e.setJoinMessage(plugin.prefix + "§aDer Spieler " + p.getDisplayName() + " §ahat den Server betreten!");
			
			
			
		}else{
			e.setJoinMessage("");
		}
		
	}
	
	

}
