package com.kitcenter.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {
    char oneChar = 0;
    float oneFloat = 1212f;
    int oneInt = 2000;
    int twoInt = 0;
    char twoChar = '\u05D0';


    public void floatToChar(){
        oneChar = (char) oneFloat;
        System.out.println("Input float value is "+oneFloat+". Output char value is "+oneChar);
    }
    public void intToChar(){
        oneChar = (char) oneInt;
        System.out.println("Input int value is "+oneInt+". Output char value is "+oneChar);
    }
    public void charToInt(){
        twoInt = (int) twoChar;
        System.out.println("Input char value is "+twoChar+". Output int value is "+twoInt);
    }
}
