package com.Buffer;

public class Consumer implements Runnable {

	  private final BoundedBuffer buffer;

	    public Consumer(BoundedBuffer buffer) {
	        this.buffer = buffer;
	    }
	    
	@Override
	public void run() {
		 try {
	            for (int i = 1; i <= 20; i++) { // consume 20 items
	                buffer.consume(); // consume items
	                Thread.sleep(150); // simulate consumption time
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
		
	}

}
