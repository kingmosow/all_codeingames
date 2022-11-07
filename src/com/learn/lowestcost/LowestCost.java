package com.learn.lowestcost;

import java.util.HashMap;
import java.util.Map;

public class LowestCost {
    public static String [] lowestCost(int[] blueCosts,int[] greenCosts, int[] redCosts){


        if(blueCosts.length==0 || greenCosts.length==0 || redCosts.length==0 )
            return null;
        if(blueCosts == null || greenCosts == null || redCosts == null )
            return null;
        if(blueCosts.length!=greenCosts.length || blueCosts.length!=redCosts.length || redCosts.length!=greenCosts.length )
            return null;

        int n=blueCosts.length;
        String[] minishirt = new String[n];;

        for (int i = 0; i < n; i++) {
            if((blueCosts[i] < greenCosts[i] && blueCosts[i] <redCosts[i]) || (blueCosts[i] < greenCosts[i] && blueCosts[i] ==redCosts[i]) ){
                minishirt[i]="b";
            }

            if((greenCosts[i] < blueCosts[i] && greenCosts[i] <redCosts[i]) || (greenCosts[i] <= blueCosts[i])){
                minishirt[i]="g";
            }
            if((redCosts[i] < blueCosts[i] && redCosts[i] <greenCosts[i] ) || (redCosts[i] < blueCosts[i] && redCosts[i] ==greenCosts[i] )){
                minishirt[i]="r";
            }

        }
        HashMap<String,Integer> map = new HashMap<>();

        map=chercherMmCouleur(map,minishirt);
        while (map.size()!=0){
            minishirt=changerCouleur(map,minishirt,blueCosts,greenCosts,redCosts);
            map=chercherMmCouleur(map,minishirt);
        }


        return minishirt;
    }
    public static HashMap<String, Integer> chercherMmCouleur(HashMap<String,Integer> map, String [] minishirt){
        boolean couleur=false;
        for (int i = 0; i < minishirt.length-1; i++) {
            if(minishirt[i].equals(minishirt[i + 1])){
                map.put(minishirt[i],i);
                couleur=true;
            }
        }
        //si le map n'a pas de nouvelle valeur alors vider le map
        if (!couleur)
            map.clear();
        return map;
    }
    public static String[] changerCouleur(HashMap<String,Integer> map, String[] minishirt, int[] blueCosts, int[] greenCosts, int[] redCosts){

        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getKey().equals("r")) {
                if (blueCosts[entry.getValue()] > greenCosts[entry.getValue()])
                    minishirt[entry.getValue()] = "g";
                else minishirt[entry.getValue()] = "b";
            }
            if (entry.getKey().equals("b")) {
                if (redCosts[entry.getValue()] > greenCosts[entry.getValue()])
                    minishirt[entry.getValue()] = "g";
                else minishirt[entry.getValue()] = "r";
            }
            if (entry.getKey().equals("g")) {
                if (blueCosts[entry.getValue()] > redCosts[entry.getValue()])
                    minishirt[entry.getValue()] = "r";
                else minishirt[entry.getValue()] = "b";
            }
        }

        return minishirt;
    }
    public static void main(String args[]){

        int[] blueCosts= new int[4];
        int[] greenCosts= new int[4];
        int[] redCosts= new int[4];

        blueCosts = new int[]{1, 1, 1};
        greenCosts= new int[]{3, 1, 7};
        redCosts  = new int[]{4, 6, 4};

        String[] list ;
        list= lowestCost(blueCosts,greenCosts,redCosts);

        blueCosts = new int[]{100, 1, 76, 14};
        greenCosts=new int[]{22,20,1,2};
        redCosts= new int[]{99,99,5,12};

        list= lowestCost(blueCosts,greenCosts,redCosts);
        blueCosts = new int[]{18, 12, 1, 9};
        greenCosts=new int[]{13,15,7,9};
        redCosts= new int[]{12,16,4,8};

        list = lowestCost(blueCosts,greenCosts,redCosts);


        for (String listfinal : list) {
            System.out.println(listfinal);
        }
    }
}
