package com.learn.solve;

import java.util.Arrays;

public class Player {

    public static int solve(int weight0,int weight1,int weight2) {


        if(weight0 == 0 || weight1  == 0 || weight2 ==0 )
            return 0;

        int [] tab = new int [3];
        tab[0]=weight0;
        tab[1]=weight1;
        tab[2]=weight2;
        int ind=-1;
        int sr = Arrays.stream(tab).max().orElse(0);

        System.err.println("tab : "+tab[0]+ " "+tab[1]+ "  "+tab[2]+ ":max :"+sr);

        for (int i = 0; i < tab.length; i++) {
            if(tab[i]==sr){
                ind=i;
                System.err.println(ind);
                break;
            }
        }
        return ind;
    }

    public static String solve(int width,int height, int length,int mass) {

        int volume=width*height*length;
        boolean bovolume = width >= 150 || height >= 150 || length >= 150;
        if((volume>=1_000_000  || bovolume) && mass>=20)
            return "REJECTED";
        else
            if(volume>=1_000_000 || bovolume || mass>=20)
                return "SPECIAL";
            else
                return "STANDARD";
    }
}
