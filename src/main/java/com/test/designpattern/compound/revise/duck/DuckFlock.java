package com.test.designpattern.compound.revise.duck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuckFlock implements Quackable {
    List<Quackable> quackables=new ArrayList<>();

    public DuckFlock() {
    }


    public void add(Quackable quackable){
        quackables.add(quackable);

    }
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()){
            iterator.next().quack();
        }
    }

    @Override
    public void registerObserve(QuackObserve observe) {
        for (Quackable quackable:quackables
             ) {
            quackable.registerObserve(observe);
        }
    }

    @Override
    public void notifyObserve() {
        for (Quackable quackable:quackables
        ) {
            quackable.notifyObserve();
        }
    }
}
