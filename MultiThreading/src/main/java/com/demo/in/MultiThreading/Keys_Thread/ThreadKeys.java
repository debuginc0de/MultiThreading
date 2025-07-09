package com.demo.in.MultiThreading.Keys_Thread;


//Sleep()------>Pauses the Thread But Doesn't release the monitor/lock
//Wait()------->Pauses the Thread, release the Lock Until Notify() is called
//notify()------>“notify() is used to wake up a thread that is in the waiting
//                state (wait()), so that it can resume execution.”
//join()-------->One Thread depends on the result of another Thread and must complete
//               the result


public class ThreadKeys {
    public static void main(String[] args) throws InterruptedException {
        Object lock =new Object();
        Thread t1=new Thread(()->{
            synchronized (lock){
                System.out.println("Thread 1 is waiting");
                try {
                    lock.wait();
                }
                catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }
        });
        Thread t2=new Thread(()->{
            synchronized (lock){
                System.out.println("Thread 2 is notifying");lock.notify();

                try {
                    lock.wait();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        Thread.sleep(4000);
        t2.start();


    }

}
