package me.Zion_Plays.Listener;

import me.Zion_Plays.main.mainclass;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceEvent_Listener implements Listener {
	
	private mainclass plugin;




	public BlockPlaceEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	
	
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e){
		Player p = e.getPlayer();
		
		if(p.hasPermission("server.build")){
			e.setCancelled(false);
			
		}else{
			p.sendMessage(plugin.prefix + plugin.noperm);
			e.setCancelled(true);
		}
		
		
		
	}

}
