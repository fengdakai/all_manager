package com.fk.test;

/**
 * Created by kai on 2017/8/30.
 */
public class MyThread implements Runnable {
    private int ticket = 5; //票数5张
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0){
                System.out.println("ticket:" + ticket--);
            }
        }
    }
}
