package com.kitcenter.app.homework.lesson6;


import java.util.Scanner;

public class SelectTheProgram {
    public void numberOfTheProgram() {

        Triangle triangle = new Triangle();
        CircleArea circleArea = new CircleArea();
        BiggerNumber biggerNumber = new BiggerNumber();
        Number number = new Number();

        Scanner scan = new Scanner(System.in);
        System.out.println("The Program 1: Triangle");
        System.out.println("The Program 2: Circle Arear");
        System.out.println("The Program 3: Bigger Number");
        System.out.println("The Program 4: Number is even or odd");
        System.out.println("Enter the number to choose the task for the application: from 1 to 4");
        int i = scan.nextInt();
        switch(i){
            case 1:
                triangle.calculate();
            break;
            case 2:
                circleArea.calculate();
            break;
            case 3:
                biggerNumber.biggerNumber();
            break;
            case 4:
                number.numberEvenOdd();
            break;
            default:
                System.out.println("ERROR: You didn't enter the number 1 or 2 or 3 or 4");
        }
    }
}
