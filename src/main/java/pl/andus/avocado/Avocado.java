package pl.andus.avocado;

import org.bukkit.plugin.java.JavaPlugin;
import pl.andus.avocado.cmds.AboutCmd;
import pl.andus.avocado.cmds.MainCmd;

public final class Avocado extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands() {
        this.getCommand("avout").setExecutor(new AboutCmd());
        this.getCommand("avo").setExecutor(new MainCmd());
    }
}
