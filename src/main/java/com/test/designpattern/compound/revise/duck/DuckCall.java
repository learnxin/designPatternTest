package com.test.designpattern.compound.revise.duck;

public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("duck call");
        notifyObserve();
    }

    private QuackAbserveable quackAbserveable;

    public DuckCall() {
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
