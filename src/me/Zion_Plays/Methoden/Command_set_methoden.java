package me.Zion_Plays.Methoden;

import me.Zion_Plays.main.mainclass;

import org.bukkit.entity.Player;

public class Command_set_methoden {
	
	private static mainclass plugin;
	public Command_set_methoden(mainclass mainclass){
		this.plugin = mainclass;
	}
	@SuppressWarnings("static-access")
	public static void setUpMessage(Player p){
		p.sendMessage(plugin.prefix + "§3=========[§6System]§3]=========");
		p.sendMessage(plugin.prefix + "§3/setspawn -§6Setzt den Spawn");
		p.sendMessage(plugin.prefix + "§3/setmag -§6Setzt MagicGames");
		p.sendMessage(plugin.prefix + "§3/setbed -§6Setzt BedWars");
		p.sendMessage(plugin.prefix + "§3/sethunger -§6Setzt HungerGames");
		p.sendMessage(plugin.prefix + "§3/set1vs1 -§6Setzt 1vs1");
		p.sendMessage(plugin.prefix + "§3/setspleef -§6Setzt Spleef");
		
	}

}
