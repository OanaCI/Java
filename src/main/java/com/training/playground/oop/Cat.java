package com.training.playground.oop;

/**
 * Created by H153466 on 5/7/2017.
 */
public class Cat extends Animal{
        int distance;

        public Cat( int catAge ,String catName ,int catWeight,int catDistance){
            super(catAge,catName,catWeight);
            distance=catDistance;
        }
        public void speak (){
            System.out.println("miau");
        }
        public int getDistance(){
            return distance;
        }

}
