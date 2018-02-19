package com.threads.examples.deadlock;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 18/2/18 10:28 AM
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        ChildThread childThread=new ChildThread();
        childThread.m1();
    }

}
