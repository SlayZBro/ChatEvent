package me.chatevent;

import me.chatevent.handlers.ChatEvent;
import me.chatevent.handlers.Generate;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;


    @Override
    public void onEnable() {
        setInstance(this);
        getServer().getConsoleSender().sendMessage("Chat Event plugin has enabled!");
        new Generate();
        getServer().getPluginManager().registerEvents(new ChatEvent(),this);
    }


    public void setInstance(Main m){
        instance = m;
    }

    public static Main getInstance(){
        return instance;
    }
}
