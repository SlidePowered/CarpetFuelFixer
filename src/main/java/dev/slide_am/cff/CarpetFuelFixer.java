package dev.slide_am.cff;

import dev.slide_am.cff.event.FurnaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CarpetFuelFixer extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FurnaceEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
