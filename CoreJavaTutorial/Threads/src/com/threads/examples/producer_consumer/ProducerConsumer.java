package com.threads.examples.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 11:56 PM
 */
class ProducerConsumer {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new LinkedList<>();
        Integer buffer = new Integer(10);  //Important buffer or queue size, change as per need.

        Producer producerThread = new Producer(queue, buffer, "PRODUCER");
        Consumer consumerThread = new Consumer(queue, buffer, "CONSUMER");

        producerThread.start();
        consumerThread.start();
    }
}
