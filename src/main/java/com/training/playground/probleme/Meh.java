package com.training.playground.probleme;

/**
 * Created by raz on 6/18/2017.
 */
public class Meh {
    public static void main(String[] args) {


//        int[] a={2,23,45,1,5};
//
//        for(int i=0;i<a.length;i++){
//            if (a[i]%2==0){
//                System.out.println(a[i] + "  \n " +  " este par");
//            }else{
//                System.out.println(a[i] + " \n"  + " este impar");
//            }
//        }


        int[] a={12,23,45,67,89,21};
        int[] b={1,2,5,7,8,3,6,8};

        int[] comb=new int[a.length+b.length];


        System.arraycopy(a ,0 ,comb ,0,a.length);
        System.arraycopy(b ,0 ,comb,a.length,b.length);


        for(int x=0;x<comb.length;x++){
            System.out.print(comb[x] + " ");
        }













    }
}
