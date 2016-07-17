/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

/**
 *
 * @author Administrator
 */
public class EntityRegainHealth implements Listener {

    //EntityRegainHealthEvent
    @EventHandler(priority = EventPriority.LOW)//线程级别设置

    public void onEntityRegainHealth(EntityRegainHealthEvent e) {
        if (e.getEntity() instanceof Player) {
            Player pl;
            pl = (Player) e.getEntity();
            if (pl != null) {
                
            }
        }
    }
}
