package com.zeryther.kevinrain;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by zeryt on 18.02.2017.
 */
public class KevinRain extends JavaPlugin implements Listener {
    public void onEnable(){
        for(World w : Bukkit.getWorlds()){
            w.setStorm(false);
        }

        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e){
        e.setCancelled(true);
    }
}
