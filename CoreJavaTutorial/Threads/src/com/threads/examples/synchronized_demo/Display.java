package com.threads.examples.synchronized_demo;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 5:30 PM
 */
public class Display {

    public synchronized void wish(String name){
        for (int i=0;i<5;i++){
            System.out.print("Good Morning : ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
