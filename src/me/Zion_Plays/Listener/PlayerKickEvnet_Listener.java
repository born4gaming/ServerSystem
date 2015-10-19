package me.Zion_Plays.Listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

import me.Zion_Plays.main.mainclass;

public class PlayerKickEvnet_Listener implements Listener {

	private mainclass plugin;

	public PlayerKickEvnet_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	@EventHandler
	public void onKick(PlayerKickEvent e){
		
		if(Bukkit.getOnlinePlayers().size() == 0){
			Bukkit.getScheduler().cancelTask(plugin.timecount);
		}
		
		
		
		
	}

}
