package com.test.designpattern.compound.duck;

public interface AbstractDuckFactary {

    Quackable createDuckCall();
    Quackable createRubberDuck();
    Quackable createRedHeadDuck();
    Quackable createMallrdDuck();
}
