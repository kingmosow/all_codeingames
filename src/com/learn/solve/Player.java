package com.learn.solve;

import java.util.*;

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

    public static int[] solve(int imageWidth, int imageHeight, String[] image, int patternWidth, int patternHeight, String[] pattern) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        int[] result = new int[2];
        for (int i = 0; i < imageHeight; i++) {
            for (int j = 0; j < imageWidth; j++) {
                if (image[i].charAt(j) == pattern[0].charAt(0)) {
                    if (patternHeight == 1 && patternWidth == 1) {
                        result[0] = j;
                        result[1] = i;
                        return result;
                    }
                    if (patternHeight == 1) {
                        if (image[i].substring(i, j + patternWidth).equals(pattern[0])) {
                            result[0] = j;
                            result[1] = i;
                            return result;
                        }
                    }
                    if (patternWidth == 1) {
                        String[] subImage = new String[patternHeight];
                        for (int k = 0; k < patternHeight; k++) {
                            subImage[k] = image[i + k].substring(j, j + 1);
                        }
                        if (Arrays.equals(subImage, pattern)) {
                            result[0] = j;
                            result[1] = i;
                            return result;
                        }
                    }
                    if (patternHeight > 1 && patternWidth > 1) {
                        if (i + patternHeight <= imageHeight && j + patternWidth <= imageWidth) {
                            String[] subImage = new String[patternHeight];
                            for (int k = 0; k < patternHeight; k++) {
                                subImage[k] = image[i + k].substring(j, j + patternWidth);
                            }
                            if (Arrays.equals(subImage, pattern)) {
                                result[0] = j;
                                result[1] = i;
                                return result;
                            }
                        }
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
    /*public static int solve(int weight0, int weight1, int weight2) {
        Map<Integer,Integer> weights = new HashMap<>();
        weights.put(0,weight0);
        weights.put(1,weight1);
        weights.put(2,weight2);
        return Collections.max(weights.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }*/
}
