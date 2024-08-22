package com.Log;
public class Application {
    public static void main(String[] args) {
        // Create an ActionHandler and perform some actions
        ActionHandler actionHandler = new ActionHandler();

        // Log the start of the application
        Logger logger = Logger.getInstance();
        logger.log("Application started");

        // Perform some actions
        actionHandler.performAction("Action 1");
        actionHandler.performAction("Action 2");

        // Log the end of the application
        logger.log("Application finished");
    }
}
