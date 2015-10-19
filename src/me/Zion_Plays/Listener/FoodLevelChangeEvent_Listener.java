package me.Zion_Plays.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import me.Zion_Plays.main.mainclass;

public class FoodLevelChangeEvent_Listener implements Listener {

	private mainclass plugin;

	public FoodLevelChangeEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	@EventHandler
	public void onFoodLevelChange(FoodLevelChangeEvent e){
		e.setCancelled(true);
	}

}
