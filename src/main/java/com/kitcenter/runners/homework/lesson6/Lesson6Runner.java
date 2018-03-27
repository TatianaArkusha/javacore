package com.kitcenter.runners.homework.lesson6;

import com.kitcenter.runners.classwork.lesson6.Lesson6;

public class Lesson6Runner {
    public static void main(String[] args) {
        Lesson6 lesson6 = new Lesson6();
        lesson6.name = "Tatiana";

        Lesson6 lesson61 = new Lesson6();

        lesson61.name = "Alona";

        System.out.println(lesson6.name);
        System.out.println(lesson61.name);

        System.out.println(lesson6.age);
        System.out.println(lesson61.age);

        System.out.println(Lesson6.age);
        Lesson6.hello();
    }
}
