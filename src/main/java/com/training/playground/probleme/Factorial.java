package com.training.playground.probleme;

/**
 * Created by H153466 on 3/29/2017.
 */
public class Factorial {

    public static void main(String[] args) {
//        n factorial calc
//        int n =4;
//        int produs =1;
//        int x =1;
//
//        while( x<= n){
//            produs=x*produs;
//            x++;
//        }
//        System.out.println(produs);
        System.out.println( factorial(4));





    }
    public  static int factorial( int n ){
        if( n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
