package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<String>(Arrays.asList("s", "a", "m", "u", "r", "a", "i"));
        List<String> listB = new ArrayList<String>(Arrays.asList("e", "n", "g", "i", "n", "e", "e", "r"));
        List<String> listC = new ArrayList<String>();

        for(String a : listA) {
            if(listB.contains(a)) {
                listC.add(a);
            }
        }

        System.out.println("ListC = " + listC);
    }

}