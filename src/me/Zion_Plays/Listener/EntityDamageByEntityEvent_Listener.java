package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import me.Zion_Plays.main.mainclass;

public class EntityDamageByEntityEvent_Listener implements Listener {

	private mainclass plugin;

	public EntityDamageByEntityEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	@EventHandler
	public void onEntityDamagebyEntity(EntityDamageByEntityEvent e){
		
		if(e.getEntity() instanceof Player & e.getDamager() instanceof Player){
			e.setCancelled(true);
		}else
			if(e.getEntity() instanceof Player &(!(e.getDamager() instanceof Player))){
				e.setCancelled(true);
			}
	}

}
