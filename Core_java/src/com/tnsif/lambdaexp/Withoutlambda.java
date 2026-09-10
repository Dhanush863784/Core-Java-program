package com.tnsif.lambdaexp;

// demo for without lambda

@FunctionalInterface
interface Drawable {
    public void draw();
}

class Test implements Drawable {
    int width = 20;

    @Override
    public void draw() {
        System.out.println("drawing :" + width);
    }
}

public class Withoutlambda {
    public static void main(String[] args) {
        Drawable d = new Test();
        d.draw();
    }
}