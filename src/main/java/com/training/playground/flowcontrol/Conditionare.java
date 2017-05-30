package com.training.playground.flowcontrol;

/**
 * Created by H153466 on 2/13/2017.
 */
public class Conditionare {
    public static void main(String[] args) {
        int var1 = 2;
        int var2 = 30;
        if(var1 + var2 < 6 ){
            System.out.println("galben");
        } else {
            System.out.println("verde");
        }

//---------------------------
        int v1 = 2;
        int v2 = 2;
        int s = (int) (v1 + v2) ;
        if (s < 6 ){
            System.out.println("galben");
        }else {
            if (s < 10) {
                System.out.println("verde");
            } else {
                System.out.println("rosu");
            }
        }

    }
}

//-----------------------------------------------

