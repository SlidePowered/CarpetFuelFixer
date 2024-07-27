package dev.slide_am.cff.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;

public class FurnaceEvent implements Listener {

    @EventHandler
    public void onFurnaceFuelChange(FurnaceBurnEvent event) {
        if(event.getFuel().getType().name().toLowerCase().endsWith("_carpet")){
            event.setCancelled(true);
        }
    }
}
