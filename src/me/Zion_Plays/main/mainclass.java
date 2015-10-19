package me.Zion_Plays.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import me.Zion_Plays.Commands.Command_set;
import me.Zion_Plays.ItemManager.Item_Silent;
import me.Zion_Plays.ItemManager.Item_Zeug;
import me.Zion_Plays.ItemManager.Item_hider;
import me.Zion_Plays.ItemManager.Item_navigator;
import me.Zion_Plays.Listener.BlockBreackEvent_Listener;
import me.Zion_Plays.Listener.BlockPlaceEvent_Listener;
import me.Zion_Plays.Listener.EntityDamageByEntityEvent_Listener;
import me.Zion_Plays.Listener.EntityDamageEvent_Listener;
import me.Zion_Plays.Listener.EntityDamagebyBlock_Listener;
import me.Zion_Plays.Listener.EntityDeathEvent_Listener;
import me.Zion_Plays.Listener.FoodLevelChangeEvent_Listener;
import me.Zion_Plays.Listener.InventoryClickEvent_Listener;
import me.Zion_Plays.Listener.PlayerDeathEvent_Listener;
import me.Zion_Plays.Listener.PlayerInteractEntityEvent_Listener;
import me.Zion_Plays.Listener.PlayerJoinEventListener;
import me.Zion_Plays.Listener.PlayerJoinEvent_Listener;
import me.Zion_Plays.Listener.PlayerKickEvnet_Listener;
import me.Zion_Plays.Listener.PlayerPortalEvent_Listener;
import me.Zion_Plays.Listener.PlayerQuitEvent_Listener;
import me.Zion_Plays.Listener.PreapereIteamEnchantEvent;
import me.Zion_Plays.Methoden.Lobby_Methoden;
import me.Zion_Plays.features.Jumpplate;
import me.Zion_Plays.features.Lobbys;
import me.Zion_Plays.tag.api.tagapi;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;






                

public class mainclass extends JavaPlugin implements Listener {
	
	/*
	 * Permissions
	 * 
	 * server.join.message
	 * server.Lobby.VIP
	 * server.build
	 * server.see.Death
	 * server.deathmessage
	 * server.quit.message
	 * server.visible
	 * 
	 * 
	 * 
	 */

	
	//==========[MySQL]==========
	
	
	
	
	//==========[File]==========
	
	public static File MysqlFile= new File("plugin/LobbySystem", "autonicker.yml");
	public static FileConfiguration sql = YamlConfiguration.loadConfiguration(MysqlFile);
	
	
	
	//==========[String]==========
	public static String prefix = "§3[§6RoveMC§3] ";
	public static String noperm = "§cDu hast keine Berechtigung das zu machen "; 
	public static String owner = "§9[Owner]";
	public static String Admin = "§9[Admin]";
	public static String VIP = "§9[Premium]";
	public static String Builder = "§9[Builder]";
	public static String Moderator = "§9[Mod]";
	public static String Spieler = "§s[Spieler]";
	public static String sg = "[SurvivalGames]";
	public static String info = "[Server-Info]";
	
	//==========[ArrayList Lobby]==========
	public static ArrayList<String> hidden1 = new ArrayList<String>();
	public static ArrayList<String> hidden2 = new ArrayList<String>();
	public static ArrayList<String> silent = new ArrayList<String>();
	public static ArrayList<String> flyboots = new ArrayList<String>();
    public static ArrayList<String> smokeboots = new ArrayList<String>();
  	public static List<Player> lobby1 = new ArrayList<Player>();
  	public static List<Player> lobby2 = new ArrayList<Player>();
  	public static List<Player> lobby3 = new ArrayList<Player>();
  	public static List<Player> lobby4 = new ArrayList<Player>();
 	public static List<Player> Admins = new ArrayList<Player>();
 	public static List<Player> SilentLobby = new ArrayList<Player>();
	public static ArrayList<String> lobby = new ArrayList<String>();
	public static ArrayList<String> lobbye = new ArrayList<String>();
	public static ArrayList<String> lobbyz = new ArrayList<String>();
    public static ArrayList<String> lobbyd = new ArrayList<String>();
 
    //==========[ArrayList GameLobby]==========
    public static List<Player> gamelobby1 = new ArrayList<Player>();
  	public static List<Player> gamelobby2 = new ArrayList<Player>();
    
    
    
    //==========[String]==========
	public int timecount;
	
	public void onEnable(){
		
		lobby.clear();
		lobbye.clear();
		lobbyz.clear();
		lobbyd.clear();
		
		
		new PlayerJoinEvent_Listener(this);
		new Item_navigator(this);
		new BlockBreackEvent_Listener(this);
		new BlockPlaceEvent_Listener(this);
		new EntityDamageByEntityEvent_Listener(this);
		new EntityDamagebyBlock_Listener(this);
		new EntityDamageEvent_Listener(this);
		new EntityDeathEvent_Listener(this);
		new FoodLevelChangeEvent_Listener(this);
		new InventoryClickEvent_Listener(this);
		new PlayerDeathEvent_Listener(this);
		new PlayerInteractEntityEvent_Listener(this);
		new PlayerPortalEvent_Listener(this);
		new PlayerKickEvnet_Listener(this);
		new PlayerQuitEvent_Listener(this);
		new PreapereIteamEnchantEvent(this);
		
		new Jumpplate(this);
		new Item_hider(this);
		new Item_Silent(this);
		new tagapi(this);
		new Item_Zeug(this);
		new Lobbys(this);
		new Lobby_Methoden(this);
		getCommand("set").setExecutor(new Command_set(this));
		
		
		
	}
	public void onDisable(){
		
		
		
	}
	
	
	
	
	
	

	public boolean onCommand(Command sender,Command cmd,String lable,String[] arg){
		
		if(cmd.getName().equalsIgnoreCase("Test")){
			Player p = (Player)sender;
			
		}
		
		if(cmd.getName().equalsIgnoreCase("whereami")){
			
			Player p = (Player)sender;
			
			if(lobby1.contains(p.getName())){
				
				p.sendMessage(prefix + ChatColor.GREEN + " Du befindest dich auf der 1 lobby!");
				
			}else
				if(lobby2.contains(p.getName())){
					
					p.sendMessage(prefix + ChatColor.GREEN + " Du befindest dich auf lobby2");
					
				}else
					if(lobby3.contains(p.getName())){
						
						p.sendMessage(prefix + ChatColor.GREEN + " Du befindest dich auf lobby3");
						
					}else
						if(lobby4.contains(p.getName())){
							
							p.sendMessage(prefix + ChatColor.GREEN + " Du befindest dich auf der 4 lobby");
							
						}else{
							
							p.sendMessage(prefix + ChatColor.RED + " Das Netzwerk konnte dich nicht lokalisieren!");
							
						}
			
		}
		
		if(cmd.getName().equalsIgnoreCase("help")){
			
			Player p = (Player)sender;
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		return false;
	}
	

}

