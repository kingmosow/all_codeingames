package com.learn.thread;

public class MainCounter extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        MainCounter thread = new MainCounter();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    @Override
    public void run() {
        amount++;

    }
}