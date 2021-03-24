package me.stats0.EssentialPlugin.commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.stats0.EssentialPlugin.Main;

public class FlyCommand implements CommandExecutor {
	
	private ArrayList<Player> list_of_flying_players = new ArrayList<>();
	
	private Main plugin;
	
	public FlyCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("/fly").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command");
			return true;
		}
		
		Player p = (Player) sender;
		
		if (player.hasPermission("EP.fly")) {
			if (list_of_flying_players.contains(player)){
				list_of_flying_players.remove(player);
				p.setAllowFlight(false);
				p.sendMessage("You have disabled flight");
			} else if(!list_of_flying_players.contains(player)) {
			list_of_flying_players.add(player);
			p.setAllowFlight(true);
			p.sendMessage("You can now fly.");
		} else {
			p.sendMessage("You do not have permission to use this command.");
		}
		
		return false;
	}
	
}
