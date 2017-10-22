package com.training.playground.projects.hanoi;

/**
 * Created by raz on 10/21/2017.
 */
public class Tower {
    int size = 0;

    Disc discs[]= new Disc[10];

    public void addDisc(Disc disc){
        discs[size]=disc;
        size=size+1;
    }
    public Disc removeDisc(){
        size=size-1;
        return discs[size];

    }
    public void print(){
        for (int i=discs.length-1;i >= 0;i--){
            if(i < size) {
                discs[i].print();
                System.out.println();
            }
        }
    }
}
