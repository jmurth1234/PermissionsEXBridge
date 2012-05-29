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
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Ryan
 */
public class PermissionsEx extends JavaPlugin {
    protected static final Logger logger = Logger.getLogger("Minecraft");
    
    public void onEnable() {
        logger.log(Level.INFO, "[PermissionsEXBridge] version" + this.getDescription().getVersion() + " enabled");
    }
    
    public void onDisable() {
        logger.log(Level.INFO, "[PermissionsEXBridge] version" + this.getDescription().getVersion() + " disabled");
    }
}
