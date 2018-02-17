package com.threads.examples.yield;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 12:07 PM
 */
public class YieldThreadDemo {

    public static void main(String[] args) {

        YieldThread yieldThread=new YieldThread();
        yieldThread.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread - " + i);
        }

    }

}
