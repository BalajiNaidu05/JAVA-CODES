package com.Message;
import java.util.concurrent.*;
public class Consumer implements Runnable {
    private final BlockingQueue<String> buffer;
    private final String POISON_PILL = "POISON_PILL"; // Special message to indicate stopping

    public Consumer(BlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = buffer.take();
                if (message.equals(POISON_PILL)) {
                    System.out.println("Consumer received poison pill. Stopping.");
                    break; // Exit loop upon receiving the poison pill
                }
                System.out.println("Consumed: " + message);
                Thread.sleep(1500); // Simulate delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}