package com.threads.examples.core;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 10:55 AM
 */
public class ExtendingThread extends Thread {

    public ExtendingThread(String name) {
        super(name);
    }

    public ExtendingThread() {
    }

    public ExtendingThread(Runnable target) {
        super(target);
    }

    public ExtendingThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public ExtendingThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public ExtendingThread(Runnable target, String name) {
        super(target, name);
    }

    public ExtendingThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public ExtendingThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }

    @Override
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+ " Thread Priority = " + Thread.currentThread().getPriority());
    }
}
