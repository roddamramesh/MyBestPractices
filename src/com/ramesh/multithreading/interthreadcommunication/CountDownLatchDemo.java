package com.ramesh.multithreading.interthreadcommunication;

import java.util.concurrent.CountDownLatch;

/**
 * Created by RoddaR01 on 4/24/2017.
 */
public class CountDownLatchDemo {

    public static void main(String args[])throws InterruptedException{

        CountDownLatch countDownLatch= new CountDownLatch(4);
        Worker thread1= new Worker("Worker-1",1000,countDownLatch);
        Worker thread2= new Worker("Worker-2",1000,countDownLatch);
        Worker thread3= new Worker("Worker-3",1000,countDownLatch);
        Worker thread4= new Worker("Worker-4",1000,countDownLatch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() +
                " has finished");

    }


    public static  class Worker extends Thread{

      private int delay;
      private CountDownLatch countDownLatch;

        public Worker(String name, int delay, java.util.concurrent.CountDownLatch countDownLatch){
            super(name);
            this.delay= delay;
            this.countDownLatch=countDownLatch;
        }

        @Override
        public void run(){
            try {
                Thread.sleep(delay);
                System.out.println(Thread.currentThread().getName()+ " finished");
                countDownLatch.countDown();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }


        }
    }
}
