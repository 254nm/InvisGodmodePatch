package org.l2x9.godmodepatch;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.l2x9.godmodepatch.events.PlayerMove;

public final class GodModePatch extends JavaPlugin {
	PluginManager pluginManager = getServer().getPluginManager();
	@Override
	public void onEnable() {
		pluginManager.registerEvents(new PlayerMove(), this);
	}
}
