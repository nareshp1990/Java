package com.threads.examples.deadlock;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 18/2/18 9:51 AM
 */
public class B {

    public synchronized void m1(A a) {
        System.out.println(Thread.currentThread().getName() + " acquired lock m1()");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " trying to call a's last method");
        a.last();
    }

    public synchronized void last() {
        System.out.println(Thread.currentThread().getName() + " acquired lock last()");
    }

}
