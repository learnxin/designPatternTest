package com.test.designpattern.compound.duck;

import com.test.designpattern.compound.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("rubber quack");
    }
}
