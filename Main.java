package me.stats0.EssentialPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.stats0.EssentialPlugin.commands.FlyCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new FlyCommand(this);
	}
	
}
