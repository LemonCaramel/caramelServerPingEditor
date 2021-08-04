package moe.caramel.serverpingeditor.listener;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import com.destroystokyo.paper.profile.PlayerProfile;
import moe.caramel.serverpingeditor.Constants;
import moe.caramel.serverpingeditor.Main;
import moe.caramel.serverpingeditor.impl.CaramelProfileImpl;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public final class ServerPingListener implements Listener {

    /* Instance */
    static final ServerPingListener INSTANCE;
    public static ServerPingListener getInstance() { return INSTANCE; }
    static {
        INSTANCE = new ServerPingListener(Main.getPlugin());
        repCurrentPlayer = "0";
        repMaxPlayer = "0";
    }

    /* Object */
    final Main plugin;
    final List<CaramelProfileImpl> cachedList;

    ServerPingListener(Main plugin) {
        this.plugin = plugin;
        this.cachedList = new ArrayList<>();
        this.reloadCache();
        this.reloadCount();
    }

    /* Function */
    public void reloadCache() {
        this.cachedList.clear();
        for (String str : plugin.getConfig().getStringList(Constants.CONFIG_PLAYER_SAMPLE)) {
            this.cachedList.add(new CaramelProfileImpl(ChatColor.translateAlternateColorCodes('&', str)));
        }
    }

    public static String repMaxPlayer, repCurrentPlayer;
    public void reloadCount() {
        repMaxPlayer = String.valueOf(plugin.getServer().getMaxPlayers());
        repCurrentPlayer = String.valueOf(plugin.getServer().getOnlinePlayers().size());
    }

    /* Listener */
    @EventHandler
    void onServerListPing(PaperServerListPingEvent event) {
        /* Sample */
        List<PlayerProfile> profiles = event.getPlayerSample();
        this.reloadCount();
        profiles.clear();
        profiles.addAll(this.cachedList);

        /* Server version */
        String serverVersion = plugin.getConfig().getString(Constants.CONFIG_VERSION, null);
        if (serverVersion != null) event.setVersion(serverVersion);

        int protocolVersion = plugin.getConfig().getInt(Constants.CONFIG_PROTOCOL_VERSION, -1);
        if (protocolVersion != -1) event.setProtocolVersion(protocolVersion);


        /* Player Count */
        int maxPlayers = plugin.getConfig().getInt(Constants.CONFIG_MAX_PLAYERS, -1);
        if (maxPlayers != -1) event.setMaxPlayers(maxPlayers);

        int currentPlayers = plugin.getConfig().getInt(Constants.CONFIG_CURRENT_PLAYERS, -1);
        if (currentPlayers != -1) event.setNumPlayers(currentPlayers);


        /* Etc */
        event.setHidePlayers(plugin.getConfig().getBoolean(Constants.CONFIG_HIDE_PLAYERS, false));
    }
}
