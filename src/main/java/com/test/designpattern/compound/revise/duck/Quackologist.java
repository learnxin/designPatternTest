package com.test.designpattern.compound.revise.duck;

public class Quackologist implements QuackObserve{
    @Override
    public void update(QuackAbserveable abserveable) {
        System.out.println(abserveable);
    }
}
