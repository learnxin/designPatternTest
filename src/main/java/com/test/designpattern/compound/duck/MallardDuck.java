package com.test.designpattern.compound.duck;

public class MallardDuck implements Quackable {
    private String test;

    @Override
    public void quack() {
        System.out.println("quack");
        notifyObserve();
    }

    private QuackAbserveable quackAbserveable;

    public MallardDuck() {
        quackAbserveable=new Observeable(this);
    }



    @Override
    public void registerObserve(QuackObserve observe) {
        quackAbserveable.registerObserve(observe);
    }

    @Override
    public void notifyObserve() {
        quackAbserveable.notifyObserve();
    }
}
