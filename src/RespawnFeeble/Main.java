/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RespawnFeeble;

import RespawnFeeble.Listener.RespawnEvent;
import RespawnFeeble.Listener.EntityDamage;
import java.io.File;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Administrator
 */
public class Main extends JavaPlugin implements CommandExecutor {

    public static List<String> yao;
    public static List<String> yao2;
    public static int yaoTime;
    public static int yao2Time;
    public static int MinHealth;
    public static Main m;

    @Override
    public void onEnable() {
        m = this;
        String OAO
                = "本插件 开发者： 双羽 。欢迎您反编译源代码查看= ="
                + "然后就是 切勿侵权，尊重别人的版权，感谢。如果只是学习可随意 查看~，切不可用于商业用途！"
                + "本插件无后门 ，请放心使用。"
                + "QQ 951092158";
        OAO = null;
        final String path = "config.yml";
        //final String chr = "\r\n";
        File files = new File(Bukkit.getServer().getPluginManager().getPlugin("RespawnFeeble").getDataFolder(), path);
        if (!files.exists()) {
            saveDefaultConfig();
        }
        FileConfiguration config = YamlConfiguration.loadConfiguration(files);//实例化配置类
        int hp = 1;
        if (config.getBoolean("RespawnWeakness.Enable", true)) {
            hp = config.getInt("RespawnWeakness.RespawnHealth", 1);
            yao = config.getStringList("RespawnWeakness.EffectList");
            yaoTime = config.getInt("RespawnWeakness.Time", 60);
            getLogger().info("玩家虚弱状态的血量是: " + hp);
            getLogger().info("玩家复活之后的药水效果时间: " + yaoTime);
            String temp = "";
            for (String s : yao) {
                temp = temp + s + " ";
            }
            getLogger().info("玩家复活的效果列表: " + temp);
            this.getServer().getPluginManager().registerEvents(new RespawnEvent(hp, this), this);//注册监听器
        } else {
            yao = null;
            getLogger().info("玩家虚弱状态功能关闭");
        }
        if (config.getBoolean("HealthWeakness.Enable", true)) {
            MinHealth = config.getInt("HealthWeakness.MinHealth", 3);
            yao2 = config.getStringList("HealthWeakness.EffectList");
            yao2Time = config.getInt("HealthWeakness.Time", 15);
            getLogger().info("玩家进入特定状态最低血量: " + MinHealth);
            getLogger().info("特定状态时间: " + yao2Time);
            String temp = "";
            for (String s : yao2) {
                temp = temp + s + " ";
            }
            getLogger().info("玩家进入特定效果的效果列表: " + temp);
            this.getServer().getPluginManager().registerEvents(new EntityDamage(), this);//注册监听器
            //this.getServer().getPluginManager().registerEvents(new EntityRegainHealth(), this);//注册监听器
            //EntityRegainHealth
        } else {
            getLogger().info("玩家特定状态功能关闭");
            yao2 = null;
        }

        getLogger().info("已成功装载");
    }

    @Override
    public void onDisable() {
        getLogger().info("已卸载");
    }

    /**
     *
     * @param sender
     * @param cmd
     * @param label
     * @param args
     * @return Boolean
     */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return true;
    }
}
