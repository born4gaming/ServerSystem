package me.Zion_Plays.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.Zion_Plays.main.mainclass;

public class PlayerDeathEvent_Listener implements Listener {

	private mainclass plugin;

	public PlayerDeathEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e){
		
		Player p = e.getEntity();
		if(p.hasPermission("server.deathmessage")){
			e.setDeathMessage("§4Der Spieler " + p.getDisplayName() + " §4ist gestorben!");
		}else{
			e.setDeathMessage("");
		}
		e.getDrops().clear();
		e.setDroppedExp(0);
		p.setHealth(20.00);
		p.setFoodLevel(20);
		
		for(Player players: Bukkit.getOnlinePlayers()){
			if(players.hasPermission("server.see.Death")){
				players.sendMessage(plugin.prefix + "§3Der Spieler " + e.getEntity().getDisplayName() + " §3ist gestorben" + players.getKiller());
			}
		}
	}

}
