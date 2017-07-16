package com.training.playground.liste;

/**
 * Created by raz on 7/16/2017.
 */
public class Element {
    private Object data;
    private Element next;

    public Object getData () {
        return data;
    }

    public void setData ( Object externalData ){
        data = externalData;
    }

    public Element getNext (){
        return next;
    }
    public void setNext ( Element externalNext){
        next= externalNext;
    }
}
