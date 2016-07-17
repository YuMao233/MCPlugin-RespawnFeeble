/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import RespawnFeeble.Main;
import RespawnFeeble.PotionEffect;
import org.bukkit.entity.Player;

/**
 *
 * @author Administrator
 */
public class KickTimer implements Runnable {

    private int i;
    private final Player pl;
    private final int hp;

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
                new PotionEffect().setPotionEffect(pl, s);
            }
        }
    }
}
