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

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 *
 * @author Ryan
 */
public class PermissionManager {

    public PermissionUser getUser(String name) {
        //first, null checks.
        if (name == null || name.isEmpty()) {
            return null;
        }
        //if their name ain't null, go get 'em tiger! :D
        return (getUser(Bukkit.getPlayer(name)));
    }

    public PermissionUser getUser(Player player) {
        return new PermissionUser(player);
    }

    public boolean has(Player player, String permission) {
        return player.hasPermission(permission);
    }

    public boolean has(Player player, String permission, String world) {
        return player.hasPermission(permission);
    }
}
