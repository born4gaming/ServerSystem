package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import me.Zion_Plays.Methoden.spawnloc_Methoden;
import me.Zion_Plays.main.mainclass;

public class EntityDamageEvent_Listener implements Listener {

	private mainclass plugin;

	public EntityDamageEvent_Listener(mainclass mainclass) {
		this.plugin = (mainclass);
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	@EventHandler
	public void onEntityDamge(EntityDamageEvent e){
		if(e.getEntity() instanceof Player) {
			
			Player p = (Player) e.getEntity();
			
			if(p.getFireTicks() > 0){
				p.setFireTicks(0);
			}
			
			if(e.getCause() == DamageCause.VOID){
				spawnloc_Methoden.teleportspawn(p);
				
			}else{
				e.setCancelled(true);
			}
		}
	}
	
	
	
	

}
