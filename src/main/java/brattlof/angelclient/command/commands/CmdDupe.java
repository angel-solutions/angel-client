package brattlof.angelclient.command.commands;

import brattlof.angelclient.command.Command;

import net.minecraft.text.LiteralText;

public class CmdDupe extends Command // Patched in 1.14.4+
{
    @Override
    public String getAlias()
    {
        return "dupe";
    }

    @Override
    public void doCommand()
    {
        mc.player.dropSelectedItem(true);
        mc.player.networkHandler.getConnection().disconnect(new LiteralText("[Angel] Trying to dupe"));
    }
}
