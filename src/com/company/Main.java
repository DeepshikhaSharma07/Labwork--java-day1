package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int ageLimit = 21;
        int age = Integer.parseInt(input.nextLine());
        if (age >= ageLimit) {
            System.out.println("Your age is " + age + " so you are old enough to drink");
        } else {
            System.out.println("You are too young to drink!");
        }
        int startingNumber = 0;
        while (startingNumber < 15) {
            System.out.println("This number is now " + startingNumber);
            startingNumber++;
        }

        System.out.println("Hello World");

        System.out.println("5*3");

        System.out.println(5*3);

        System.out.println(24*60*60);
        // printf() method allows formatting and printing values from expressions.
        System.out.printf("5*2=10").println();
        System.out.printf("5 * 2 = 10 %d", 5*2 ).println();// will print 10 twice
        System.out.printf( "5*2 = %d ", 5*2).println();// will print 10 once
        System.out.println(3*4); // method call. 3*4 is a parameter
        System.out.printf("%d %d %d", 5, 7, 5*7 ).println();
        System.out.printf("%d * %d = %d", 7, 7, 7*7 ).println();
        System.out.printf("%d + %d + %d = %d", 5, 6, 7,  5+6+7 ).println();
        // %d is for integers
        // %s is for strings
        // %f is for floating
        // In system.out parameter can be more than or equal to arguments but not vice a versa

// method_path(parameter)
        System.out.println("5 * 4 = 20");

// String Literal => "something between double quotes"


        int number = 10;


    }
}
