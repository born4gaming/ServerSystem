package me.Zion_Plays.Methoden;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Navigator_methoden {
	
	public static void loadNavigatorInv(Player p) {
		
		
		Inventory inv = Bukkit.createInventory(null, 27, "§eWähle deinen SpielModus");
		
		//===========================================================
		ItemStack spawn = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta spawnmeta = spawn.getItemMeta();
		spawnmeta.setDisplayName("§bSpawn");
		spawn.setItemMeta(spawnmeta);
		//===========================================================
		ItemStack magic = new ItemStack(Material.DRAGON_EGG);
		ItemMeta magicmeta = magic.getItemMeta();
		magicmeta.setDisplayName("§dMagicGames");
		magic.setItemMeta(magicmeta);
		//===========================================================
		ItemStack hunger = new ItemStack(Material.COOKED_BEEF);
		ItemMeta hungermeta = hunger.getItemMeta();
		hungermeta.setDisplayName("§cHungerGames");
		hunger.setItemMeta(hungermeta);
		//===========================================================
		ItemStack bet = new ItemStack(Material.BED);
		ItemMeta betmeta = bet.getItemMeta();
		betmeta.setDisplayName("§eBedWars");
		bet.setItemMeta(betmeta);
		//===========================================================
		ItemStack vs = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta vsmeta = vs.getItemMeta();
		vsmeta.setDisplayName("§71vs1");
		vs.setItemMeta(vsmeta);
		//===========================================================
		ItemStack spleef = new ItemStack(Material.DIAMOND_SPADE);
		ItemMeta spleefmeta = spleef.getItemMeta();
		spleefmeta.setDisplayName("§9Spleef");
		spleef.setItemMeta(spleefmeta);
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
		inv.setItem(1, blue);
		inv.setItem(2, blue);
		inv.setItem(3, green);
		inv.setItem(5, blue);
		inv.setItem(6, blue);
		inv.setItem(7, green);
		inv.setItem(8, green);
		inv.setItem(9, green);
		inv.setItem(10, green);
		inv.setItem(16, blue);
		inv.setItem(17, green);
		inv.setItem(18, green);
		inv.setItem(19, blue);
		inv.setItem(20, blue);
		inv.setItem(21, blue);
		inv.setItem(22, green);
		inv.setItem(23, blue);
		inv.setItem(24, green);
		inv.setItem(25, green);
		inv.setItem(26, green);
		inv.setItem(23, green);
		inv.setItem(22, blue);
		
		
		inv.setItem(4, spawn);
		inv.setItem(11, spleef);
		inv.setItem(12, magic);
		inv.setItem(14, hunger);
		inv.setItem(15, vs);
		inv.setItem(13, bet);
		
		
		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1.0F, 1.0F);
	}

}
