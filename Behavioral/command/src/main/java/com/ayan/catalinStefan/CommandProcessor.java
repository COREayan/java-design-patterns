package com.ayan.catalinStefan;

import java.util.*;

public class CommandProcessor {
    List<Command> commands = new ArrayList<>();

    public CommandProcessor addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void processCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
