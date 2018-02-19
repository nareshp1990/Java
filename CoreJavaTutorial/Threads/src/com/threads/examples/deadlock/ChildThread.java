package com.threads.examples.deadlock;

import com.threads.examples.inter_thread.ThreadB;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 18/2/18 9:52 AM
 */
public class ChildThread extends Thread{

    A a=new A();
    B b=new B();

    public void m1(){
        this.start();
        a.m1(b);
    }

    @Override
    public void run() {
        b.m1(a);
    }
}
