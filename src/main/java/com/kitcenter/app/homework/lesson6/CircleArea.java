package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class CircleArea{
    public static final double PI = 3.14d;

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        /*System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();*/

        double circleArea = PI*radius*radius;
        System.out.println("Area is "+ circleArea);
    }
}
