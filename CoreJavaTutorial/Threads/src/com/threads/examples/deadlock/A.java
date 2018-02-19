package com.threads.examples.deadlock;

import com.threads.examples.inter_thread.ThreadB;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 18/2/18 9:48 AM
 */
public class A {

    public synchronized void m1(B b){
        System.out.println(Thread.currentThread().getName() + " acquired lock m1()");
        try
        {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to call b's last method");
        b.last();
    }

    public synchronized void last(){
        System.out.println(Thread.currentThread().getName() + " acquired lock last()");
    }

}
