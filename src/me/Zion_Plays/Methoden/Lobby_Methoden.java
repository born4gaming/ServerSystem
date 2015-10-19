package me.Zion_Plays.Methoden;

import me.Zion_Plays.main.mainclass;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Lobby_Methoden {
	private mainclass plugin;

	public Lobby_Methoden(mainclass mainclass) {
		this.plugin = mainclass;
	}

	public static void loadNavigatorInv(Player p) {
		
		Inventory inv = Bukkit.createInventory(null, 27, "§eWähle deinen Server");
		
		
		//===========================================================
		ItemStack lobby1 = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta lobby1meta = lobby1.getItemMeta();
		lobby1meta.setDisplayName("§bLobby1");
		lobby1.setItemMeta(lobby1meta);
		//===========================================================
		ItemStack lobby2 = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta lobby2meta = lobby2.getItemMeta();
		lobby2meta.setDisplayName("§bLobby2");
		lobby2.setItemMeta(lobby2meta);
		//===========================================================
		ItemStack lobby3 = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta lobby3meta = lobby3.getItemMeta();
		lobby3meta.setDisplayName("§bLobby3");
		lobby3.setItemMeta(lobby3meta);
		//===========================================================
		ItemStack lobby4 = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta lobby4meta = lobby4.getItemMeta();
		lobby4meta.setDisplayName("§bLobby4");
		lobby4.setItemMeta(lobby4meta);
		//===========================================================
		ItemStack green = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)13);
		ItemMeta greenmeta = green.getItemMeta();
		greenmeta.setDisplayName(null);
		green.setItemMeta(greenmeta);
		//===========================================================
		ItemStack blue = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
		ItemMeta bluemeta = blue.getItemMeta();
		bluemeta.setDisplayName(null);
		blue.setItemMeta(bluemeta);
		//===========================================================
		
		
		
		inv.setItem(0, blue);
		inv.setItem(1, green);
		inv.setItem(2, blue);
		inv.setItem(3, green);
		inv.setItem(4, blue);
		inv.setItem(5, green);
		inv.setItem(6, blue);
		inv.setItem(7, green);
		inv.setItem(8, blue);
		inv.setItem(9, green);
		inv.setItem(10, blue);
		inv.setItem(13, green);
		inv.setItem(16, blue);
		inv.setItem(17, green);
		inv.setItem(18, blue);
		inv.setItem(19, green);
		inv.setItem(20, blue);
		inv.setItem(21, green);
		inv.setItem(22, blue);
		inv.setItem(23, green);
		inv.setItem(24, blue);
		inv.setItem(25, green);
		inv.setItem(26, blue);
		
		inv.setItem(11, lobby1);
		inv.setItem(12, lobby2);
		inv.setItem(14, lobby3);
	    inv.setItem(15, lobby4);

		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1.0F, 1.0F);

		
		
	}

}
