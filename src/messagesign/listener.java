package messagesign;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class listener implements Listener {

	public main plugin;

	public listener(main instance) {
		instance = plugin;
	}

	@EventHandler
	public void onSignChange(SignChangeEvent event) {
		if ((event.getLine(1).equals("default"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("default", ChatColor.GRAY + "[Default]");
			plugin.getConfig().set("default." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("member"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1)
					.replace("member", ChatColor.DARK_GRAY + "[Member]");
			plugin.getConfig().set("member." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("vip"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("vip", ChatColor.BLUE + "[VIP]");
			plugin.getConfig().set("vip." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("donator"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("donator", ChatColor.AQUA + "[Donator]");
			plugin.getConfig().set("donator." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("donatorplus"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("donatorplus",
					ChatColor.DARK_BLUE + "[DonatorPlus]");
			plugin.getConfig().set("donatorplus." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("donatorepic"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("donatorepic",
					ChatColor.DARK_GREEN + "[DonatorEpic]");
			plugin.getConfig().set("donatorepic." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("donatorxtreme"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("donatorxtreme",
					ChatColor.DARK_AQUA + "[DonatorXtreme]");
			plugin.getConfig().set("donatorxtreme." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("semimod"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("semimod", ChatColor.RED + "[Semimod]");
			plugin.getConfig().set("semimod." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("moderator"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("moderator",
					ChatColor.YELLOW + "[Moderator]");
			plugin.getConfig().set("moderator." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("admin"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("admin", ChatColor.GOLD + "[Admin]");
			plugin.getConfig().set("admin." + "signplacement",
					event.getBlock().getLocation().toString());
		} else if ((event.getLine(1).equals("owner"))
				&& (event.getPlayer().getName().equalsIgnoreCase("MattyJ1707"))) {
			event.getLine(1).replace("owner", ChatColor.DARK_RED + "[Owner]");
			plugin.getConfig().set("owner." + "signplacement",
					event.getBlock().getLocation().toString());
		}
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("default." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.GRAY
							+ plugin.getConfig().getString(
									"default." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("member." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.DARK_GRAY
							+ plugin.getConfig().getString(
									"member." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("vip." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.BLUE
							+ plugin.getConfig().getString("vip." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("donator." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.AQUA
							+ plugin.getConfig().getString(
									"donator." + "message"));
		} else if (event
				.getClickedBlock()
				.getLocation()
				.toString()
				.equals(plugin.getConfig()
						.get("donatorplus." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.DARK_BLUE
							+ plugin.getConfig().getString(
									"donatorplus." + "message"));
		} else if (event
				.getClickedBlock()
				.getLocation()
				.toString()
				.equals(plugin.getConfig()
						.get("donatorepic." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.DARK_GREEN
							+ plugin.getConfig().getString(
									"donatorepic." + "message"));
		} else if (event
				.getClickedBlock()
				.getLocation()
				.toString()
				.equals(plugin.getConfig().get(
						"donatorxtreme." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.DARK_AQUA
							+ plugin.getConfig().getString(
									"donatorxtreme." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("semimod." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.RED
							+ plugin.getConfig().getString(
									"semimod." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("moderator." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.YELLOW
							+ plugin.getConfig().getString(
									"moderator." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("admin." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.GOLD
							+ plugin.getConfig()
									.getString("admin." + "message"));
		} else if (event.getClickedBlock().getLocation().toString()
				.equals(plugin.getConfig().get("owner." + "signplacement"))) {
			event.getPlayer().sendMessage(
					ChatColor.RED
							+ plugin.getConfig()
									.getString("owner." + "message"));
		}
	}
}