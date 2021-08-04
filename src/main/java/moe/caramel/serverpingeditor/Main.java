package moe.caramel.serverpingeditor;

import moe.caramel.serverpingeditor.command.PluginCommand;
import moe.caramel.serverpingeditor.listener.ServerPingListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    /* Instance */
    private static Main plugin;
    public static Main getPlugin() { return plugin; }

    /* Plugin init */
    @Override
    public void onEnable() {
        plugin = this;

        /* Check Paper */
        try {
            Class.forName("com.destroystokyo.paper.PaperConfig");
            Class.forName("com.destroystokyo.paper.event.server.PaperServerListPingEvent");
        } catch (ClassNotFoundException e) {
            this.getLogger().log(java.util.logging.Level.SEVERE,
                    "\n                    === WARNING === \n" +
                    "   This server is not using 1.12 or later Paper or Paper Fork. Disable this plugin. \n" +
                    "   이 서버는 1.12 이상의 Paper 또는 Paper 포크를 사용하지 않고 있습니다. 플러그인을 종료합니다."
            );
            this.getServer().getPluginManager().disablePlugin(this);
            return;
        }

        /* Config init */
        this.saveDefaultConfig();
        this.getConfig().options().copyDefaults(true);

        /* Register Event & Command */
        this.getServer().getPluginManager().registerEvents(ServerPingListener.getInstance(), this);
        this.getCommand("caramelserverpingeditor").setExecutor(new PluginCommand());
    }
}
