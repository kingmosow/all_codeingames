package com.learn.thread;

import static java.lang.Thread.sleep;

public class Counter {

    private static int count=0;

    public static int increment(){
        count=count+1;

        return count;
    }
    public static int runincrement() {
        count=count+1;

        return count;
    }

    public  static void main(String[] args) {
        int t =0;


        Runnable r = () ->{
                try {

                    for (int i = 0; i < 20; i++) {
                        System.out.println(i +" <- thread 1 -> "+increment());
                        sleep(1000);
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        };
        Runnable r2 = () ->{
                try {

                    for (int i = 0; i < 20; i++) {
                        System.out.println(i+" <- thread 2 -> "+increment());
                        sleep(1000);
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        };

        r.run();
        r2.run();


    }
}
