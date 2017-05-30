package com.training.playground.oop;

/**
 * Created by H153466 on 5/7/2017.
 */
public class Dog extends Animal{
    public Dog(int dogAge,String dogName,int dogWeight){
        super( dogAge,dogName,dogWeight);

    }
    public void speak ( ){
        System.out.println( " ham");
    }


}
