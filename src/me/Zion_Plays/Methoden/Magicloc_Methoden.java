package me.Zion_Plays.Methoden;

import java.io.File;
import java.io.IOException;

import me.Zion_Plays.main.mainclass;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


public class Magicloc_Methoden {
	private static mainclass plugin;
	@SuppressWarnings("static-access")
	public Magicloc_Methoden(mainclass mainclass){
		this.plugin = mainclass;
	}

		
	
	
	
	@SuppressWarnings("static-access")
	public static void setMagicteleport(Player p){
		
		File file = new File("plugins/LobbySystem", "MagicGamesTeleportPunkt.yml");
		FileConfiguration cfg =  YamlConfiguration.loadConfiguration(file);
		
		Location loc = p.getLocation();
		
		String world = p.getWorld().getName();
		double x = loc.getX();
		double y = loc.getY();
		double z = loc.getZ();
		double yaw = loc.getYaw();
		double pitch = loc.getPitch();
		
		cfg.set("spawn.setMagic.world", world);
		cfg.set("spawn.setMagic.x", x);
		cfg.set("spawn.setMagic.y", y);
		cfg.set("spawn.setMagic.z", z);
		cfg.set("spawn.setMagic.yaw", yaw);
		cfg.set("spawn.setMagic.pitch", pitch);
		
		
		try {
			cfg.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		p.sendMessage(plugin.prefix + ChatColor.GREEN + "Du hast den HungerGames Teleport Punkt erfolgreich gesetzt");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
		

	}
	public static void teleportspawn(Player p){
		File file = new File("plugins/LobbySystem", "MagicGamesTeleportPunkt.yml");
		FileConfiguration cfg =  YamlConfiguration.loadConfiguration(file);
		String world = cfg.getString("spawn.setMagic.world");
		double x = cfg.getDouble("spawn.setMagic.x");
		double y = cfg.getDouble("spawn.setMagic.y");
		double z = cfg.getDouble("spawn.setMagic.z");
		double yaw = cfg.getDouble("spawn.setMagic.yaw");
		double pitch = cfg.getDouble("spawn.setMagic.pitch");
		
		Location loc = new Location(Bukkit.getWorld(world), x, y, z);
		loc.setYaw((float) yaw);
		loc.setPitch((float) pitch);
		
		p.teleport(loc);
		
		
		
		
		
	}







}


