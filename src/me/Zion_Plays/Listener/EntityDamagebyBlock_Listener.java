package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

import me.Zion_Plays.main.mainclass;

public class EntityDamagebyBlock_Listener implements Listener {

	private mainclass plugin;

	public EntityDamagebyBlock_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
		
	}
	@EventHandler
	public void onEntityDamagebyBlock(EntityDamageByBlockEvent e){
		e.setCancelled(true);
	}

}
