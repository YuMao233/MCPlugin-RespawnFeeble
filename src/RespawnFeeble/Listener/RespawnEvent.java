/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble.Listener;

import Task.KickTimer;
import RespawnFeeble.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.scheduler.BukkitScheduler;

/**
 *
 * @author Administrator
 */
public class RespawnEvent implements Listener {

    private final int yu;
    private final Main main;

    /**
     *
     * @param yu
     * @param main
     */
    public RespawnEvent(int yu, Main main) {
        this.yu = yu;
        this.main = main;
    }

    @EventHandler(priority = EventPriority.LOW)//线程级别设置
    public void onPlayerRespawn(PlayerRespawnEvent respawnPlayer) {
        Player pl = respawnPlayer.getPlayer();
        pl.sendMessage(ChatColor.GREEN + "您已复活，您将进入虚弱状态.....");
        BukkitScheduler sched = Bukkit.getServer().getScheduler();
        sched.runTaskLater(main, new KickTimer(pl, yu), 10);
        //PotionEffectType
        //药水种类,等级,持续时间
        // PotionEffect pe = new PotionEffect(PotionEffectType.SPEED.,1,1);
       /*
         #玩家复活重生之后的药水效果列表:
         #1:缓慢移动
         #2:挖掘缓慢
         #3:失明
         #4:防火
         #5:枯萎
         #6:弱点
         #7:混乱
         #8:饥饿
         #9:增加伤害
         */
    }
}
