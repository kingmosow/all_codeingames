package com.learn.stringManip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PermutationSteps {

    public static int PermutationStep(int num) {
        // code goes here
        String numStr = String.valueOf(num);
        List<Integer> perms = getPermutations("",numStr, new ArrayList<Integer>());

        Collections.sort(perms);

        int numIndex = perms.indexOf(num);

        if(numIndex == perms.size() -1){
            return -1;
        }

        for (int i =numIndex;i<perms.size();i++){
            if(perms.get(i) != num){
                return perms.get(i);
            }
        }
        return -1;
    }
    static List<Integer> getPermutations (String begStr , String endStr, List<Integer> perms){
        if(endStr.length() <= 1){
            perms.add(Integer.parseInt(begStr+endStr));
        }else {
            for (int i =0; i< endStr.length();i++){
                String newString = endStr.substring(0,i) + endStr.substring(i+1);
                getPermutations(begStr + endStr.charAt(i), newString , perms);
            }
        }
        return perms;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PermutationStep(s.nextInt()));
    }
}