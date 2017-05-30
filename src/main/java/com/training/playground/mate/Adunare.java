package com.training.playground.mate;

/**
 * Created by H153466 on 2/13/2017.
 */
public class Adunare {
    public static void main(String[] args) {
        byte var1 = 5;
        byte var2 = 7;
        byte var3 = (byte) (var1 + var2);

        System.out.println("rezultat "+ var3);
//---------------------------------------------------
        String myString = "5";
        String myString2 ="6";
        String sum = myString + myString2 ;

        System.out.println(sum);
//--------------------------------------------------
        String nume = "\"gi\\gi\"\ngoogle";

        System.out.println(nume);
    }
}
