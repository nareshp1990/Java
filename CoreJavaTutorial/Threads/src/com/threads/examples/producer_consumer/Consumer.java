package com.threads.examples.producer_consumer;

import java.util.Queue;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 11:55 PM
 */
class Consumer extends Thread {

    private Queue<Integer> queue;
    private int queueSize;

    public Consumer(Queue<Integer> queueIn, int queueSizeIn, String ThreadName) {
        super(ThreadName);
        this.queue = queueIn;
        this.queueSize = queueSizeIn;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out
                        .println(Thread.currentThread().getName() + " Empty        : waiting...\n");
                    try {
                        queue.wait();  //Important
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                //queue empty then consume one and notify
                System.out.println(
                    Thread.currentThread().getName() + " consuming... : " + queue.remove());
                queue.notifyAll();
            } //synchronized ends here : NOTE
        }
    }
}
