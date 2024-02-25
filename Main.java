package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        List<String> rice = new ArrayList<String>(Arrays.asList("てつや","さちこ","しょうこ","たろう","まや"));
        List<String> bread = new ArrayList<String>(Arrays.asList("ともこ","さなえ","とおる","さちこ","きょうこ","れん"));
        List<String> both = new ArrayList<String>();

        for(String r : rice){
            if(bread.contains(r)){
                both.add(r);
            }
        }

        System.out.println("both="+both);
    }
}