package com.ramesh.multithreading.interthreadcommunication;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by RoddaR01 on 4/21/2017.
 */

public class PCProblem {

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

        LinkedList<Integer> lstOfIntegers= new LinkedList<Integer>();
        int capacity=2;


        public void produce()throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {

                    while (lstOfIntegers.size() == capacity)
                        wait();

                    System.out.println("Producer produced-"
                            + value);
                    lstOfIntegers.add(value++);

                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            Thread.sleep(1000);
            while (true) {
                synchronized (this) {

                    while (lstOfIntegers.size() == 0)
                        wait();
                    int val = lstOfIntegers.removeFirst();
                    System.out.println("consumer consumed - " + val);
                    notify();
                    Thread.sleep(1000);

                }
            }
        }
    }


}

