package me.Zion_Plays.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

import me.Zion_Plays.main.mainclass;

public class PreapereIteamEnchantEvent implements Listener {

	private mainclass plugin;

	public PreapereIteamEnchantEvent(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	@EventHandler
	public void onEnchant(PrepareItemEnchantEvent e){
		e.setCancelled(true);
	}

}
