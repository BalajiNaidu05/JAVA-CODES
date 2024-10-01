package com.Buffer;

public class Producer implements Runnable {
	 private final BoundedBuffer buffer;

	    public Producer(BoundedBuffer buffer) {
	        this.buffer = buffer;
	    }
	
	@Override
	public void run() {
		 try {
	            for (int i = 1; i <= 20; i++) { // produce 20 items
	                buffer.produce(i); // produce items from 1 to 20
	                Thread.sleep(100); // simulate production time
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
		
	}

}
