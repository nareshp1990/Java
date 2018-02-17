package com.threads.examples.join;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 12:37 PM
 */
public class ChildThread extends Thread {

    private Thread mainThread;

    public ChildThread(Thread mainThread) {
        this.mainThread = mainThread;
    }

    @Override
    public void run() {

        System.out.println("Child thread got a chance to execute");

//        try {
//            System.out.println("Child thread waiting for main thread to complete");
//            mainThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted " + e);
            e.printStackTrace();
        }

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("### Thread Interrupted ###");
            ex.printStackTrace();
        }
    }
}
