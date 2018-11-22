package com.test.designpattern.compound.revise.duck;

public interface QuackAbserveable {

    void registerObserve(QuackObserve observe);

    void notifyObserve();
}
