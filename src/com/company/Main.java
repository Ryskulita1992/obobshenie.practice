package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Box<Double, Integer> box1 = new Box<>(8.5, 8);

        Box<Float, Float> box2 = new Box<>(8.5f, 8.9f);

        addition(box1);
        multiply(box2);
    }


    public static void addition(Box<?, ? extends Number> box) {
        System.out.println( box.getNumber1().doubleValue() +box.getNumber1().intValue()+ box.getNumber2().floatValue()+box.getNumber2().floatValue());
    }
    public static void multiply (Box <?,? extends Number> box){
        System.out.println( box.getNumber1().doubleValue() *box.getNumber1().intValue()* box.getNumber2().floatValue()*box.getNumber2().floatValue());
    }
}
