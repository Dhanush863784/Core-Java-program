package com.tnsif.string;

// Demo for == operator
public class EqualOperator {

    public static void main(String[] args) {

        String s1 = "Dhanush";
        String s2 = "Dhanush";
        String s3 = new String("Dhanush");
        String s4 = "Naveen";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}