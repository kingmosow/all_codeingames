package com.learn;

import java.util.Arrays;
import java.util.Scanner;

public class Echo
{
   /* static void execute(String a){
        String [] args=a.split(" ");

        for( String str : args ){
            System.out.println(str);
        }
    }*/
    public static void main(String[] args){
//        execute("hello you !");

        Arrays.stream(args).forEach(System.out::println);

    }

}