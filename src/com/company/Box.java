package com.company;

import java.util.List;

public class Box <A extends Number, B extends Number> implements Unpackable {
    A Number1;
    B Number2;

    public Box(A number1, B number2) {
        Number1 = number1;
        Number2 = number2;
    }

    public A getNumber1() {
        return Number1;
    }

    public B getNumber2() {
        return Number2;
    }

    public void setNumber1(A number1) {
        Number1 = number1;
    }

    public void setNumber2(B number2) {
        Number2 = number2;
    }

    @Override
    public void unpack(Number number) {
        System.out.println("В коробке сумма  значений  " + getNumber1().doubleValue()+getNumber2().intValue());

    }
}



