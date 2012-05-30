/*
 * PermissionsEXBridge by rymate1234 (http://ryate.co.uk)
 *
 * THIS PLUGIN IS LICENSED UNDER THE WTFPL - (Do What The Fuck You Want To Public License)
 *
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 *
 * TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 * 0. You just DO WHAT THE FUCK YOU WANT TO.
 *
 */
package ru.tehcode.permissions.bukkit;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Ryan
 */
public class PermissionsEx extends JavaPlugin {

    protected static final Logger logger = Logger.getLogger("Minecraft");
    private PermissionManager permissionsManager;

    public void onEnable() {
        logger.log(Level.INFO, "[PermissionsEXBridge] version" + this.getDescription().getVersion() + " enabled");
        permissionsManager = new PermissionManager();
    }

    public void onDisable() {
        logger.log(Level.INFO, "[PermissionsEXBridge] version" + this.getDescription().getVersion() + " disabled");
    }

    /*
     * Get this. No literally, gets this. :3
     */
    public static Plugin getPlugin() {
        return Bukkit.getServer().getPluginManager().getPlugin("PermissionsEx");
    }

    public static PermissionManager getPermissionManager() {
        return ((PermissionsEx) getPlugin()).permissionsManager;
    }

    public static PermissionUser getUser(Player player) {
        return getPermissionManager().getUser(player);
    }

    public static PermissionUser getUser(String name) {
        return getPermissionManager().getUser(name);
    }

    public boolean has(Player player, String permission) {
        return this.permissionsManager.has(player, permission);
    }

    public boolean has(Player player, String permission, String world) {
        return this.permissionsManager.has(player, permission, world);
    }
}
