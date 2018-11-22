package com.test.designpattern.compound.revise.duck;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("rubber quack");
        notifyObserve();
    }

    private QuackAbserveable quackAbserveable;

    public RubberDuck() {
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
