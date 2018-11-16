package com.test.designpattern.compound.duck;

public class Quackologist implements QuackObserve{
    @Override
    public void update(QuackAbserveable abserveable) {
        System.out.println(abserveable);
    }
}
