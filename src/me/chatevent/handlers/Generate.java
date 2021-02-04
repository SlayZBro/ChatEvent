package me.chatevent.handlers;

import me.chatevent.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generate {

    private static String word = "";
    private static boolean start = false;
    public Generate(){
        generate();
    }

    public void generate(){
        new BukkitRunnable() {
            int i=0;
            @Override
            public void run() {
                if(i++==300){
                    i=0;
                    Random rnd = new Random();
                    int random = ThreadLocalRandom.current().nextInt(5,16);
                    String a ="";
                    for(int i=0;i<random;i++){
                        a+= (char)(rnd.nextInt(26) + 'a')+"";
                    }
                    word =a;

                    Bukkit.broadcastMessage("\n\n"+ChatColor.AQUA+"Chat Event has started!"+"\n"+ChatColor.GOLD+"Repeat the message to get a prize!!"+"\n\n"+ChatColor.GRAY+word);
                    Bukkit.broadcastMessage(" ");
                    Bukkit.broadcastMessage(" ");
                    start = true;

                }


            }
        }.runTaskTimer(Main.getInstance(), 0, 20);

    }

    public static String getWord(){return word;}
    public static boolean getStart(){return start;}

    public static void setStart(boolean start1){
        start=start1;
    }
}
