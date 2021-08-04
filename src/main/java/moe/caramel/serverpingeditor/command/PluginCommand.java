package moe.caramel.serverpingeditor.command;

import moe.caramel.serverpingeditor.Main;
import moe.caramel.serverpingeditor.listener.ServerPingListener;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public final class PluginCommand implements CommandExecutor {

    static final Component COMPLETE = Component.text("Reload Complete.", NamedTextColor.GREEN);

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!sender.hasPermission("caramel.spe")) {
            sender.sendMessage(Bukkit.getPermissionMessage());
            return false;
        }

        Main.getPlugin().reloadConfig();
        ServerPingListener.getInstance().reloadCache();
        sender.sendMessage(COMPLETE);
        return false;
    }
}
