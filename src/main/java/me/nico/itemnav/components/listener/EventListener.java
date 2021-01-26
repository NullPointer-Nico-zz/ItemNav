package me.nico.itemnav.components.listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerItemHeldEvent;

public class EventListener implements Listener {

    @EventHandler
    public void on(PlayerItemHeldEvent event) {
        Player p = event.getPlayer();

        p.sendPopup("§6" + event.getItem().getName() + ": §7" + event.getItem().getId() + ":" + event.getItem().getDamage());
    }
}
