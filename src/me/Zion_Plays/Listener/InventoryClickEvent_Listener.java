package me.Zion_Plays.Listener;

import me.Zion_Plays.Methoden.Magicloc_Methoden;
import me.Zion_Plays.Methoden.bedloc_Methoden;
import me.Zion_Plays.Methoden.hungerloc_Methoden;
import me.Zion_Plays.Methoden.spawnloc_Methoden;
import me.Zion_Plays.Methoden.vsloc_Methoden;
import me.Zion_Plays.main.mainclass;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickEvent_Listener implements Listener {
	
	
	
	
	private mainclass plugin;

	public InventoryClickEvent_Listener(mainclass mainclass) {
		this.plugin = mainclass;
		plugin.getServer().getPluginManager().registerEvents(this, mainclass);
	}

	@EventHandler
	public void onPlayerClick(InventoryClickEvent e){
		
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equalsIgnoreCase("§eWähle deinen SpielModus")){
			
			if(e.getCurrentItem().getType() == Material.MAGMA_CREAM){
				spawnloc_Methoden.teleportspawn(p);
			}else
				if(e.getCurrentItem().getType() == Material.DRAGON_EGG){
					Magicloc_Methoden.teleportspawn(p);
				}else
					if(e.getCurrentItem().getType() == Material.COOKED_BEEF){
						hungerloc_Methoden.teleportspawn(p);
					}else
						if(e.getCurrentItem().getType() == Material.BED){
							bedloc_Methoden.teleportspawn(p);
						}else
							if(e.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE){
								vsloc_Methoden.teleportspawn(p);
							}else
								if(e.getCurrentItem().getType() == Material.DIAMOND_SPADE){
									
								}
			
		}
	}

}
