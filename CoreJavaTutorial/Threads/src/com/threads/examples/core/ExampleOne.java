package com.threads.examples.core;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 10:57 AM
 */
public class ExampleOne {

    public static void main(String[] args)throws Exception {

//        Thread.sleep(5000);
        ExtendingThread thread=new ExtendingThread("Naresh");
//        thread.setPriority(8);
        thread.start();

//        Thread.sleep(5000);

        Thread thread1=new Thread(new ImplementingRunnable(),"Priya");
        thread1.start();

        Thread.currentThread().setName("Main Thread");
        System.out.println("Main Thread Priority = " + Thread.currentThread().getPriority());

        System.out.println("Thread Name : " + Thread.currentThread().getName());


    }
}
