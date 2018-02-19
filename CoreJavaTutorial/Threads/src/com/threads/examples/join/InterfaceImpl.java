package com.threads.examples.join;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 19/2/18 11:39 PM
 */
public class InterfaceImpl implements InterfaceA,InterfaceB{

    @Override
    public void run() {
        System.out.println("true = " + true);
    }
}
