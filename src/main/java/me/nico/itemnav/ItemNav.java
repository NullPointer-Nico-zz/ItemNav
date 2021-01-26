package me.nico.itemnav;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import me.nico.itemnav.components.listener.EventListener;

public class ItemNav extends PluginBase {

    @Override
    public void onEnable() {
        registerEvents(this.getServer().getPluginManager());
    }

    private void registerEvents(PluginManager manager) {
        manager.registerEvents(new EventListener(), this);
    }
}
