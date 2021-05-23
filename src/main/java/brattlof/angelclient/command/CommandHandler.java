package brattlof.angelclient.command;

import brattlof.angelclient.command.commands.*;

import java.util.Arrays;
import java.util.List;

public class CommandHandler {
    public static List<Command> commands = Arrays.asList(
        new CmdDupe(),
        new CmdClearInventory()
    );
}
