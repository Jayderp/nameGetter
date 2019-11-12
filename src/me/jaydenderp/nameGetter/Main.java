package me.jaydenderp.nameGetter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("nameget")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if(args.length > 1 ) {
					p.sendMessage("Bruv wot u doin?");
					return false;					
				} else if(args.length < 1) {
					String pName = p.getName();
					p.sendMessage("Your name is " + pName);
				}
			}
		}
		return false;
		
	}
}
