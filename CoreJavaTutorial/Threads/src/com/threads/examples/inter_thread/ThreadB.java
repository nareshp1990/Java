package com.threads.examples.inter_thread;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 11:22 PM
 */
public class ThreadB extends Thread{

    int total=0;

    public ThreadB(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " got a chance to execute ...");
        System.out.println( Thread.currentThread().getName() +" waiting to acquire lock ...");
        synchronized (this){
            System.out.println( Thread.currentThread().getName() +" acquired lock ");
            for (int i=0;i<100;i++){
                total+=1;
            }
            System.out.println("Thread-B giving notification to waiting thread ...");
            notify();
        }
        System.out.println("End of " + Thread.currentThread().getName());
    }
}
