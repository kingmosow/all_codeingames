package com.learn.lowestcost;

import java.util.Arrays;
import java.util.Scanner;

public class Echo {

    static void execute(){
        String inData;
        Scanner scan = new Scanner( System.in );

        //System.out.println("Enter the data:");
        inData = scan.nextLine();
        if(inData!=null)
            Arrays.stream(inData.split(" ")).forEach(System.out::println);

        //        Arrays.stream(inData.split(" ")).forEachOrdered(System.out::println);
    }

    public static void main (String[] args)
    {
        execute();
    }
}