package me.Zion_Plays.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.Zion_Plays.main.mainclass;

public class BlockBreackEvent_Listener implements Listener {

	private mainclass plugin;

	public BlockBreackEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}
	
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void onBlock(BlockBreakEvent e){
		Player p = e.getPlayer();
		
		if(p.hasPermission("server.build")){
			e.setCancelled(false);
			
		}else{
			p.sendMessage(plugin.prefix + plugin.noperm);
			e.setCancelled(true);
		}
		
		
		
	}

}
