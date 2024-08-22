package com.Log;
import java.util.*;

public class Logger {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void processCommands() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            // Example usage, processing with a test message and level
            command.execute("Test message", LogLevel.INFO);
        }
    }
}
