package me.Zion_Plays.Methoden;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class item_methoden {
	

	

	public static void clearInventory(Player p){
		
		p.getActivePotionEffects().clear();
		p.getInventory().clear();
		p.getInventory().setHelmet(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setBoots(null);
		p.setLevel(0);
		p.setExp(0);
		p.setAllowFlight(false);
		p.setFlying(false);
		p.setGameMode(GameMode.SURVIVAL);
		p.setHealth(20.00);
		p.setFoodLevel(20);
		p.setFireTicks(0);
		
	}
	
	public static void getIngameItems(Player p){
		
		//============================================================
		ItemStack navigator = new ItemStack(Material.COMPASS);
		ItemMeta navigatormeta = navigator.getItemMeta();
		navigatormeta.setDisplayName("§eGames Teleporter");
		navigator.setItemMeta(navigatormeta);
		
		//============================================================
		ItemStack hide = new ItemStack(Material.BLAZE_ROD);
		ItemMeta hidemeta = hide.getItemMeta();
		hidemeta.setDisplayName("§4Spieler Verstecken");
		hide.setItemMeta(hidemeta);
		
		//============================================================[Nur für Youtuber]
		ItemStack nick = new ItemStack(Material.NAME_TAG);
		ItemMeta nickmeta = nick.getItemMeta();
		nickmeta.setDisplayName("§4Nick in der Runde(W.I.P.)");
		nick.setItemMeta(nickmeta);
		//============================================================[Nur für Youtuber]
		ItemStack silent = new ItemStack(Material.REDSTONE_LAMP_OFF);
		ItemMeta silentmeta = silent.getItemMeta();
		silentmeta.setDisplayName("§fSilent Lobby");
		silent.setItemMeta(silentmeta);
		//============================================================

		ItemStack Zeug = new ItemStack(Material.CHEST);
		ItemMeta Zeugmeta = Zeug.getItemMeta();
		Zeugmeta.setDisplayName("§fGadgets(W.I.P)");
		Zeug.setItemMeta(Zeugmeta);
		//============================================================

		ItemStack Lobby = new ItemStack(Material.NETHER_STAR);
		ItemMeta Lobbymeta = Lobby.getItemMeta();
		Lobbymeta.setDisplayName("§eLobby wechseln");
		Lobby.setItemMeta(Lobbymeta);
		//============================================================
		
		p.getInventory().setItem(0, navigator);
		p.getInventory().setItem(8, hide);
		p.getInventory().setItem(4, Zeug);
		p.getInventory().setItem(7, Lobby);
		
		if(p.hasPermission("server.Lobby.VIP")){
			p.getInventory().setItem(1, silent);
			p.getInventory().setItem(6, nick);
		}
		p.updateInventory();
		
	}

}
