package com.training.playground.probleme;

/**
 * Created by H153466 on 4/10/2017.
 */
public class Sortare2 {
    public static void main(String[] args) {

        int []a ={23,14,56,2};

        for(int i=0 ;i< a.length;i++){

            int pozMin=i;
            for( int j =i; j< a.length ;j++){
                if(a[j] <a[pozMin]){
                    pozMin =j;
                }
            }

            int aux= a[i];
            a[i] = a[pozMin];
            a[pozMin] = aux;
        }

        for (int i = 0; i< a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
