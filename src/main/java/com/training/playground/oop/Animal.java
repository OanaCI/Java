package com.training.playground.oop;

/**
 * Created by H153466 on 5/7/2017.
 */
public class Animal {
    int age;
    String name;
    int weight;

    public Animal( int catAge ,String catName ,int catWeight){
        age=catAge;
        name=catName;
        weight=catWeight;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }


    public void checkStatus(){
        System.out.println("ok!");


    }
    public void speak(){
        System.out.println( "generic sound");
    }




}

