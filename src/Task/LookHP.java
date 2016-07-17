/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import RespawnFeeble.Main;
import static RespawnFeeble.Main.MinHealth;
import static RespawnFeeble.Main.yao2;
import static RespawnFeeble.Main.yao2Time;
import RespawnFeeble.PotionEffect;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author Administrator
 */
public class LookHP implements Runnable {

    private final Player pl;

    /**
     *
     * @param pl
     * @param hp
     */
    public LookHP(Player pl) {
        this.pl = pl;
    }

    @Override
    public void run() {
        if (pl.getHealth() <= MinHealth) {  //如果玩家的血比较少了。。。
            pl.sendMessage(ChatColor.RED + " 你的生命垂危.........");
            //pl.sendMessage("你受到了伤害: getHealth" + pl.getHealth() + "   MinHealth:" + MinHealth);
            for (String s : yao2) {
                new PotionEffect().setPotionEffect(pl, s, yao2Time);   //玩家的血少了，开始赋值属性
            }
        }
    }
}
