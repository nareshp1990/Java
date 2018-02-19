package com.threads.examples.inter_thread;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 11:27 PM
 */
public class ThreadA {

    public static void main(String[] args)throws InterruptedException {

        Thread.currentThread().setName("Thread-A");
        ThreadB threadB=new ThreadB("Thread-B");
        threadB.start();
        Thread.sleep(10000);
        System.out.println( Thread.currentThread().getName() +" got a chance to execute ...");
        System.out.println(Thread.currentThread().getName() + " waiting to acquire lock on " + threadB.getName());
        synchronized (threadB){
            System.out.println( Thread.currentThread().getName() +" acquired lock ");
            System.out.println( Thread.currentThread().getName() +" trying to call wait() ...");
            threadB.wait(1000);
            System.out.println( Thread.currentThread().getName() +" got notification ...");
            System.out.println("Total : " + threadB.total);
        }
        System.out.println("End of " + Thread.currentThread().getName());
    }

}
