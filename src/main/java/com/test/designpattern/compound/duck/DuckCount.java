package com.test.designpattern.compound.duck;

import com.test.designpattern.compound.Quackable;

public class DuckCount implements Quackable {
    private static int num_duck=0;
    private Quackable duck;


    public DuckCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        num_duck++;
    }

    public static int getNum_duck() {
        return num_duck;
    }
}
