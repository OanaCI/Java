package com.training.playground.oop;

/**
 * Created by H153466 on 5/7/2017.
 */
public class Main  {
    public static void main(String[] args) {
        Cat mittens = new Cat(5,"snow",3,9) ;
        System.out.println( mittens.getAge());
        System.out.println(mittens.getName());
        System.out.println(mittens.getWeight());

        Cat furrball =new Cat( 1 ,"larry",1,8);
        System.out.println(furrball.getAge());
        furrball.speak();


        Cat cat1 =new Cat (3,"mirtica" ,2,7);
        System.out.println(cat1.getWeight());
        System.out.println(cat1.getDistance());
        cat1.checkStatus();


        Cat cat2 =new Cat (4, " puffball" ,3,5);
        System.out.println(cat2.getName());
        cat2.speak();
        System.out.println(cat2.getDistance () +" "+ cat2.getWeight());



        Cat[] cats={mittens ,furrball,cat1,cat2};
        for(int i = 0;i<cats.length;i++){
            System.out.println("cat " +  cats[i].getName() +" says ");
            cats[i].speak();



        }
        Dog spike =new Dog ( 4,"dog1",5);
        System.out.println( spike.getName());

        Animal[]animals={spike,mittens,furrball,cat1,cat2};
        for(int i=0;i<animals.length;i++){
            animals[i].speak();
        }






    }



}