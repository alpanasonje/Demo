package com.tnsif.multithreading.interthreadcommunication;

public class InterThreadCommunicationDemo {
	private static final int MAX_ITEMS = 5;
	private static final Object lock = new Object();
	private static int itemCount = 0;

	public static void main(String[] args) {
		Thread producerThread = new Thread(() -> {
			while (true) {
				produceItem();
				try {
					Thread.sleep(1000); // Simulate production time
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(() -> {
			while (true) {
				consumeItem();
				try {
					Thread.sleep(1500); // Simulate consumption time
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producerThread.start();
		consumerThread.start();
	}

	private static void produceItem() {
		synchronized (lock) {
			while (itemCount >= MAX_ITEMS) {
				System.out.println("Producer: Buffer is full. Waiting for consumer to consume items...");
			}
			itemCount++;
			System.out.println("Producer: Produced item. Total items: " + itemCount);

		}
	}

	private static void consumeItem() {
		synchronized (lock) {
			while (itemCount == 0) {
				System.out.println("Consumer: Buffer is empty. Waiting for producer to produce items...");
			}
			itemCount--;
			System.out.println("Consumer: Consumed item. Total items: " + itemCount);
		}
	}

}
