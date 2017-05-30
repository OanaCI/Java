package com.training.playground.flowcontrol;

/**
 * Created by H153466 on 3/12/2017.
 */
public class Vectori {
    public static void main(String[] args) {

//        int[] a = {5 , 6, 7,8};
//        int i = 0 ;
//
//       while (i < a.length ){
//           System.out.println( a[ i ]);
//            i++;
//       }


//        int [] a = {23 , 56 , 77 , 88 , 0};
//        int i = 0;
//
//        while ( i < a.length  ){
//
//            if ( a[ i ] % 2 == 0 ){
//                System.out.println( a[ i ]);
//            }
//            i++;
//
//        }


//        int[] a = {13 ,45 , 56 , 33 , 17,19,21};
//        int i = 0;
//        int sum = 0;
//
//        while ( i < a.length){
//           if(i%2==0){
//               sum=sum+a[i];
//           }
//            i++;
//        }
//        System.out.println(sum);

//        int[] a = {13 ,45 , 56 , 33 , 17,19,21};
//        int i = 0;
//        int sum = 0;
//
//        while (i< a.length){
//            sum=sum+ a[i];
//            i=i+2;
//        }
//        System.out.println( sum);

//        int[] a = {13 ,45 , 56 , 33 };
//        int i = 0;
//        int sum = 0;
//
//        while (i< a.length){
//            if(i%2==0 && a[i]%2==1){
//                sum=sum+a[i];
//            }
//            i++;
//
//        }
//        System.out.println( sum);

//        Se da un vector -sa se afiseze cel mai mare numar .

//        int []a={12 , 3 , 6 ,56, 666,999};
//        int i=0;
//        int max=-999999;
//
//        while ( i < a.length){
//            if (  a[i] > max){
//                max=a[i];
//            }
//            i++;
//        }
//        System.out.println( max);

//        Sa se afle pozitia nr cel mai mare din vector.

//        int []a={23 , 34 , 56 , 1,999};
//        int i=0;
//        int  max=-1;
//        int poz=-1;
//
//        while (i<a.length){
//            if (a[i]> max){
//                max=a[i];
//                poz =i;
//            }
//            i++;
//        }
//        System.out.println( poz);


//        int []a={8 , 6, 4 , 3};
//        int i=0;
//        int sum=0;
//        int x = 0;
//        int cont=0;
//
//        while ( i< a.length){
//            sum=sum+a[i];
//            i++;
//        }
//        int med=sum/a.length;
//        while ( x < a.length){
//            if( a[x] > med){
//                cont=cont+1;
//            }
//            x++;
//        }
//        System.out.println( cont);


        int[] a={99,33,10,1};
        int i=0;
//        parcurgeInvers(a);
//        parcurgeInvers2(a);
//        sumaPerechi(a);
//        secondLargest(a);
        int[] b=anotherVector(a);
        while (i<b.length){
            System.out.println(b[i]);
            i++;

        }


    }


    public static void parcurgeInvers(int[] arr){
        int i=arr.length-1;
        while( i>= 0){
            System.out.println(arr[i]);
            i--;
        }
    }
    public static void parcurgeInvers2(int[]crr){
        int i = 0;
        while(i<crr.length) {
            System.out.println(crr[crr.length-i-1]);
            i++;
        }
    }

    public static void  sumaPerechi(int[]brr){
        int i =0;
        int limita=brr.length;
        if(brr.length%2==0){
            limita=brr.length/2;
        }else{
            limita=brr.length/2+1;
        }
        while (i<limita){
            int sum =brr[i]+(brr[brr.length-i-1]);
            System.out.println(sum);
            i++;
        }
    }

    //notele elevilor-2 cele mai mari note.
    public static void  secondLargest(int[]arr){
        int i=0;
        int max=arr[0];
        int second=Integer.MIN_VALUE;

        while(i<arr.length){
            if( max<arr[i]) {
                max=arr[i];
            }
            i++;
        }
        System.out.println(max);

        i=0;
        while(i < arr.length){
            if(second < arr[i] && arr[i] < max){
                second=arr[i];
            }
            i++;
        }
        System.out.println(second);
//un vector-sa se contriasca alt vector cu elementele primului vector l


    }

    public static int[] anotherVector(int[]drr ) {
        int i=0;
        int[] rezult=new int[drr.length];

        while (i<drr.length){
            rezult[i]=drr[drr.length-i-1];
            i++;
        }
        return rezult;

    }

}
