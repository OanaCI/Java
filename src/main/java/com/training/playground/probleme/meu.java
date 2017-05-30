package com.training.playground.probleme;

/**
 * Created by H153466 on 3/25/2017.
 */
public class meu {
    public static void main(String[] args) {

//        int[] a = {2, 7, 15};
//        int i = 0;
//
//
//        while(i < a.length){
//            int x = 2;
//            boolean isPrim = true;
//            while( x < a[i] ){
//                if(a[i]%x==0){
//                    isPrim=false;
//                }
//                x++;
//            }
//            if (isPrim){
//                System.out.println(a[i]);
//            }
//            i++;
//        }

//        int n=131;
//
//        int x=n %10;
//        int y=n/10;
//        int f=y%10;
//        int z=n/100;
//        int s =x+f+z;
//        System.out.println(s);

        int x=5;
        int y=52;
        int s= y/x;

        if( y%x==0){
            System.out.println( s);
        }else{
            System.out.println(s + 1);
        }
    }
}
