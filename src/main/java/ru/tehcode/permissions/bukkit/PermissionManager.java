/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
