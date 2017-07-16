package com.training.playground.liste;

/**
 * Created by raz on 7/16/2017.
 */
public class ListTest {
    public static void main(String[] args) {

        int x = 0;
        Element y = new Element();
        y.setData(" string ");
//        System.out.println( y.getData() );

        Element z = new Element();
        z.setData( " next ");
        y.setNext( z );

//        System.out.println( y.getNext().getData());

        print(y);
    }
    static void print ( Element first){
        Element current = first;
        while(current!=null  ){
            System.out.println( current.getData() );
            current = current.getNext();

        }
    }
}
