package com.training.playground.probleme;

/**
 * Created by H153466 on 3/26/2017.
 */
public class Sortare {
    public static void main(String[] args) {
        int[] a={8,3,1,5};
        for ( int i=0;i<a.length-1;i++){
           int minPos=findMinPos( a , i);
           interSchimba( a,i,minPos);
        }
        tiparire(a);

    }
    public static void tiparire(int[] a ){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void interSchimba(int[] a,int pos1,int pos2){
        int aux=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=aux;
    }

    public static int findMinPos( int[] a,int startPosition){
        int minPosition =startPosition;
        for( int i=startPosition;i<a.length;i++){
            if(a[i]<a[minPosition] ){
                minPosition=i;
            }

        }
        return minPosition;
    }
}
