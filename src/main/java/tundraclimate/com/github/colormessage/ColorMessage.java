package tundraclimate.com.github.colormessage;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ColorMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e){
        if (e.getMessage().startsWith("&")){
            String chat = ChatColor.translateAlternateColorCodes('&',e.getMessage());
            e.setMessage(chat);
        }
    }
}
