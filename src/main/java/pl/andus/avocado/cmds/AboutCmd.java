package pl.andus.avocado.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.andus.avocado.Variables;
import static pl.andus.avocado.Variables.cmdStr;

public class AboutCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "\n--= AvocadoUtils =--\n"
            + ChatColor.GREEN + "- About -\n"
            + cmdStr + "Author: " + ChatColor.GREEN + "Andus\n"
            + cmdStr + "Version: " + ChatColor.GREEN + Variables.version + "\n"
            + ChatColor.GREEN + "Use command " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "/avo help " + ChatColor.GREEN + "to see all Avocado commands");
        return false;
    }
}
