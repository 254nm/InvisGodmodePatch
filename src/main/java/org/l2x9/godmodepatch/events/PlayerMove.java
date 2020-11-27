package org.l2x9.godmodepatch.events;

import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/*
Created by 254n_m
I have no idea if this works but in theory it should
 */
public class PlayerMove implements Listener {
	@EventHandler
	public void onMove(PlayerMoveEvent event) {
		if (event.getPlayer().isInsideVehicle()) {
			Player player = event.getPlayer();
			Vehicle vehicle = (Vehicle) player.getVehicle();
			Chunk playerChunk = player.getChunk();
			Chunk vehicleChunk = vehicle.getChunk();
			if (playerChunk != vehicleChunk) {
				System.out.println(ChatColor.translateAlternateColorCodes('&', "[&b&lAnti&r&3&lGodmode&r]&c Prevented&r&6 " + player.getName() + " from using godmode"));
				vehicle.eject();
			}
		}
	}
}
