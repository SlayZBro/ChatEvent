package me.chatevent.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    @EventHandler
    public void chat(AsyncPlayerChatEvent e){
        if(Generate.getStart() && e.getMessage().equals(Generate.getWord())){

            if(Generate.getWord().length()<10) {
                Bukkit.broadcastMessage(ChatColor.YELLOW + e.getPlayer().getName() + ChatColor.GOLD + " has finished the chat event and won 300$");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "eco give " + e.getPlayer().getName() + " 300");
            }else{
                Bukkit.broadcastMessage(ChatColor.YELLOW + e.getPlayer().getName() + ChatColor.GOLD + " has finished the chat event and won 300$");
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "Crates key "+e.getPlayer().getName()+" vote 1");
            }

            Generate.setStart(false);

        }
    }
}
