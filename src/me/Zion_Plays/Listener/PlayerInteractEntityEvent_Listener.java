package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import me.Zion_Plays.main.mainclass;

public class PlayerInteractEntityEvent_Listener implements Listener {

	private mainclass plugin;

	public PlayerInteractEntityEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	@EventHandler
	public void onPlayerInteract(PlayerInteractEntityEvent e){
		
		Player p = e.getPlayer();
		
	}

}
