package com.training.playground.probleme;

/**
 * Created by H153466 on 4/10/2017.
 */
public class Array1 {
    public static void main(String[] args) {

        int[] a={23,45,56,12};
//        parcurgerePara( a);
//        parcurgereImpara( a);
        System.out.println( suma( a));




    }
//    tipul returnat , nume , parametru si body

    public static void parcurgerePara ( int[] a){

        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.println(a[i]);
            }
        }

    }


    public static void parcurgereImpara ( int[] a){
        for(int i=0;i<a.length;i++){
            if(i%2==1){
                System.out.println(a[i]*2);
            }
        }
    }

    public static int suma ( int[] a){
        int sum=0;

        for(int i=0;i<a.length;i++){
           sum=sum +a[i];
        }
        return sum;
    }

}
