package brattlof.angelclient.command.commands;

import brattlof.angelclient.command.Command;
import brattlof.angelclient.utils.AngelLogger;
import net.minecraft.item.ItemStack;
import net.minecraft.world.GameMode;

public class CmdClearInventory extends Command
{
    @Override
    public String getAlias()
    {
        return "clear";
    }

    @Override
    public void doCommand()
    {
        if(mc.interactionManager.getCurrentGameMode() == GameMode.CREATIVE)
        {
            for(int i = 0; i < 200; i++)
            {
                mc.player.inventory.setStack(i, new ItemStack(null));
            }

            AngelLogger.inChat("Cleared inventory");
            
            return;
        }
        
        AngelLogger.inChat("Not in creative mode");
    }
}
