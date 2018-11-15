package com.test.designpattern.compound.duck;

import com.test.designpattern.compound.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("duck call");
    }
}
