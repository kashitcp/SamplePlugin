package com.kashitcp.nukkit;

import cn.nukkit.plugin.PluginBase;

public class PluginNukkit extends PluginBase {

    public static PluginNukkit instance;

    @Override
    public void onLoad() {
        instance = this;

        this.getLogger().info("plugin already loaded");
    }

    @Override
    public void onEnable() {
        this.getLogger().info("plugin already enabled");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("plugin already disabled");
    }

}
