package com.Message;

import java.util.concurrent.*;
public class Producer implements Runnable {
    private final BlockingQueue<String> buffer;
    private static int messageCount = 0;
    private final int messageLimit; // Maximum number of messages to produce
    private final String POISON_PILL = "POISON_PILL"; // Special message to indicate stopping

    public Producer(BlockingQueue<String> buffer, int messageLimit) {
        this.buffer = buffer;
        this.messageLimit = messageLimit;
    }

    @Override
    public void run() {
        try {
            while (messageCount < messageLimit) {
                String message = "Message-" + ++messageCount;
                buffer.put(message);
                System.out.println("Produced: " + message);
                Thread.sleep(1000); // Simulate delay
            }
            buffer.put(POISON_PILL); // Add poison pill to signal the end
            System.out.println("Producer finished producing messages.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}