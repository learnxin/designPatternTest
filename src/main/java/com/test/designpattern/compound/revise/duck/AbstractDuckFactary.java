package com.test.designpattern.compound.revise.duck;

public interface AbstractDuckFactary {

    Quackable createDuckCall();
    Quackable createRubberDuck();
    Quackable createRedHeadDuck();
    Quackable createMallrdDuck();
}
