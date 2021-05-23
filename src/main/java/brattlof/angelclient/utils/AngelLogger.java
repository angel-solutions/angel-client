package brattlof.angelclient.utils;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class AngelLogger
{
    public static void inChat(String message)
    {
        MinecraftClient.getInstance().player.sendMessage(Text.of("[Angel] " + message), false);
    }
}