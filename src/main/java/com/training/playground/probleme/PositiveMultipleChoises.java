package com.training.playground.probleme;

/**
 * Created by H153466 on 2/20/2017.
 */
public class PositiveMultipleChoises {
    public static void main(String[] args) {
        int a = 5;
        int b = -13;
        int c = 10;
        int d = 7;
        int cont = 0;

        if (a > 0 ){
           cont = cont + 1;
        }
        if (b > 0){
            cont += 1;
        }
        if (c > 0){
            cont++;
        }
        if (d > 0){
            ++cont;
        }
        if (cont >= 3){
            System.out.println("plus");
        }
    }
}
