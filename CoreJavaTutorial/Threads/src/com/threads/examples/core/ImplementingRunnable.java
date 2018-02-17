package com.threads.examples.core;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 10:56 AM
 */
public class ImplementingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+ " Thread Priority = " + Thread.currentThread().getPriority());
    }
}
