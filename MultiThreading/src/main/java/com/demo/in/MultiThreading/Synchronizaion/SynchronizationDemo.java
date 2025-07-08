package com.demo.in.MultiThreading.Synchronizaion;

//"In multithreading, synchronization ensures thread safety by allowing"
//only one thread to access shared data at a time."

//"Synchronization prevents two or more threads from executing a critical
// section of code simultaneously."

//Synchronization Block is used to "Synchronized block locks only
// the critical section of code, which improves
// performance and avoids unnecessary locking."

class count{
    int count=0;

    void increment(){
        count++;
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException{
        count c=new count();
        Thread t1=new Thread(()->{
            for (int i=0;i<1000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for (int i=0;i<1000;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("count: "+c.count);
    }
}
