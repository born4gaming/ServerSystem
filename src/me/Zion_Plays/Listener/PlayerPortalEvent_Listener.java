package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

import me.Zion_Plays.Methoden.spawnloc_Methoden;
import me.Zion_Plays.main.mainclass;

public class PlayerPortalEvent_Listener implements Listener {

	private mainclass plugin;

	public PlayerPortalEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	@EventHandler
	public void onPlayerPortal(PlayerPortalEvent e){
		e.setCancelled(true);
		
		Player p = e.getPlayer();
		spawnloc_Methoden.teleportspawn(p);
				
	}

}
