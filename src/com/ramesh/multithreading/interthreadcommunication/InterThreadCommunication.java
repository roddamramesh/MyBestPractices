package com.ramesh.multithreading.interthreadcommunication;

import java.util.Scanner;
import java.lang.Thread;

/**
 * Created by RoddaR01 on 4/21/2017.
 */
public class InterThreadCommunication {

    public static void main(String args[]) throws InterruptedException {

        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }


 public static class PC{

    public void produce()throws InterruptedException{
        synchronized (this){
            System.out.println("Producer running the thread");
            wait();
            System.out.println("Resumed");
        }
    }

    public void consume() throws InterruptedException{
        Thread.sleep(1000);
        Scanner sc= new Scanner(System.in);
        synchronized (this){

            System.out.print("Waiting for returned key");
            sc.nextLine();
            System.out.print("return key pressed");
            notify();
            Thread.sleep(1000);

        }
    }
}


}
