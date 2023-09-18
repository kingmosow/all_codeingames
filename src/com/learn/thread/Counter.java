package com.learn.thread;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public  class Counter implements C,B {

    //bonne implementation pour le mettre thread safe
    private static int value = 0;

    public static synchronized int increment() {
        return value++;
    }

    @Override
    public void test() {

    }

    @Override
    public void manger() {
        C.super.manger();
        System.out.println("je ne mange pas");
    }

    public static void main(String[] args) {
        Counter co = new Counter();
        co.manger();

        BigInteger bg = new BigInteger("1");
        bg.add(new BigInteger("1"));
        System.out.println(bg);

        List<String> recipeForOne = new ArrayList<>();
        recipeForOne.add("456 oyters");
        recipeForOne.add("78 thons of chocolate");
        recipeForOne.add("99 elephants ");

        int nbPersons = 123;

        List<String> adjustedRecipe = adjustQuantities(recipeForOne, nbPersons);
        System.out.println("hey");


    }

    public static List<String> adjustQuantities(List<String> ingredients, int nbPersons) {
        List<String> adjustedIngredients = new ArrayList<>();

        for (String ingredient : ingredients) {
            String[] parts = ingredient.split(" ", 2);
            int quantity = Integer.parseInt(parts[0]) * nbPersons;
            adjustedIngredients.add(quantity + " " + parts[1]);
        }

        return adjustedIngredients;
    }

}
