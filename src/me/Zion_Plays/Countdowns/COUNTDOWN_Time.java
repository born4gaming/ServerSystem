package me.Zion_Plays.Countdowns;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.Zion_Plays.Methoden.Time_methoden;

public class COUNTDOWN_Time implements Runnable {
	
	@Override
	public void run(){
		for(Player players: Bukkit.getOnlinePlayers()){
			Time_methoden.settime(players);
		}
		
	}
	
	
	
	
	

}
