package com.Log;
public class ActionHandler {
    private Logger logger;

    public ActionHandler() {
        // Get the single instance of Logger
        logger = Logger.getInstance();
    }

    public void performAction(String actionName) {
        logger.log("Performing action: " + actionName);
        // Simulate some action
        logger.log(actionName + " completed.");
    }
}
