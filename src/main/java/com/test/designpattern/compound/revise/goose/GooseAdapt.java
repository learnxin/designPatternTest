package com.test.designpattern.compound.revise.goose;

import com.test.designpattern.compound.revise.duck.QuackObserve;
import com.test.designpattern.compound.revise.duck.Quackable;

public class GooseAdapt implements Quackable {
    private Goose goose;

    public GooseAdapt(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserve(QuackObserve observe) {

    }

    @Override
    public void notifyObserve() {

    }
}
