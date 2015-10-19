package me.Zion_Plays.Methoden;



import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HideItem_Methoden {
	
	public static void openHideInv(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 9, "§4Spieler Verstecken");
		
		//=====================================================================
		ItemStack allon = new ItemStack(Material.WOOL, 1, (byte) 13);
		ItemMeta allonmeta = allon.getItemMeta();
		allonmeta.setDisplayName("§aAlle Spieler anzeigen!");
		allon.setItemMeta(allonmeta);
		//=====================================================================
		ItemStack vip = new ItemStack(Material.WOOL, 1, (byte) 11);
		ItemMeta vipmeta = vip.getItemMeta();
		vipmeta.setDisplayName("§1Nur Admins und VIPs anzeigen!");
		vip.setItemMeta(vipmeta);
		//=====================================================================
		ItemStack niemand = new ItemStack(Material.WOOL, 1, (byte) 14);
		ItemMeta niemandmeta = vip.getItemMeta();
		niemandmeta.setDisplayName("§cAlle Spieler verstecken!");
		niemand.setItemMeta(niemandmeta);
		//=====================================================================
		ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 7);
		ItemMeta glassmeta = vip.getItemMeta();
		glassmeta.setDisplayName(" ");
		glass.setItemMeta(glassmeta);
		//=====================================================================
		
		inv.setItem(0, glass);
		inv.setItem(1, glass);
		inv.setItem(2, glass);
		inv.setItem(3, glass);
		inv.setItem(5, glass);
		inv.setItem(6, glass);
		inv.setItem(7, glass);
		inv.setItem(8, glass);
		
		inv.setItem(0, allon);
		inv.setItem(4, vip);
		inv.setItem(8, niemand);
		
		p.openInventory(inv);
				
			
		}
		
		
	}


