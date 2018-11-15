package com.test.designpattern.compound.goose;

import com.test.designpattern.compound.Quackable;

public class GooseAdapt implements Quackable {
    private Goose goose;

    public GooseAdapt(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
