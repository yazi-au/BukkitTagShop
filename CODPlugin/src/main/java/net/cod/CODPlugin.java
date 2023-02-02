package net.cod;

import net.cod.Util.GUI;
import net.cod.command.GUIManage;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class CODPlugin extends JavaPlugin {

    private void command(){
        getCommand("tagui").setExecutor(new GUIManage());
    }

    private void loadConfig(){
        GUI.prefix = new ArrayList<>( getConfig().getStringList("prefix"));
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        command();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
