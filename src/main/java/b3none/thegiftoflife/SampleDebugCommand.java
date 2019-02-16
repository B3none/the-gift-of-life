package b3none.thegiftoflife;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SampleDebugCommand implements CommandExecutor
{
    private final SamplePlugin plugin;

    public SampleDebugCommand(SamplePlugin plugin)
    {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] split)
    {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            plugin.setDebugging(player, !plugin.isDebugging(player));

            return true;
        } else {
            return false;
        }
    }
}
