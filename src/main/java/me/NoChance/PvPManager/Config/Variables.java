package me.NoChance.PvPManager.Config;

import java.util.Arrays;
import java.util.List;
import me.NoChance.PvPManager.Managers.ConfigManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Variables {

	private ConfigManager configManager;
	public static boolean inCombatEnabled;
	public static int timeInCombat;
	public static boolean stopCommands;
	public static boolean punishmentsEnabled;
	public static boolean dropInventory;
	public static boolean dropExp;
	public static boolean dropArmor;
	public static boolean killOnLogout;
	public static List<String> worldsExcluded = Arrays.asList(new String[] { "Example", "Example2" });
	public static boolean disableFly;
	public static boolean pvpTimerEnabled;
	public static boolean toggleSignsEnabled;
	public static boolean disableToggleCommand;
	public static boolean onlyTagAttacker;
	public static boolean updateCheck;
	public static boolean autoUpdate;
	public static boolean newbieProtectionEnabled;
	public static int newbieProtectionTime;
	public static String pvpOffSound;
	public static String pvpOnSound;
	public static boolean enableSound;
	public static boolean announcePvpOnWorldChange;
	public static boolean broadcastPvpLog;
	public static boolean fineEnabled;
	public static double fineAmount;
	public static boolean pvpBlood;
	public static boolean disableGamemode;
	public static boolean update = false;
	public static String newVersion;
	public static String currentVersion;
	public static List<String> commandsAllowed = Arrays.asList(new String[] { "tell", "money" });
	public static float pvpOffSoundPitch;
	public static float pvpOnSoundPitch;
	public static int toggleCooldown;
	public static boolean defaultPvp;
	public static boolean disableDisguise;
	public static boolean killAbuseEnabled;
	public static int killAbuseMaxKills;
	public static int killAbuseTime;
	public static List<String> killAbuseCommands = Arrays.asList("kick <player> Kill Abuse Is Not Allowed!");
	public static boolean toggleBroadcast;
	public static boolean toggleOffOnDeath;
	public static boolean blockEnderPearl;
	public static boolean townySupport;
	public static boolean autoSoupEnabled;
	public static double soupHealth;
	public static boolean inCombatSilent;
	public static boolean configUpdated;
	public static boolean stopBorderHopping;
	public static String nameTagColor;
	public static String locale;

	public Variables(ConfigManager configM) {
		this.configManager = configM;
		InitialiseVariables();
	}

	@SuppressWarnings("unchecked")
	private void InitialiseVariables() {
		inCombatEnabled = configManager.getConfig().getBoolean("In Combat.Enabled", true);
		timeInCombat = configManager.getConfig().getInt("In Combat.Time(seconds)", 10);
		blockEnderPearl = configManager.getConfig().getBoolean("In Combat.Block EnderPearl", true);
		stopCommands = configManager.getConfig().getBoolean("In Combat.Stop Commands.Enabled", true);
		punishmentsEnabled = configManager.getConfig().getBoolean("In Combat.Punishments.Enabled", true);
		dropInventory = configManager.getConfig().getBoolean("In Combat.Punishments.Drops.Inventory", true);
		dropExp = configManager.getConfig().getBoolean("In Combat.Punishments.Drops.Experience", true);
		dropArmor = configManager.getConfig().getBoolean("In Combat.Punishments.Drops.Armor", true);
		killOnLogout = configManager.getConfig().getBoolean("In Combat.Punishments.Kill on Logout", true);
		worldsExcluded = (List<String>) configManager.getConfig().getList("World Exclusions", worldsExcluded);
		disableFly = configManager.getConfig().getBoolean("Disable Fly", true);
		pvpTimerEnabled = configManager.getPvpTimer().getBoolean("PvP Timer.Enabled", true);
		toggleSignsEnabled = configManager.getConfig().getBoolean("Toggle Signs.Enabled", true);
		disableToggleCommand = configManager.getConfig().getBoolean("Toggle Signs.Disable Toggle Command", false);
		onlyTagAttacker = configManager.getConfig().getBoolean("In Combat.Only Tag Attacker", false);
		updateCheck = configManager.getConfig().getBoolean("Update Check.Enabled", true);
		autoUpdate = configManager.getConfig().getBoolean("Update Check.Auto Update", true);
		newbieProtectionEnabled = configManager.getConfig().getBoolean("Newbie Protection.Enabled", true);
		newbieProtectionTime = configManager.getConfig().getInt("Newbie Protection.Time(minutes)", 5);
		pvpOffSound = configManager.getPvpTimer().getString("PvP Timer.Sound.PvP Off Sound");
		pvpOnSound = configManager.getPvpTimer().getString("PvP Timer.Sound.PvP On Sound");
		pvpOffSoundPitch = (float) configManager.getPvpTimer().getDouble("PvP Timer.Sound.PvP Off Pitch", 1);
		pvpOnSoundPitch = (float) configManager.getPvpTimer().getDouble("PvP Timer.Sound.PvP On Pitch", 1);
		enableSound = configManager.getPvpTimer().getBoolean("PvP Timer.Sound.Enabled");
		announcePvpOnWorldChange = configManager.getPvpTimer().getBoolean("PvP Timer.Announce On World Change");
		broadcastPvpLog = configManager.getConfig().getBoolean("In Combat.Punishments.Broadcast PvPLog", true);
		fineEnabled = configManager.getConfig().getBoolean("In Combat.Punishments.Fine.Enabled", false);
		fineAmount = configManager.getConfig().getDouble("In Combat.Punishments.Fine.Amount", 10.00);
		pvpBlood = configManager.getConfig().getBoolean("PvP Blood", true);
		disableGamemode = configManager.getConfig().getBoolean("Disable GameMode", true);
		commandsAllowed = (List<String>) configManager.getConfig().getList("In Combat.Stop Commands.Allowed Commands", commandsAllowed);
		currentVersion = configManager.getPlugin().getDescription().getVersion();
		toggleCooldown = configManager.getConfig().getInt("PvP Toggle.Cooldown(seconds)", 15);
		toggleBroadcast = configManager.getConfig().getBoolean("PvP Toggle.Broadcast", false);
		toggleOffOnDeath = configManager.getConfig().getBoolean("PvP Toggle.Toggle Off on Death", false);
		defaultPvp = configManager.getConfig().getBoolean("Default PvP", true);
		disableDisguise = configManager.getConfig().getBoolean("Disable Disguise", true);
		killAbuseMaxKills = configManager.getConfig().getInt("Kill Abuse.Max Kills", 5);
		killAbuseTime = configManager.getConfig().getInt("Kill Abuse.Time Limit", 60);
		killAbuseCommands = (List<String>) configManager.getConfig().getList("Kill Abuse.Commands on Abuse", killAbuseCommands);
		killAbuseEnabled = configManager.getConfig().getBoolean("Kill Abuse.Enabled", true);
		townySupport = configManager.getConfig().getBoolean("Towny Support", true);
		autoSoupEnabled = configManager.getConfig().getBoolean("Auto Soup.Enabled", false);
		soupHealth = configManager.getConfig().getDouble("Auto Soup.Health Gain", 6);
		inCombatSilent = configManager.getConfig().getBoolean("In Combat.Silent", false);
		stopBorderHopping = configManager.getConfig().getBoolean("Disable Border Hopping", true);
		nameTagColor = configManager.getConfig().getString("In Combat.Name Tag Color", "&c");
		locale = configManager.getConfig().getString("Locale", "en").toUpperCase();
	}

	public static void helpMenu(Player player) {
		player.sendMessage(ChatColor.GOLD + "-------------- PvPManager Help Page --------------");
		player.sendMessage(ChatColor.GOLD + "/pvp " + ChatColor.WHITE + "| Set PvP Enabled or Disabled.");
		player.sendMessage(ChatColor.GOLD + "/pvp status " + ChatColor.WHITE + "| Check What is your PvP Status.");
		player.sendMessage(ChatColor.GOLD + "/pvp status <player> " + ChatColor.WHITE + "| Check Another Player PvP Status.");
		player.sendMessage(ChatColor.GOLD + "/pvp disable protection " + ChatColor.WHITE + "| Disable Newbie Protection Before Expiration");
		player.sendMessage(ChatColor.GOLD + "/pm " + ChatColor.WHITE + "| Show This Help Page");
		player.sendMessage(ChatColor.GOLD + "/pm update " + ChatColor.WHITE + "| Update to Latest Version");
		player.sendMessage(ChatColor.GOLD + "/pm reload " + ChatColor.WHITE + "| Reload PvPManager");
		player.sendMessage(ChatColor.GOLD + "/pm pvpstart <time> [world] " + ChatColor.WHITE + "| Change the time PvP Starts in a world");
		player.sendMessage(ChatColor.GOLD + "/pm pvpend <time> [world] " + ChatColor.WHITE + "| Change the time PvP Ends in a world");
		player.sendMessage(ChatColor.GOLD + "-------------------------------------------------");
	}
}
