package com.test.designpattern.compound.duck;

import com.test.designpattern.compound.Quackable;

public interface AbstractDuckFactary {

    Quackable createDuckCall();
    Quackable createRubberDuck();
    Quackable createRedHeadDuck();
    Quackable createMallrdDuck();
}
