package com.training.playground.probleme;

/**
 * Created by H153466 on 2/20/2017.
 */
public class MinMax {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 70;
//        int c = 10;
//
//        if (a > b && a > c) {
//            System.out.println("a");
//        }
//        if ( b > c && b > a) {
//            System.out.println("b");
//        }
//        if (c > a && c > b){
//            System.out.println("c");
//        }
//-----------------------------------------

        int a = 5;
        int b = 80;
        int c = 10;
        int max = Integer.MIN_VALUE ;

        if (a > max){
            max = a ;
        }
        if (b > max ){
            max = b;
        }
        if (c > max ) {
            max = c;
        }
        System.out.println( max);
    }

}
