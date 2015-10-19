package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import me.Zion_Plays.main.mainclass;

public class EntityDeathEvent_Listener implements Listener {

	private mainclass plugin;

	public EntityDeathEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void onDeathEvent(EntityDeathEvent e){
		
		Player p = (Player) e.getEntity();
		if(e.getEntity() instanceof Player){
			e.getDrops().clear();
			e.setDroppedExp(0);
			e.getEntityType();
			
			p.kickPlayer(plugin.prefix + "§cDu hast einen Fehler verursacht und wurdest deswegen gekickt! Joine neu!");
			
			if(e.getEntity().getWorld().getName().equalsIgnoreCase("world")){
				
			}
			
		}
		
	}

}
