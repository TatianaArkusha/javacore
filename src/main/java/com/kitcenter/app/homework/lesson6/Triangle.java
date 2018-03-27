package com.kitcenter.app.homework.lesson6;

import java.lang.Math;

public class Triangle {
    double a = 3.42;
    double b = 5.12;
    double c = 7.8;

    public void calculate() {
        //public static double sqrt(double c);
        double c2 = Math.sqrt(a*a + b*b);
        if(c == c2){
            System.out.println("This is right-angled triangle. Hypotenuse c = "+c);
        } else {
            System.out.print("This is not right-angled triangle: a = "+ a);
            System.out.print(" b = "+ b);
            System.out.print(" c = "+ c);
        }
    }
}
