/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble;

import static RespawnFeeble.Main.yaoTime;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitTask;

/**
 *
 * @author Administrator
 */
public class KickTimer implements Runnable {

    private int i;
    private final Player pl;
    private final int hp;
    private BukkitTask id;

    /**
     *
     * @param pl
     * @param hp
     */
    public KickTimer(Player pl, int hp) {
        this.pl = pl;
        this.hp = hp;
    }
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
     pl.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60 * 20, 2));
     */

    @Override
    public void run() {
        if (pl != null) {
            pl.setHealth((double) hp);
            //pl.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60 * 20, 2));
            for (String s : Main.yao) {
                switch (Integer.parseInt(s)) {
                    case 1:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, yaoTime * 20, 1));   //添加药水效果
                        break;
                    case 2:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, yaoTime * 20, 1));
                        break;
                    case 3:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, yaoTime * 20, 1));
                        break;
                    case 4:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, yaoTime * 20, 1));
                        break;
                    case 5:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, yaoTime * 20, 1));
                        break;
                    case 6:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, yaoTime * 20, 1));
                        break;
                    case 7:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, yaoTime * 20, 1));
                        break;
                    case 8:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, yaoTime * 20, 1));
                        break;
                    case 9:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, yaoTime * 20, 1));
                        break;
                    case 10:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, yaoTime * 20, 1));
                        break;
                    case 11:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, yaoTime * 20, 1));
                        break;
                    case 12:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.HARM, yaoTime * 20, 1));
                        break;
                    case 13:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, yaoTime * 20, 1));
                        break;
                    case 14:
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, yaoTime * 20, 1));
                        break;
                    default:
                        System.out.println("[RespawnFeeble] 指定的药水效果:" + Integer.parseInt(s) + " 无法判断此值，此效果失效。");
                }
            }
        }
    }
}
