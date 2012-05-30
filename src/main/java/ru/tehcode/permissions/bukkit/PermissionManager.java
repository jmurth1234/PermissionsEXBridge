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
        return(getUser(Bukkit.getPlayer(name)));
    }
    
    public PermissionUser getUser(Player player) {
        return new PermissionUser(player);
    }  

    public boolean has(Player player, String permission) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean has(Player player, String permission, String world) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
