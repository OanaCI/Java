package com.training.playground.flowcontrol;

/**
 * Created by H153466 on 2/14/2017.
 */
public class BasicSorting {


    public static void main(String[] args) {
        int va1 = 1;
        int va2 = 2;
        int va3 = 3;

        if (va1 < va2) {
            System.out.println("va1 va2");
        } else {

                System.out.println("va2 va1");

            if (va2 < va3) {
                System.out.println("va2 va3");
            } else {
                if (va3 < va2) {
                    System.out.println("va3 va2");
                }

                if (va1 < va3) {
                    System.out.println("va1 va3");
                } else {
                    if (va3 < va1) {
                        System.out.println("va3 va1");
                    }

                }
            }
        }

    }
}



