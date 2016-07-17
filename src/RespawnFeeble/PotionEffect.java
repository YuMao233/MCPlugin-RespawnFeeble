/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble;

import static RespawnFeeble.Main.yaoTime;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

/**
 *
 * @author Administrator
 */
public class PotionEffect {

    public void setPotionEffect(Player pl, int i) {
        switch (i) {
            case 1:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SLOW, yaoTime * 20, 1));   //添加药水效果
                break;
            case 2:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SLOW_DIGGING, yaoTime * 20, 1));
                break;
            case 3:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.BLINDNESS, yaoTime * 20, 1));
                break;
            case 4:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.FIRE_RESISTANCE, yaoTime * 20, 1));
                break;
            case 5:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.WITHER, yaoTime * 20, 1));
                break;
            case 6:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.WEAKNESS, yaoTime * 20, 1));
                break;
            case 7:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.CONFUSION, yaoTime * 20, 1));
                break;
            case 8:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HUNGER, yaoTime * 20, 1));
                break;
            case 9:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.INCREASE_DAMAGE, yaoTime * 20, 1));
                break;
            case 10:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SPEED, yaoTime * 20, 1));
                break;
            case 11:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.FAST_DIGGING, yaoTime * 20, 1));
                break;
            case 12:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HARM, yaoTime * 20, 1));
                break;
            case 13:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HEAL, yaoTime * 20, 1));
                break;
            case 14:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.JUMP, yaoTime * 20, 1));
                break;
            default:
                System.out.println("[RespawnFeeble] 指定的作用效果:" + i + " 无法判断此值，此效果失效。");
        }
    }

    /**
     *
     * @param pl
     * @param s
     */
    public void setPotionEffect(Player pl, String s) {
        switch (Integer.parseInt(s)) {
            case 1:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SLOW, yaoTime * 20, 1));   //添加药水效果
                break;
            case 2:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SLOW_DIGGING, yaoTime * 20, 1));
                break;
            case 3:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.BLINDNESS, yaoTime * 20, 1));
                break;
            case 4:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.FIRE_RESISTANCE, yaoTime * 20, 1));
                break;
            case 5:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.WITHER, yaoTime * 20, 1));
                break;
            case 6:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.WEAKNESS, yaoTime * 20, 1));
                break;
            case 7:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.CONFUSION, yaoTime * 20, 1));
                break;
            case 8:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HUNGER, yaoTime * 20, 1));
                break;
            case 9:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.INCREASE_DAMAGE, yaoTime * 20, 1));
                break;
            case 10:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SPEED, yaoTime * 20, 1));
                break;
            case 11:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.FAST_DIGGING, yaoTime * 20, 1));
                break;
            case 12:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HARM, yaoTime * 20, 1));
                break;
            case 13:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HEAL, yaoTime * 20, 1));
                break;
            case 14:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.JUMP, yaoTime * 20, 1));
                break;
            default:
                System.out.println("[RespawnFeeble] 指定的作用效果:" + Integer.parseInt(s) + " 无法判断此值，此效果失效。");
        }
    }

    /**
     *
     * @param pl
     * @param s
     * @param time
     */
    public void setPotionEffect(Player pl, String s, int time) {
        switch (Integer.parseInt(s)) {
            case 1:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SLOW, time * 20, 0));   //添加药水效果
                break;
            case 2:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SLOW_DIGGING, time * 20, 0));
                break;
            case 3:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.BLINDNESS, time * 20, 0));
                break;
            case 4:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.FIRE_RESISTANCE, time * 20, 0));
                break;
            case 5:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.WITHER, time * 20, 0));
                break;
            case 6:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.WEAKNESS, time * 20, 0));
                break;
            case 7:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.CONFUSION, time * 20, 0));
                break;
            case 8:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HUNGER, time * 20, 0));
                break;
            case 9:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.INCREASE_DAMAGE, time * 20, 0));
                break;
            case 10:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.SPEED, time * 20, 0));
                break;
            case 11:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.FAST_DIGGING, time * 20, 0));
                break;
            case 12:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HARM, time * 20, 0));
                break;
            case 13:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.HEAL, time * 20, 0));
                break;
            case 14:
                pl.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.JUMP, time * 20, 0));
                break;
            default:
                System.out.println("[RespawnFeeble] 指定的作用效果:" + Integer.parseInt(s) + " 无法判断此值，此效果失效。");
        }
    }

    public void removeAll(Player pl) {
        pl.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
        pl.removePotionEffect(PotionEffectType.BLINDNESS);
        pl.removePotionEffect(PotionEffectType.CONFUSION);
        pl.removePotionEffect(PotionEffectType.FAST_DIGGING);
        pl.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
        pl.removePotionEffect(PotionEffectType.HARM);
        pl.removePotionEffect(PotionEffectType.HEAL);
        pl.removePotionEffect(PotionEffectType.HUNGER);
        pl.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
        pl.removePotionEffect(PotionEffectType.INVISIBILITY);
        pl.removePotionEffect(PotionEffectType.JUMP);
        pl.removePotionEffect(PotionEffectType.NIGHT_VISION);
        pl.removePotionEffect(PotionEffectType.POISON);
        pl.removePotionEffect(PotionEffectType.REGENERATION);
        pl.removePotionEffect(PotionEffectType.SLOW);
        pl.removePotionEffect(PotionEffectType.SLOW_DIGGING);
        pl.removePotionEffect(PotionEffectType.SPEED);
        pl.removePotionEffect(PotionEffectType.WATER_BREATHING);
        pl.removePotionEffect(PotionEffectType.WEAKNESS);
        pl.removePotionEffect(PotionEffectType.WITHER);
    }

    public void remove(Player pl, String s) {
        switch (Integer.parseInt(s)) {
            case 1:
                pl.removePotionEffect(PotionEffectType.SLOW);   //添加药水效果
                break;
            case 2:
                pl.removePotionEffect(PotionEffectType.SLOW_DIGGING);
                break;
            case 3:
                pl.removePotionEffect(PotionEffectType.BLINDNESS);
                break;
            case 4:
                pl.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
                break;
            case 5:
                pl.removePotionEffect(PotionEffectType.WITHER);
                break;
            case 6:
                pl.removePotionEffect(PotionEffectType.WEAKNESS);
                break;
            case 7:
                pl.removePotionEffect(PotionEffectType.CONFUSION);
                break;
            case 8:
                pl.removePotionEffect(PotionEffectType.HUNGER);
                break;
            case 9:
                pl.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
                break;
            case 10:
                pl.removePotionEffect(PotionEffectType.SPEED);
                break;
            case 11:
                pl.removePotionEffect(PotionEffectType.FAST_DIGGING);
                break;
            case 12:
                pl.removePotionEffect(PotionEffectType.HARM);
                break;
            case 13:
                pl.removePotionEffect(PotionEffectType.HEAL);
                break;
            case 14:
                pl.removePotionEffect(PotionEffectType.JUMP);
                break;
            default:
                System.out.println("[RespawnFeeble] 指定的作用效果:" + Integer.parseInt(s) + " 无法判断此值，此效果失效。");
        }
    }
}
