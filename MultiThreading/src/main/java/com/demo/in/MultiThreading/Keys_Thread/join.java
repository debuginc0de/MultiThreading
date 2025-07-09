package com.demo.in.MultiThreading.Keys_Thread;

public class join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i=0;i<=3;i++){
                System.out.println("Thread Starting:"+i);
            }

        });
        Thread t2=new Thread(()->{
            for(int i=0;i<=4;i++){
                System.out.println("Thread 2 starting:"+i);
            }
        });
        t1.start();
        t1.join();
        System.out.println("Main Thread Resume after t1.");
        t2.start();
        t2.join();
    }

}
