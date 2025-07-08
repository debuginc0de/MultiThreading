package com.demo.in.MultiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool_demo implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println("Hello "+i);
            try {
                Thread.sleep(5000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public class App{
        public static void main(String[] args) {
            Thread t1=new Thread(new Threadpool_demo());
            Thread t2=new Thread(new Threadpool_demo());

            t1.start();
            t2.start();
        }
    }
}
