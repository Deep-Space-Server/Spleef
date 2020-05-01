package fr.naruse.spleef.common.placeholder;

import org.bukkit.Bukkit;

import fr.naruse.spleef.main.SpleefPlugin;
import me.clip.placeholderapi.PlaceholderAPIPlugin;

public class SpleefPlaceholder {
    private SpleefPlugin pl;
    private PlaceholderAPIPlugin placeholderAPIPlugin;
    public SpleefPlaceholder(SpleefPlugin pl) {
        this.pl = pl;
        this.placeholderAPIPlugin = (PlaceholderAPIPlugin) Bukkit.getPluginManager().getPlugin("PlaceholderAPI");
        if(placeholderAPIPlugin != null){
            new RankingExpansion().register();
        }
    }
}
