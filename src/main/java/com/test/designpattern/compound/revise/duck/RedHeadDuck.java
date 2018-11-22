package com.test.designpattern.compound.revise.duck;

public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack");
        notifyObserve();
    }

    private QuackAbserveable quackAbserveable;

    public RedHeadDuck() {
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
