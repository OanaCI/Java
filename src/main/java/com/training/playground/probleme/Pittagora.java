package com.training.playground.probleme;

/**
 * Created by H153466 on 2/17/2017.
 */
public class Pittagora {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 3;
        if (a *a + b*b == c*c || c*c +a*a ==b*b || c*c + b*b ==a*a ){
            System.out.println(" yes");
        }
        else {
            System.out.println("no");
        }
    }
}
