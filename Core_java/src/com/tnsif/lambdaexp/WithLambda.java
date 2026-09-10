package com.tnsif.lambdaexp;

@FunctionalInterface
interface draw {
    public void draw();
}

public class WithLambda {
    public static void main(String[] args) {
        int width = 90;

        draw d2 = () -> {
        (System.out.println("draw: " + width));
        };
        d2.draw();
    }
}