package me.Zion_Plays.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.Zion_Plays.Methoden.item_methoden;
import me.Zion_Plays.main.mainclass;

public class PlayerQuitEvent_Listener implements Listener {




	
	private mainclass plugin;
	public PlayerQuitEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	@SuppressWarnings("static-access")
	@EventHandler
	public void onJoin(PlayerQuitEvent e){
		Player p = e.getPlayer();
		
		if(Bukkit.getOnlinePlayers().size() == 0){
			Bukkit.getScheduler().cancelTask(plugin.timecount);
		}

		item_methoden.getIngameItems(p);
		if(p.hasPermission("server.quit.message")){
			e.setQuitMessage(plugin.prefix + "§aDer Spieler " + p.getDisplayName() + " §ahat den Server verlassen!");
			
			
			
		}else{
			e.setQuitMessage("");
		}
		
	}

}
