package com.threads.examples.synchronized_demo;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 5:33 PM
 */
public class SynchDemo {

    public static void main(String[] args) {
        Display display=new Display();

        SynchThread t1=new SynchThread(display,"Naresh");
        t1.start();
        SynchThread t2=new SynchThread(display,"Kumar");
        t2.start();
    }

}
