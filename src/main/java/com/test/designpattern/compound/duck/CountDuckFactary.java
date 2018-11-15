package com.test.designpattern.compound.duck;

import com.test.designpattern.compound.Quackable;

public class CountDuckFactary implements AbstractDuckFactary {
    @Override
    public Quackable createDuckCall() {
        return new DuckCount(new DuckCall()) ;
    }

    @Override
    public Quackable createRubberDuck() {
        return new DuckCount(new RubberDuck()) ;
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new DuckCount(new RedHeadDuck());
    }

    @Override
    public Quackable createMallrdDuck() {
        return new DuckCount(new MallardDuck());
    }
}
