package com.kitcenter.app.homework.lesson6;

import java.util.Scanner;

public class BiggerNumber {
    /*double a = 5;
    double b = 8;
    double c;
*/
    public void biggerNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a");
        double a = scanner.nextDouble();
        System.out.println("Please enter b");
        double b = scanner.nextDouble();
        double c = Math.max(a, b);
        System.out.println("The bigger number is "+c);
    }
}
