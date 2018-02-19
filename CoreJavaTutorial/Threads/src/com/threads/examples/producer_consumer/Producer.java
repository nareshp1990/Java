package com.threads.examples.producer_consumer;

import java.util.Queue;
import java.util.Random;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 11:53 PM
 */
class Producer extends Thread {

    private Queue<Integer> queue;
    private int queueSize;

    public Producer(Queue<Integer> queueIn, int queueSizeIn, String ThreadName) {
        super(ThreadName);
        this.queue = queueIn;
        this.queueSize = queueSizeIn;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == queueSize) {
                    System.out
                        .println(Thread.currentThread().getName() + " FULL         : waiting...\n");
                    try {
                        queue.wait();   //Important
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                //queue empty then produce one, add and notify
                int randomInt = new Random().nextInt();
                System.out
                    .println(Thread.currentThread().getName() + " producing... : " + randomInt);
                queue.add(randomInt);
                queue.notifyAll();  //Important
            } //synchronized ends here : NOTE
        }
    }
}

