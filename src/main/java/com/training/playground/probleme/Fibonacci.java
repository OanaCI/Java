package com.training.playground.probleme;

/**
 * Created by H153466 on 3/29/2017.
 */
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fib( 5));
    }

    public static int  fib (int n){
        if ( n<=2 && n>=1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }

    }



}
