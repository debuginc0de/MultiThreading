package com.demo.in.MultiThreading.Lock_Thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteLock{
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int data=0;
     public void ReadData(){
         lock.readLock().lock();
         try {
             System.out.println("reading data lock: "+data);
         }
         finally {
             lock.readLock().unlock();
         }
     }
     public void writeLock(int value){
         lock.writeLock().lock();
         try{
             data=value;
             System.out.println("Writing data:"+data);
         }
         finally {
             lock.writeLock().unlock();
         }
     }
}
public class StudentRecords {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteLock rw=new ReadWriteLock();

        Thread t1=new Thread(()->rw.ReadData());
        Thread t2=new Thread(()->rw.writeLock(100));

        t1.start();
        t1.join();
        t2.start();



    }
}
