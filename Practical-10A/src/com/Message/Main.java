package com.Message;


public class Main {
	 
	public static void main(String[] args) throws InterruptedException {
	        int bufferCapacity = 5; // Buffer with a capacity of 5 messages
	        int messageLimit = 10; // Number of messages to produce

	        SharedBuffer sharedBuffer = new SharedBuffer(bufferCapacity);

	        Producer producer = new Producer(sharedBuffer.getBuffer(), messageLimit);
	        Consumer consumer = new Consumer(sharedBuffer.getBuffer());

	        Thread producerThread = new Thread(producer);
	        Thread consumerThread = new Thread(consumer);

	        producerThread.start();
	        consumerThread.start();

	        try {
	            producerThread.join(); // Wait for the producer to finish
	            consumerThread.join(); // Wait for the consumer to finish
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
       
	        System.out.println("Messaging application has completed.");
	    }
	}