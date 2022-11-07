package com.learn;

public interface MyInterfaceFonctionnel {
    public void show();
    public void tshow();
    public default int addition(int a, int b) {
        return a + b;
    }
    public static int soustraction(int a, int b) {
        return a - b;
    }
}