package com.Message;
import java.util.concurrent.*;
public class SharedBuffer {
    private final BlockingQueue<String> buffer;

    public SharedBuffer(int capacity) {
        this.buffer = new ArrayBlockingQueue<>(capacity);
    }

    public BlockingQueue<String> getBuffer() {
        return buffer;
    }
}