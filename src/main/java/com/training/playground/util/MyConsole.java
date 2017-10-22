package com.training.playground.util;

import java.util.Scanner;

/**
 * Created by raz on 10/21/2017.
 */
public class MyConsole {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your favorite color? ");
//        String name = scanner.next();
//        System.out.println("Your favorite color is: " + name);
        System.out.println( " Care este primul numar? ");
        int a = scanner.nextInt();
        System.out.println(" Care este al doi lea numar? ");
        int b =  scanner.nextInt();
        int c = a+b;
        System.out.println( a + " + " + b + "=" + c );
    }


}
