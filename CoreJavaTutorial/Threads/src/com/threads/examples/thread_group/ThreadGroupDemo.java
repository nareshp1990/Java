package com.threads.examples.thread_group;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 18/2/18 11:49 AM
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {

        ThreadGroup parent = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t=new Thread[parent.activeCount()];
        parent.enumerate(t);
        for (Thread t1:t){
            System.out.println(t1.getName() + " : " + t1.isDaemon() );
        }

    }

}
