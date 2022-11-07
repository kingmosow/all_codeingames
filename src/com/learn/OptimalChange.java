package com.learn;

class Change{
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
}
public class OptimalChange {


     static Change optimalChange(long s) {
        long change = s;
        Change c = new Change();
        //大于5的基数；
         if (s==1 ||s==3)
             return null;
        if (change >= 5  &&  change % 2 == 1) {
            c.bill5 = 1;
            change -= 5;
        }
        c.bill10 = change / 10;
        change = change % 10;
        c.coin2 = change / 2;
        return c;
    }

    public static void main(String[] args) {
        long s=10L;

        OptimalChange op = new OptimalChange();
        Change c = op.optimalChange(s);
        System.out.println(c);

    }
}
