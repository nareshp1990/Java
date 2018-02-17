package com.threads.examples.synchronized_demo;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 5:32 PM
 */
public class SynchThread extends Thread {

    private Display display;
    private String name;

    public SynchThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}
