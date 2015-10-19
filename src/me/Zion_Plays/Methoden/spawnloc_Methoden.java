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


public class spawnloc_Methoden {
	private static mainclass plugin;
	@SuppressWarnings("static-access")
	public spawnloc_Methoden(mainclass mainclass){
		this.plugin = mainclass;
	}
	
	@SuppressWarnings("static-access")
	public static void setspawnloc(Player p){
		
		File file = new File("plugins/LobbySystem", "spawn.yml");
		FileConfiguration cfg =  YamlConfiguration.loadConfiguration(file);
		
		Location loc = p.getLocation();
		
		String world = p.getWorld().getName();
		double x = loc.getX();
		double y = loc.getY();
		double z = loc.getZ();
		double yaw = loc.getYaw();
		double pitch = loc.getPitch();
		
		cfg.set("spawn.setspawn.world", world);
		cfg.set("spawn.setspawn.x", x);
		cfg.set("spawn.setspawn.y", y);
		cfg.set("spawn.setspawn.z", z);
		cfg.set("spawn.setspawn.yaw", yaw);
		cfg.set("spawn.setspawn.pitch", pitch);
		
		
		try {
			cfg.save(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		p.sendMessage(plugin.prefix + ChatColor.GREEN + "Du hast den Spawn erfolgreich gesetzt");
		p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
		
	
	}
	public static void teleportspawn(Player p){
		File file = new File("plugins/LobbySystem", "spawn.yml");
		FileConfiguration cfg =  YamlConfiguration.loadConfiguration(file);
		String world = cfg.getString("spawn.setspawn.world");
		double x = cfg.getDouble("spawn.setspawn.x");
		double y = cfg.getDouble("spawn.setspawn.y");
		double z = cfg.getDouble("spawn.setspawn.z");
		double yaw = cfg.getDouble("spawn.setspawn.yaw");
		double pitch = cfg.getDouble("spawn.setspawn.pitch");
		
		Location loc = new Location(Bukkit.getWorld(world), x, y, z);
		loc.setYaw((float) yaw);
		loc.setPitch((float) pitch);
		
		p.teleport(loc);
		
		
		
		
		
	}

}
