package me.Zion_Plays.features;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import me.Zion_Plays.main.mainclass;

public class Jumpplate implements Listener {

	private mainclass plugin;

	public Jumpplate(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent e){
		
		Player p = e.getPlayer();
		
		if(p.getLocation().getBlock().getType() == Material.GOLD_PLATE){
			
			Vector v = p.getLocation().getDirection().multiply(3.5D).setY(2.0D);
			p.setVelocity(v);
			
		}

		
		
		
	}

}
