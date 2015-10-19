package me.Zion_Plays.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Zion_Plays.Methoden.Command_set_methoden;
import me.Zion_Plays.Methoden.Magicloc_Methoden;
import me.Zion_Plays.Methoden.bedloc_Methoden;
import me.Zion_Plays.Methoden.hungerloc_Methoden;
import me.Zion_Plays.Methoden.spawnloc_Methoden;
import me.Zion_Plays.Methoden.vsloc_Methoden;
import me.Zion_Plays.main.mainclass;

public class Command_set implements CommandExecutor {

	private mainclass plugin;

	public Command_set(mainclass mainclass) {
		this.plugin = mainclass;
	}
	@SuppressWarnings({ "static-access" })
	@Override
	public boolean onCommand(CommandSender sender,Command cmd, String label,
			   String[] args){
		if(sender instanceof Player){
			Player p = (Player)sender;
			if(p.hasPermission("server.setlocation")){
				
				if(args.length == 0){
					Command_set_methoden.setUpMessage(p);
					return true;
					
				}else
					if(args.length == 1){
						if(args[0].equalsIgnoreCase("spawn")){
							spawnloc_Methoden.setspawnloc(p);
							return true;
							
						}else
							if(args[0].equalsIgnoreCase("Bedwars")){
								bedloc_Methoden.setbedloc(p);
								return true;
							}else
								if(args[0].equalsIgnoreCase("HungerGames")){
									hungerloc_Methoden.sethungerloc(p);
									return true;
								}else
									if(args[0].equalsIgnoreCase("MagicGames")){
										Magicloc_Methoden.setMagicteleport(p);
										return true;
									}else
										if(args[0].equalsIgnoreCase("1vs1")){
											vsloc_Methoden.setbedloc(p);
											return true;
										}else
											if(args[0].equalsIgnoreCase("Spleef")){
												return true;
											}else{
												p.sendMessage(plugin.prefix + "§3Falsche Argumente");
							}
						
					}else {
						p.sendMessage(plugin.prefix + "§3Zu viele Argumente");
						
					}
				
			}else {
				p.sendMessage(plugin.prefix + plugin.noperm);
			}
			
			
		}else {
			sender.sendMessage("Du kannst keine location setzen. Diese kannst du nur Ingame benutzen");
		}
		
		
		
		
		
		
		return true;
	}

}
