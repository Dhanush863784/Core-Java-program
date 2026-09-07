package com.tnsif.collectiomframework;



import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> javateam = new HashSet<String>();

        javateam.add("java");
        javateam.add("react");
        javateam.add("html");
        javateam.add("web");

        System.out.println("Java Team : " + javateam);

        HashSet<String> pythonteam = new HashSet<String>();

        pythonteam.add("python");
        pythonteam.add("react");
        pythonteam.add("advance python");

        System.out.println("Python Team : " + pythonteam);

        // Create the copy of the javateam
        HashSet<String> onlyJava = (HashSet<String>) javateam.clone();
        System.out.println(onlyJava);

        // keep only skills available in both
        HashSet<String> common = new HashSet<String>();

        System.out.println(common);
    }
}