package com.training.playground.probleme;

/**
 * Created by H153466 on 3/21/2017.
 */
public class Prim {
//    public static void main(String[] args) {
//        int n=33;
//        int x=2;
//        boolean estePrim=true;
//        int y =0;
//
//        while( x<n/2){
//            int rest=n%x;
//            if(rest==0){
//                estePrim=false;
//                if( y==0){
//                   y=x;
//                }
//
//            }
//            x++;
//
//        }
//        System.out.println( y);
//        System.out.println(estePrim);


//sa se tiparesca numere prime ale unui array
public static void main(String[] args) {

    int[] a = {3, 7, 15};
    int i = 0;
    int x = 2;
    int y = 0;
    boolean prim = true;

    while (i < a.length) {
        int rest = a[i] % a[x];
        if (rest == 0) {
            prim = false;
            if (y == 0) {
                y =a[x];
            }
        }
        i++;


    }
    System.out.println(y);
    System.out.println(prim);



    }
}
