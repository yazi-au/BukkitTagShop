package net.cod;

import net.cod.command.GUIManage;
import org.bukkit.plugin.java.JavaPlugin;

public final class CODPlugin extends JavaPlugin {

    private void command(){
        getCommand("tagui").setExecutor(new GUIManage());
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
