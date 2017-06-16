package com.training.playground.probleme;

/**
 * Created by raz on 6/6/2017.
 */
public class Adunare {
    public static void main(String[] args) {


        int[] a={1,2,4,2,1};
        int[] b={3,2,1};


       int[] c=aduna(a,b);
       for(int y=0;y<c.length;y++){
           System.out.println(c[y]);
       }












    }

    public static int[] aduna (int[] n1,int[] n2) {

        int i=n1.length-1;
        int j=n2.length-1;
        int maxlength=0;


        //test
        if(n1.length>n2.length ){
            maxlength=n1.length+1;
        }else{
            maxlength=n2.length+1;
        }
        int[] rez=new int[maxlength];
        int x=rez.length-1;
        System.out.println(rez.length);

        while( i<n1.length || j<n2.length){
            i--;
            j--;
            rez[x]=n1[i]+n2[j];


        }
        return rez;

    }
}
