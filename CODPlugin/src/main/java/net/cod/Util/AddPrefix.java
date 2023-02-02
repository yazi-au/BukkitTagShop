package net.cod.Util;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AddPrefix implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        e.setCancelled(true);

    }
}
