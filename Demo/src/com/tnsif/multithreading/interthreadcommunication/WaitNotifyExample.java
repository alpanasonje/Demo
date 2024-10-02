package com.tnsif.multithreading.interthreadcommunication;

public class WaitNotifyExample {
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
                try {
                    System.out.println("Producer: Buffer is full. Waiting for consumer to consume items...");
                    lock.wait(); // Wait until the consumer consumes some items
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
            }
            itemCount++;
            System.out.println("Producer: Produced item. Total items: " + itemCount);
            lock.notify(); // Notify the consumer that an item is available
        }
    }

    private static void consumeItem() {
        synchronized (lock) {
            while (itemCount == 0) {
                try {
                    System.out.println("Consumer: Buffer is empty. Waiting for producer to produce items...");
                    lock.wait(); // Wait until the producer produces some items
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            itemCount--;
            System.out.println("Consumer: Consumed item. Total items: " + itemCount);
            lock.notify(); // Notify the producer that an item has been consumed
        }
    }
}
