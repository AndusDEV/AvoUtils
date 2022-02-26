package pl.andus.avocado.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.andus.avocado.Variables;

import static pl.andus.avocado.Variables.cmdStr;

public class MainCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length >= 1) {
            if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "\n--= AvocadoUtils =--\n"
                    + ChatColor.GREEN + "- Help -\n"
                    + cmdStr + "/avo help" + ChatColor.DARK_GRAY + " - Shows all commands for Avocado Plugin\n"
                    + cmdStr + "/avout" + ChatColor.DARK_GRAY + "/" + cmdStr + "/avo about" + ChatColor.DARK_GRAY + " - Shows info about Avocado Plugin");
            }
            if (args[0].equalsIgnoreCase("about")) {
                sender.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "\n--= AvocadoUtils =--\n"
                    + ChatColor.GREEN + "- About -\n"
                    + cmdStr + "Author: " + ChatColor.GREEN + "Andus\n"
                    + cmdStr + "Version: " + ChatColor.GREEN + Variables.version + "\n"
                    + ChatColor.GREEN + "Use command " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "/avo help " + ChatColor.GREEN + "to see all Avocado commands");
            }
        }
        return false;
    }
}
