package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Box<Double, Integer> box1 = new Box<>(8.5, 8);

        Box<Float, Float> box2 = new Box<>(8.5f, 8.9f);


        addition(box1 , box2);
        multiply(box1, box2);
//        Box box=new Box();
//        box.unpack();
    }


    public static void addition(Box<Double, Integer> box1, Box<?, ? extends Number> box) {
        System.out.println( "сумма сложения равна - "  +box.getNumber1().doubleValue() +box.getNumber1().intValue()+ box.getNumber2().floatValue()+box.getNumber2().floatValue());

    }
    public static void multiply(Box<Double, Integer> box1, Box<?, ? extends Number> box){
        System.out.println( "сумма умножения равна - " + box.getNumber1().doubleValue() *box.getNumber1().intValue()* box.getNumber2().floatValue()*box.getNumber2().floatValue());
    }
}
