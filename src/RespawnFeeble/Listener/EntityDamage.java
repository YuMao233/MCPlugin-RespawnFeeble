/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble.Listener;

import static RespawnFeeble.Main.m;
import Task.LookHP;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.scheduler.BukkitScheduler;

/**
 *
 * @author Administrator
 */
public class EntityDamage implements Listener {

    //EntityDamageEvent
    @EventHandler(priority = EventPriority.LOW)//线程级别设置

    public void onEntityDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player pl;
            pl = (Player) e.getEntity();
            if (pl != null) {
                //pl.sendMessage("你受到了伤害");
                BukkitScheduler sched = Bukkit.getServer().getScheduler();
                sched.runTaskLater(m, new LookHP(pl), 10);
                
            }
        }
    }
}
