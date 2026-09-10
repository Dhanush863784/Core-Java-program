package com.tnsif.lambdaexp;

@FunctionalInterface
interface Demo {
    String say(String message);
}

public class MultipleStatements {
    public static void main(String[] args) {

        Demo s = (message) -> {
            String str1 = "i would like to say ";
            String str2 = str1 + message;
            return str2;
        };

        System.out.println(s.say("time is precious..."));
    }
}