package net.civicraft.mineStego;

import org.bukkit.plugin.java.JavaPlugin;

public final class MineStego extends JavaPlugin {
    public MineStego instance;
    @Override
    public void onEnable() {
        instance = this;
        getCommand("stego").setExecutor(new MineStego());
    }

    public static MineStego getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
