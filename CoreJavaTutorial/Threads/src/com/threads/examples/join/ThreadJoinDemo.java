package com.threads.examples.join;

/**
 * @author Naresh Patchipulusu (GSIHYD-1298)
 *
 * Implemented On: 17/2/18 12:38 PM
 */
public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        /*ChildThread thread=new ChildThread(Thread.currentThread());
        thread.start();
        thread.interrupt();
        thread.join();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread - " + i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }*/
//         Thread.currentThread().join();

        InterfaceImpl interfaceA=new InterfaceImpl();
         interfaceA.run();
    }

}
