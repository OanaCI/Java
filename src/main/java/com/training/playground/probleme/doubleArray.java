package com.training.playground.probleme;

/**
 * Created by H153466 on 3/26/2017.
 */
public class doubleArray {

    public static void main(String[] args) {
        int[] a={23,100,67,89};
        int[] b={77,89,2,0,3};
        int i=0;
        int cont=0;

        for(;i<a.length;i++){
            if(maiMare(a[i],b)) {
                cont++;
            }
        }
        System.out.println(cont);


    }
    public static boolean maiMare (int n, int[] a){
        boolean mare=true;
       for( int i=0;i<a.length;i++){
           if( n<a[i]) {
               mare = false;
           }
       }
       return mare;

    }
}
