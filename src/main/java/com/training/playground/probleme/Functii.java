package com.training.playground.probleme;

/**
 * Created by H153466 on 2/16/2017.
 */
public class Functii {
    public static void main(String[] args) {
//        int x = 5;
        int f = 0;
//        f = f + x * x;
//        f = f + 2;
//        System.out.println( "f(" + x + ")=" + f);
//--------------------------------------------------------

//        int y = 5;
//        if (y < 4 ){
//            f = 3 * y + 5;
//        } else {
//            f = 2 * y;
//        }
//        System.out.println( f );
//
 //-----------------------
        int z = 0;
        if (z < 4 ){
            f = 9 * z -2;
        }else {
            if (z < 10){
                f= z*( z +1 );
            }else {
                f= 6 * z ;
            }

        }
        System.out.println( f );
    }

}
