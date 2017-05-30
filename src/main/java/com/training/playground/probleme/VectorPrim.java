package com.training.playground.probleme;

/**
 * Created by H153466 on 3/26/2017.
 */
public class VectorPrim {
//    public static void main(String[] args) {
//       int[] a={23,44,11,13,222};
//       int i=0;
//
//       while (i<a.length){
//           if(estePar (a[i])){
//               System.out.println(a[i]);
//           }
//           i++;
//       }
//
//    }

    public static void main(String[] args) {
        int[] a={12,23,45,12};
        int i=0;
        int x=a.length-1;
        int cont=0;

        while( i<a.length-1){
            if(a[i]==a[a.length-1]){
                cont++;
            }
            i++;

        }
        System.out.println(cont);
    }

    public static boolean  ePrim(int n) {
        int x=2;
        boolean gasitprim=true;

        while (x < n){
            if(n%x==0){
                gasitprim =false;
            }
            x++;
        }
        return gasitprim;
    }

    public static boolean estePar(int n){
        if( n%2==0){
            return true;
        }else{
            return false;
        }
    }
}
