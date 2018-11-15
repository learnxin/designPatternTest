package com.test.designpattern.compound.duck;

import com.test.designpattern.compound.Quackable;

public class MallardDuck implements Quackable {
    private String test;

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
