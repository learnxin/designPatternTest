package com.test.designpattern.ObserverPattern;

public class Tobserver implements Observer{


    private ObserverAble observerAble;

    public Tobserver(ObserverAble observerAble) {
        this.observerAble = observerAble;
        observerAble.registerItem(this);
    }

    @Override
    public void update(float t, float h) {
        System.out.println("i am tobserver"+t);
    }
}
