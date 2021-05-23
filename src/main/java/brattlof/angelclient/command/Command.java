package brattlof.angelclient.command;

import net.minecraft.client.MinecraftClient;

public abstract class Command 
{
    protected MinecraftClient mc = MinecraftClient.getInstance();

    public abstract String getAlias();

    public abstract void doCommand();
}
