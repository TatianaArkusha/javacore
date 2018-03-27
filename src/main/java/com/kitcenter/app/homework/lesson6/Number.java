package com.kitcenter.app.homework.lesson6;

public class Number {
   public void numberEvenOdd(){
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("The number is even " + i);
            } else {
                System.out.println("The number is odd " + i);
            }
        }
    }
}
