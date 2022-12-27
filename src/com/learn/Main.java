package com.learn;

import javax.xml.crypto.Data;
import java.io.InputStream;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

public class Main {

    //https://github.com/JosefNafaa/CodingGameJavaExos/tree/master/src
    //https://github.com/Alik64/Revision/blob/dbccb0f266a962302a3b2eba9f32a4fd96341b24/CG/_cg/tennis/tennis.js

    static Boolean a(int i, int j){
        return i + j == 1 || i == 1 || j == 1;
    }

    public static void main(String[] args) {

        jsonage();
//        filtrer tab de string
//      Collections.sort(list2);
//      String maxlist = Collections.max(list2);
        int []clo = new int[0];
        closestToZero(clo);
        int [] pair = new int []{15,1,6,25,23,24,1,2,8,20,3,5,1,7};
        int [] pair2 = new int [5086];
        for (int i = 5085; i > 0; i--) {
            pair2[i]= ThreadLocalRandom.current().nextInt(-500, 452 + 1);
        }
        pair2[0]=35;

        findSumPair(pair2,31);
        int [] ardup = new int []{7,6,4,3,3,4,8,14,3,34,64,51,31,9};
        filterDuplicates(ardup);

        String [] lostword =new String[]{"thea", "dog", "geot",
                "tahe", "bone"};

//        filterWordsp(lostword,"ae");
        String [] foundword = filterWords(lostword,"ae");


        findLargest(null);

        System.out.println("exist : "+exists(pair2,401));
        System.out.println("exist3 : "+exists3(pair2,401));


        count(10000);

        Format(2,"je suis   king from world");

        String ab= "Marion";
        String bc= "Romain";

        Verify(ab,bc);

        String str1="";
        String str2="   ";
        String str3="hello world.";

        if(str3.trim().isEmpty()){
            System.out.println("True");
        }

//        int tab [] = new int[]{4,5,68,3,68,6,3};
//        int seq [] = new int[]{3,68,6};

        String[] stocks = new String[]{"AMZN","CACC","EQIX","GOOG","ORLY","ULTA"};
        double[] [] prices  = {
                {11.53, 5.7,  10.42, 11.88, 11.77, 10.21},
                {1.53,  12,   3.42,  5.88, 11.4,  6.21},
                {8.53,  6,    10.6,  11.8,  11.8,  5.21},
                {4.53,  5.67, 4.42,  31.88, 3.77,  3.21},
                {3,     2.67, 5.42,  1,     84.77, 4.21},
                {2,     1.67, 1.42,  11.01, 11.1,  32.21}
        };
        //"AMZN","CACC","EQIX"

        getTopStock(stocks,prices);

        encode("aaaabcccaaa");

        List<Integer> tab = Arrays.asList(4,5,68,3,5,68,4,3);
        List<Integer> seq = Arrays.asList(5,68,4);

        isFound(tab,seq);

//        isDuoDigit(100);
//        isDuoDigit(42);
        isDuoDigit(402);
        isDuoDigit(34);
        isDuoDigit(340);

        /* Stream map(Function mapper) renvoie un flux constitué des résultats de
    l’application de la fonction donnée aux éléments de ce flux. */

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);

        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Sring
//        List<String> list2 = Arrays.asList("the", "dog", "got", "the", "bone");
        String [] listsend =new String[]{"the", "dog", "got",
                "the", "bone"};

        int[] liste = countFrequencies(listsend);


        //value without duplicates
        List<String> listesansdoublons= Arrays.stream(listsend).distinct().collect(Collectors.toList());

        List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                "Computerr", "Science", "gfg");

        System.out.println("reduce : "+list2.stream().reduce((s1,s2)->s1.length()>s2.length() ?s1:s2));
        list2.stream().reduce((s1,s2)->s1.length()>s2.length() ?s1:s2);

        // Using Stream map(Function mapper) to
        // convert the Strings in stream to
        // UpperCase form
        List<String> answer = list2.stream().map(String::toUpperCase).
                collect(Collectors.toList());

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);

        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Strings
        List<String> list3 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                "Computer", "Science", "gfg");

        // Using Stream map(Function mapper) and
        // displaying the length of each String
        list3.stream().map(str -> str.length()).forEach(System.out::println);
        //list3.stream().map(String::length).forEach(System.out::println);

        // sommer le tab compris [n1,n2]
        int [] array = new int []{1,2,3,4,5,3};
        int sortie =calc(array,0,1);
        int sortie1 =calc(array,0,5);
        int sortie2 =calc(array,0,0);
        int sortie3 =calc(array,0,6);

        int msum= compteMultipleSum(15);

        //verifier si un des param=1 ou sum=1
        Boolean trd= a(0,1);
        Boolean trd1= a(0,1);
        Boolean tdr2= a(4,-3);
        Boolean tdr3= a(1,1);
        Boolean tdr4= a(4,3);


        // Creating a list of Integers
        List<Integer> list4 = Arrays.asList(0, 2, 4, 6, 8, 10);

        // Using peek without any terminal
        // operation does nothing
        list4.stream().peek(System.out::println);
        // write your code here
        System.out.println("Iteration de 1 a 500 (boucle de 1 a 500)");

        Stream.iterate(1,n->n+1).limit(500).forEach(System.out::println);
        Stream.iterate(1,n->n+1).limit(500).forEach(System.out::println);

        System.out.println("range entre 25 et 125 ouvert (intervalle entre 25 et 125)");

        IntStream.rangeClosed(25,125).forEach(System.out::println);
//        System.out.println("Comparaison contenu");
//        list4.stream().filter(n->n!=2).forEach(System.out::println);
        System.out.println("filtrer contenu");
        list4.stream().filter(n->n!=2).forEach(System.out::println);

        // Creating a list of Integers
        List<Integer> list6 = Arrays.asList(3, 4, 6, 12, 20);

        System.out.println("verifier si ts les elements repondent a une contraite (divisible...)");
        // Check if all elements of stream
        // are divisible by 3 or not using
        // Stream allMatch(Predicate predicate)
        boolean answere = list6.stream().allMatch(n-> n % 3 ==0);
        System.out.println("answere = "+answere);
        System.out.println(list6.stream().anyMatch(s->s==12));


        System.out.println("*********fonction anonyme**********");
        list4.forEach((b)->hello(b));


        String [] t = new  String[] {"f","o","o","b","a","r"};

        System.out.println(concat(t));

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("first","Moussa");
        hashMap.put("deux","Papa");

        hashMap.forEach((s, s2) -> System.out.println("Hashmap "+ s+" "+s2));

        HashSet<String> hashSet = new HashSet<>();
        //les doublons dans les set sont ignorés automatikement
        hashSet.add("firts");
        hashSet.add("firts");
        hashSet.add("first");

        int i=5;
        int i1=2;
        int i3=i/i1;
        System.out.println(i3);
        ArrayList<String>  al=new ArrayList<>(2);
        al.add("e");
        al.add("p");
        al.add("r");
        al.forEach(System.out::println);

        Boolean is =isFoo("foo");
        is =isFoo(null);
        is =isFoo("hgg");

        hashSet.forEach((s) -> System.out.println("HashSet "+ s));
    }

    public static void jsonage (){

        int ar =145263;
        List<Integer> integers = Arrays.asList(ar);
        System.setProperty("http.agent", "Chrome");
    try {
        URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
        try {
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            System.out.println(inputStream);

            /*int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print((char)content);
            }*/
            String value = "{data: key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47, key=0Sr4C, age=68}";
            String value2 =value.substring(6,value.length()-1);

            String[] keyages = value2.split(",");
            ArrayList<Integer> agelist = new ArrayList<>();



            //Map<String, Integer> myMap = new HashMap<String, Integer>();
            for (int i=0;i<keyages.length;i++) {
                String keyage = keyages[i];
                String[] keyValue = keyage.split("=");
                if(keyValue[0].equals(" age"))
                    agelist.add(Integer.valueOf(keyValue[1]));
            }

            long nb = agelist.stream().filter(i->i>=50).count();
            System.out.println("hey");

            /*String json = inputStream;  // sample json string
            Pattern codePattern = Pattern.compile("\"code\"\\s*:\\s*\"([^,]*)\",");
            Pattern messagePattern = Pattern.compile("\"message\"\\s*:\\s*\"([^,]*)\",");
            Pattern statusPattern = Pattern.compile("\"status\"\\s*:\\s*\"(FAILURE)\"");

            Matcher code_matcher = codePattern.matcher(json);
            Matcher message_matcher = messagePattern.matcher(json);
            Matcher status_matcher = statusPattern.matcher(json);

            if (code_matcher.find() && message_matcher.find() && status_matcher.find()) {

                System.out.println("\nException found!");

                System.out.println("\n" + code_matcher.group(1));
                System.out.println("\n" + message_matcher.group(1));
                System.out.println("\n" + status_matcher.group(1));
            }*/
        } catch (IOException ioEx) {
            System.out.println(ioEx);
        }
    } catch (MalformedURLException malEx) {
        System.out.println(malEx);
    }
}
    static void hello(Integer a){
        System.out.println("Hello "+a);
    }

    public static String encode(String input) {
        StringBuilder output = new StringBuilder();
        String[] cArray = input.replaceAll("(\\w)(?!\\1)", "$1 ").split(" ");
        for (String s : cArray) {
            output.append(s.length()).append(s.substring(0, 1));
        }
        return output.toString();
    }

    /*public static String encode(String input) {
        return Arrays.stream(
                input.replaceAll("(\\w)(?!\\1)", "$1 ").split(" ")
        )
                .map(s -> s.length() + s.substring(0, 1))
                .collect(Collectors.joining());
    }*/
    // creer un string foobar
    static String concat(String[] a){
        if (a ==null)
            return null;

        return String.join("", a);
    }
    static Boolean isFoo(String a){
        if (a==null)
            return false;

        return a.contentEquals("foo");
    }

    // sommer le tab compris [n1,n2]
    static int calc(int [] arr,int n1, int n2){
        int sorti=0;
        for (int i=0;i<arr.length;i++) {
            if ((arr[i] <= n1 || arr[i] <= n2) && i<n2)
                sorti = sorti+ arr[i];
        }

        //ou
        /*int sorti=0;

        for (int i=0;i<array.length;i++) {
            if ((i <= n1) || (i <= n2) )
                sorti = sorti+ array[i];
        }
        return sorti;*/

//        //ou
//        for (int i=0;i<arr.length;i++) {
//            if ((i <= n1 || i <= n2) )
//                sorti = sorti+ i;
//        }

        return sorti;
    }
    //tournoi echec nombre de paires disponibles
    static int count(int n) {


        int sorti=0;

        sorti= n*(n-1)/2;

        return  sorti;
    }
    // sommer les nombre d'element et ordonner
    static int[] countFrequencies(String[] listsend) {

        // recuperer les elements + le nombre de chacune dans un map
        Map<String, Long> eltnombre  = //list2.stream().sorted(Comparator.reverseOrder()).collect(
                Arrays.stream(listsend).collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));
        // utiliser un treeMap pour ordonner les elts
        TreeMap<String, Long> sorted = new TreeMap<>(eltnombre);

        int[] arr = new int[sorted.size()];

        // copier seulement les nombres d'elements obtenus
        int i=0;
        for(Map.Entry<String,Long> entry : sorted.entrySet()) {
            arr[i] = Math.toIntExact(entry.getValue());
            i++;
        }

        return arr;
    }
    static int compteMultipleSum( int n2){

        return range(0,n2).filter(x -> (x % 3 == 0 || x%5 ==0|| x%7==0)).sum();
    }
    static String isDuoDigit( int num){

        String kt = String.valueOf(Math.abs(num));
        Set<String> mySet= new HashSet<>(Arrays.asList(kt.split("")));

//        //return mySet.size()<=2;
        if(mySet.size()<=2){
            return "y";
        }else{
            return "n";
        }


//        return mySet.size()<=2;
    }

    static String[] getTopStock(String[] stocks, double[][] prices){
        Map<String,Double> moyMap= new HashMap<String,Double>();
        double moyene=0;

        //la moyenne de chaq action avec un stream
//        double[] srt =  Arrays.stream(prices)
//                .flatMapToDouble(row-> DoubleStream.of((double) Arrays.stream(row).sum()))
//                .toArray();

        //la moyenne de chaq action
        for (int i = 0; i <prices.length; i++) {
            //moyene =prices[0][0];
            for (int j = 0; j <prices.length; j++) {
                moyene = moyene +prices[i][j];

            }
            moyMap.put(stocks[i],moyene);
            moyene=0;
        }
//
        List<String> tab = new ArrayList<String>();
//        String tabarr [] = new String [2];

        moyMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .limit(3)
                .forEach(x -> tab.add(x.getKey()));

        String[] tabarr = tab.stream().toArray(String[]::new);

        return tabarr;
    }

    //return the largest number of the given array
    static int findLargest(int [] numbers){
        if(numbers ==null)
            return 0;

        return Arrays.stream(numbers).max().orElse(0);

    }

    //return array without duplicates
    static int[] filterDuplicates(int [] data){

        int[] listesansdoublons;
        if(data==null)
            return data;

        //value without duplicates
        listesansdoublons= Arrays.stream(data).distinct().toArray();

        return listesansdoublons;

    }

    //chercher une valeur dans un tableau
    static boolean exists(int [] ints , int k){
        long startTime = System.nanoTime();

        if(ints==null)
            return false;


        Arrays.sort(ints);
        int res = Arrays.binarySearch(ints,k);

        long endTime = System.nanoTime();

        System.out.println("Execution time in milliseconds: " + (endTime - startTime) / 1000000);
        if (res > -1) {
            System.out.println("L'élément se trouve à l'index: " + res);
            return true;
        }
        else{
            System.out.println("L'élément n'existe pas!");
            return false;
        }
    }
    static boolean exists3(int [] ints , int k){
        long startTime = System.nanoTime();
        if(ints==null)
            return false;


        Arrays.sort(ints);
        boolean res = Arrays.stream(ints).parallel().anyMatch(s->s==k);
        //TimeUnit.SECONDS.sleep(5);
        long endTime = System.nanoTime();

        System.out.println("Execution time in milliseconds: " + (endTime - startTime) / 1000000);

        return res;
    }

    public static int calculateTotalPrice(int[] prices,int discount) {
        if(prices==null)
            return 0;
        int total=0;
        int len=prices.length;
        Arrays.sort(prices);
        for(int i=0;i<len-1;i++) {
            total=total+prices[i];
        }

        return (int)Math.floor(((float)total)+ (((float)prices[len-1])-(prices[len-1])*discount/100f));
    }

    public static String[] filterWords(String[] words, String letters)
    {

        List<String> goodWords = new ArrayList<>();
        List<String> lettertab = Arrays.asList(letters.split(""));

        for(String word :words)
        {
            for(String letter : lettertab)
            {
                if(word.contains(letter))
                {
                    goodWords.add(word);
                    break;
                }

            }
        }

        String[] foundword = goodWords.toArray(new String[0]);

        return foundword;
    }

    public static void filterWordsp(String[] words, String letters) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");4
        List<String> tab = new ArrayList();
//        String[] sorti =
        Arrays.stream(letters.split(""))
                .flatMap(t->Arrays.stream(words)
                        .filter(s->s.contains(t) ))
                .forEach(System.out::println);

        int i=2;
    }

    // retrouver une sequence de tab dans un tableau
    static boolean isFound( List<Integer> tab,List<Integer> seq){

//        List<Integer> listCommon = tab.stream()
//                .filter(e -> seq.contains(e))
//                .collect(Collectors.toList());

        boolean t=false;
        int ind=0;
        //tant que le tableau n'est pas vide bouclee
        while (ind<tab.size()){
            //si la 1ere valeur de notre sequence est dans le tableau
            if(seq.get(0).equals(tab.get(ind))) {
                //et que la taille de la sequence ne depasse pas le tableau
                if( tab.size()-ind >= seq.size()){
                    //on recupere les valeurs du tableau a partir de l'index de la 1ere valeur de la sequence
                    List<Integer> souslist= tab.subList(ind, ind+seq.size());
                    if((t= souslist.equals(seq)))
                        break;
                }
            }
            ind++;
        }

        return t;
    }

    //comparer si 2 string sont egaux
    public static boolean Verify(String worda, String wordb) {
        boolean t;


//        a="HEY";
//        b="HEY";
        List<String> wordalist= Arrays.asList(worda.toLowerCase().split(""));
        List<String> wordblist= Arrays.asList(wordb.toLowerCase().split(""));
        Collections.sort(wordalist);
        Collections.max(wordalist);
        Collections.sort(wordblist);

        t= wordalist.equals(wordblist);

//
//        char[] aca = a.toLowerCase().toCharArray();
//        char[] bca = b.toLowerCase().toCharArray();
//        Arrays.sort(aca);
//        Arrays.sort(bca);
//        System.out.println(new String(aca));
//        System.out.println(new String(bca));
//        t= new String(aca).equals(new String(bca));


        return t;

    }
    public static String Format(int n, String str) {
        String kt = str.replace(" ","");
        String[] kto =  kt.split("\\w");

        return str;
    }

    static void sommeTabByHorizontale(String[] stocks, double[][] prices){
        List moylist= new ArrayList();
        double moyene=0;
        for (int i = 0; i <prices.length; i++) {
            //moyene =prices[0][0];
            for (int j = 0; j <prices.length; j++) {
                moyene = moyene +prices[j][i];

            }
            moylist.add(moyene);
            moyene=0;
            int k=0;

        }
//
//
//        return new String[3];
    }

    public static int[] findSumPair(int[] numbers, int k) {
        //long startTime = System.nanoTime();

        int [] pairnum = new int[]{0,0};
        if (numbers.length==0 || numbers==null)
            return null;

        int[] intNumb = Arrays.stream(numbers).flatMap(i ->
                                Arrays.stream(numbers)
                                    .filter(s -> s + i == k  ))
                                .distinct().toArray();
        if(intNumb.length==0)
            return pairnum;

        int indexPair=-1;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]==intNumb[0]) {
                indexPair=i;
                break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(k-numbers[indexPair]==numbers[i]){
                pairnum[0]=i;
                pairnum[1]=indexPair;
                break;
            }
        }

        long endTime = System.nanoTime();

        //System.out.println("Execution time in milliseconds 2 : " + (endTime - startTime) / 1000000);

        int numbersn=2;


//        Arrays.stream(numbers)
        /*Map<String, Long> collect = Arrays.stream(numbers).mapToObj(m -> Integer.toString(m))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);*/

//        list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return pairnum;
    }
    public static int closestToZero(int[] ts) {
        if(ts==null)
            return 0;

        int tneg=0;
        for( int i=0; i<ts.length;i++){
            if(ts[i]<0)
                tneg++;
        }
        if(tneg==ts.length)
            return Arrays.stream(ts).max().orElse(0);

        return Arrays.stream(ts).map(m->Math.abs(m)).min().orElse(0);
    }

    static double approx(double[][] pts) {
        int count = 0;
        double pi = 0;
        for (int i = 0; i < pts.length; i++) {
            if (pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1] <= 1) {
                count++;
            }

        }
        pi = 4. * count / pts.length;
        return pi;
    }


}

