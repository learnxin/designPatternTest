package com.test.designpattern.composite;

import java.util.Iterator;

public abstract class MenuComponent {
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public Double price(){
        throw new UnsupportedOperationException();
    }

    public Boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public  MenuComponent getChild(Integer i){
        throw new UnsupportedOperationException();
    }

    abstract Iterator createIterator();
}
