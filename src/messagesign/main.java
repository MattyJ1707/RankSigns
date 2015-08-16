package messagesign;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	public void onEnable() {
		getLogger().info("RankSign has been enabled!");
		getServer().getPluginManager().registerEvents(new listener(this), this);
		if (getConfig().contains("default")) {

		} else {
			getConfig().addDefault("default." + "message",
					"this is the information about default");
			getConfig().addDefault("member." + "message",
					"this is the information about member ");
			getConfig().addDefault("vip", "this is the information about vip ");
			getConfig().addDefault("donator." + "message",
					"this is the information about donator ");
			getConfig().addDefault("donatorplus." + "message",
					"this is the information about donatorplus ");
			getConfig().addDefault("donatorepic." + "message",
					"this is the information about donatorepic ");
			getConfig().addDefault("donatorxtreme." + "message",
					"this is the information about donatorxtreme ");
			getConfig().addDefault("semimod." + "message",
					"this is the information about semimod ");
			getConfig().addDefault("moderator." + "message",
					"this is the information about moderator ");
			getConfig().addDefault("admin." + "message",
					"this is the information about admin ");
			getConfig().addDefault("owner." + "message",
					"this is the information about owner");
			getConfig().options().copyDefaults(true);
		}
		saveConfig();
	}

	public void onDisable() {
		getLogger().info("RankSign has been disabled!");
		saveConfig();
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (label.equalsIgnoreCase("default")) {
			sender.sendMessage(ChatColor.GRAY
					+ (String) getConfig().get("default"));
		} else if (label.equalsIgnoreCase("member")) {
			sender.sendMessage(ChatColor.DARK_GRAY
					+ (String) getConfig().get("member"));
		} else if (label.equalsIgnoreCase("vip")) {
			sender.sendMessage(ChatColor.BLUE + (String) getConfig().get("vip"));
		} else if (label.equalsIgnoreCase("donator")) {
			sender.sendMessage(ChatColor.AQUA
					+ (String) getConfig().get("donator"));
		} else if (label.equalsIgnoreCase("donatorplus")) {
			sender.sendMessage(ChatColor.DARK_BLUE
					+ (String) getConfig().get("donatorplus"));
		} else if (label.equalsIgnoreCase("donatorepic")) {
			sender.sendMessage(ChatColor.DARK_GREEN
					+ (String) getConfig().get("donatorepic"));
		} else if (label.equalsIgnoreCase("donatorxtreme")) {
			sender.sendMessage(ChatColor.DARK_AQUA
					+ (String) getConfig().get("donatorxtreme"));
		} else if (label.equalsIgnoreCase("semimod")) {
			sender.sendMessage(ChatColor.RED
					+ (String) getConfig().get("semimod"));
		} else if (label.equalsIgnoreCase("moderator")) {
			sender.sendMessage(ChatColor.YELLOW
					+ (String) getConfig().get("moderator"));
		} else if (label.equalsIgnoreCase("admin")) {
			sender.sendMessage(ChatColor.GOLD
					+ (String) getConfig().get("admin"));
		} else if (label.equalsIgnoreCase("owner")) {
			sender.sendMessage(ChatColor.DARK_RED
					+ (String) getConfig().get("owner"));
		} else if (label.equalsIgnoreCase("signreload")) {
			saveConfig();
			sender.sendMessage(ChatColor.DARK_RED
					+ "MessageSign has been reloaded!");
		}
		return false;
	}

}
