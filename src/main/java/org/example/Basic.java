package org.example;

import java.util.Arrays;

public class Basic {


    private static String shilpa = "shilpashree";
    public static String getSorted(){
        char[] c1 = shilpa.toCharArray();
       Arrays.sort(c1);
        System.out.println(c1);
        return new String(c1);
    }

    public static  void main(String[] args) {
        System.out.println("Program Start!");
        getSorted();
//
//        Integer a = 300;
//        Integer b = 300;
//        System.out.println(a == b);// Assert Object
//        System.out.println(a.equals(b)); // Assert Value
//
//        System.out.println(a + (b));
//        a = -100;
//        b = -100;
//        System.out.println(a == b);
//
//        System.out.println("" + a + b); // Converts both to String and concatenates
//
//        // Another way using String.format
//        System.out.println(String.format("%d%d", a, b));



    }




}