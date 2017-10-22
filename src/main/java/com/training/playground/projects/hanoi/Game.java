package com.training.playground.projects.hanoi;

import com.sun.glass.ui.Size;

/**
 * Created by raz on 10/22/2017.
 */
public class Game {

    Tower myTower1 = new Tower();
    Tower myTower2 = new Tower();
    Tower myTower3 = new Tower();
    int gameSize;




    public Game (int size){

        for(int i = size ; i > 0; i--){
            myTower1.addDisc( new Disc(i));
        }
        gameSize = size;


    }

    public void play(){
        move(myTower1, myTower2, myTower3, gameSize);
    }
    private  void move(Tower source, Tower destination, Tower aux, int count){
        if(count == 1) {
            Disc disc = source.removeDisc();
            destination.addDisc(disc);
            print();
        } else {
            move(source, aux, destination, count - 1);


            Disc disc = source.removeDisc();
            destination.addDisc(disc);
            print();

            move(aux, destination, source, count - 1);
        }

    }
    public void  print(){
        myTower1.print();
        System.out.println(" Tower1 ");
        myTower2.print();
        System.out.println(" Tower2 ");
        myTower3.print();
        System.out.println(" Tower3 ");
        System.out.println("------------------------------");
    }
}
