package com.training.playground.projects.hanoi;

/**
 * Created by raz on 10/21/2017.
 */
public class Disc {
    int size;
    public Disc( int size1){
        size=size1;
    }

    public void print (){
        for(int i = 0; i < size; i++){
            System.out.print("#");
        }
    }
}
