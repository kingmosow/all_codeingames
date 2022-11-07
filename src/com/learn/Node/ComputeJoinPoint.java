package com.learn.Node;

public class ComputeJoinPoint {
    public static int computeJoinPoint(int s1,int s2) {
        while(s1!=s2) {

            if(s1<s2) {
                s1=foundNext(s1);
            }else {
                s2=foundNext(s2);
            }
        }

        return s1;
    }

    static int foundNext(int s1) {

        int next=0;
        int s = s1;
        while(s>0) {
            next = next + s%10;
            s=s/10;
        }
        return next + s1;
    }
}
