/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

/**
 *
 * @author Administrator
 */
public class RespawnEvent implements Listener {
    int yu ;
    public RespawnEvent (int yu){
        this.yu=yu;
    }

    @EventHandler(priority = EventPriority.LOW)//线程级别设置
    public void onPlayerRespawn(PlayerRespawnEvent respawnPlayer) {
        Player pl = respawnPlayer.getPlayer();
        pl.sendMessage(ChatColor.GREEN +"您不幸死亡，您现在进入虚弱状态。");
        pl.setHealth(2.0);
    }
}
