package com.fk.test;


/**
 * Created by kai on 2017/8/30.
 */
public class ThreadDemo {
    public static void main (String[] arr) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread1).start();
        new Thread(myThread2).start();
    }
}
