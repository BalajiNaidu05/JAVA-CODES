package com.Log;
public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create commands
        Command logInfo = new LogCommand(infoHandler);
        Command logDebug = new LogCommand(debugHandler);
        Command logError = new LogCommand(errorHandler);

        // Create logger
        Logger logger = new Logger();
        logger.addCommand(logInfo);
        logger.addCommand(logDebug);
        logger.addCommand(logError);

        // Process commands
        logger.processCommands();
    }
}
