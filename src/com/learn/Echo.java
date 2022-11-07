package com.learn;

import java.util.Scanner;

public class Echo
{
    public static void main (String[] args)
    {
        String inData;
        Scanner scan = new Scanner( System.in );

        inData = scan.nextLine();

        String[] outData = inData.split(" ");

        for (String s : outData) {
            System.out.println(s);
        }
    }
}