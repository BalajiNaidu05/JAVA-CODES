package com.Buffer;

public class BoundedBuffer {
	 private final int[] buffer = new int[10]; // buffer with maximum capacity of 10
	    private int count = 0, in = 0, out = 0;

	    // synchronized method for adding an item to the buffer
	    public synchronized void produce(int item) throws InterruptedException {
	        while (count == buffer.length) { // wait if buffer is full
	            System.out.println("Buffer is full, producer is waiting...");
	            wait();
	        }
	        buffer[in] = item;
	        in = (in + 1) % buffer.length;
	        count++;
	        System.out.println("Produced: " + item);
	        notifyAll(); // notify the consumer that an item is available
	    }

	    // synchronized method for removing an item from the buffer
	    public synchronized int consume() throws InterruptedException {
	        while (count == 0) { // wait if buffer is empty
	            System.out.println("Buffer is empty, consumer is waiting...");
	            wait();
	        }
	        int item = buffer[out];
	        out = (out + 1) % buffer.length;
	        count--;
	        System.out.println("Consumed: " + item);
	        notifyAll(); // notify the producer that a space is available
	        return item;
	    }
}
