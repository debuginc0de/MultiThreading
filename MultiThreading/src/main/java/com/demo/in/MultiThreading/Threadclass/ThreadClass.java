package com.demo.in.MultiThreading.Threadclass;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread class:" + i);
        }
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread{
    public void show(){
        for (int i=0;i<=10;i++){
            System.out.println("Thread Class:"+i);
        }
        try {
            Thread.sleep(10000);
        }
        catch (Exception e){

        }

    }

}
class ThreadClass{
    public static void main(String[] args) {
        MyThread obj1=new MyThread();
        MyThread2 obj2=new MyThread2();

        obj1.start();
        obj2.start();
        //obj1.show();
        obj2.show();
    }

}
