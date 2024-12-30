package net.civicraft.mineStego.command;

import net.civicraft.mineStego.util.TextManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class StegoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        if (!player.hasPermission("minestego.use")) {
            player.sendMessage("You don't have permission to use this command.");
            return true;
        }

        if (args.length == 0) {
            player.sendMessage("Help Message Here");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "help":
                player.sendMessage("Help Message Here");
                break;
            case "encrypt":
                TextManager.encrypt(player, Arrays.toString(args));
                break;
            case "decrypt":
                TextManager.decrypt(player, Arrays.toString(args));
                break;
            default:
                player.sendMessage("Unknown command. Type /stego help for a list of commands.");
        }
        return true;
    }
}
