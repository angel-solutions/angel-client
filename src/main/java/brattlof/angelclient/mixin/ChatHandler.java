package brattlof.angelclient.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import brattlof.angelclient.command.Command;
import brattlof.angelclient.command.CommandHandler;

@Mixin(Screen.class)
public class ChatHandler {
    @Inject(method="sendMessage(Ljava/lang/String;)V", at=@At("HEAD"), cancellable = true)
    public void sendChatMessageOverride(String message, CallbackInfo callinfo)
    {
        if(message.toLowerCase().startsWith("!"))
        {
            callinfo.cancel();

            for(Command command : CommandHandler.commands)
            {
                if(command.getAlias().equalsIgnoreCase(message.substring(1)))
                {
                    command.doCommand();
                    return;
                }
            }

            logChatMessage("Unknown Command");
        }
    }

    private void logChatMessage(String message)
    {
        MinecraftClient.getInstance().player.sendMessage(Text.of("[Angel] " + message), false);
    }
}
