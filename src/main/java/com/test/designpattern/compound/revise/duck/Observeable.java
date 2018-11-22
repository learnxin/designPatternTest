package com.test.designpattern.compound.revise.duck;

import java.util.ArrayList;
import java.util.List;

public class Observeable  implements  QuackAbserveable{

    private List<QuackObserve> quackObserves=new ArrayList<>();
    private QuackAbserveable quackAbserveable;

    public Observeable(QuackAbserveable quackAbserveable) {
        this.quackAbserveable = quackAbserveable;
    }

    @Override
    public void registerObserve(QuackObserve observe) {
        quackObserves.add(observe);
    }

    @Override
    public void notifyObserve() {
        for (QuackObserve observe:quackObserves
             ) {
            observe.update(quackAbserveable);
        }
    }
}
