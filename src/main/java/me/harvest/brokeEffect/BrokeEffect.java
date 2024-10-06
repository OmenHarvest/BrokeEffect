package me.harvest.brokeEffect;

import me.harvest.brokeEffect.events.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class BrokeEffect extends JavaPlugin {

    private static BrokeEffect instance;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BrokeEffect getInstance() {
        return instance;
    }
}
