package com.threads.examples.yield;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 12:05 PM
 */
public class YieldThread extends Thread{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
//            Thread.yield();
            System.out.println("Child Thread - " + i);
        }
    }

}
