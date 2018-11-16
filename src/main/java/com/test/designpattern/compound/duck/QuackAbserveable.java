package com.test.designpattern.compound.duck;

public interface QuackAbserveable {

    void registerObserve(QuackObserve observe);

    void notifyObserve();
}
