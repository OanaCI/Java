package com.training.playground.probleme;

/**
 * Created by raz on 6/1/2017.
 */
public class Array2 {
    public static void main(String[] args) {


//        int[] a={12,23,44,66};
//
//        for( int i =0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            }
//        }

//        int[] note={10,4,6,2,1,7,8};
//        float sum=0;
//        float med=0;
//        int count=0;
//
//        for(int i=0;i< note.length;i++){
//         sum=sum+note[i];
//        }
//        med=sum/note.length;
//        System.out.println(sum);
//        System.out.println(med);
//
//        for(int trece=0;trece<note.length;trece++){
//            if(note[trece]>=med){
//
//                count++;
//
//            }
//
//
//        }
//        System.out.println(count);

//        int a =8;
//        int rest=0;
//        boolean prim=true;
//
//        int b=a-1;
//       while(b>=2 && b<a && prim==true){
//           rest=a%b;
//           System.out.println("restul este" + rest);
////           System.out.println(  b);
//           if( rest ==0){
//               prim=false;
//               System.out.println("s a impartit exact la" + b);
//
//
//           }
//           b--;
//       }
//        System.out.println(prim);


//        int n=1984;
//        int sum=0;
//
//        while(n!=0){
//            int cifra= n%10;
//            n=n/10;
//            System.out.println( cifra );
//            sum=sum+cifra;
//
//        }
//        System.out.println(sum);


        int[] valori ={22,33,58,73,91};
        int sum =0;

        for( int i=0;i<valori.length;i++){
            if(valori[i]%2==1){
                System.out.println( valori[i]);
                sum=sum+valori[i];
            }
        }
        System.out.println(sum);











    }
}
