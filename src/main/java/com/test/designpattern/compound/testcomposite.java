package com.test.designpattern.compound;

import com.test.designpattern.compound.duck.*;
import com.test.designpattern.compound.goose.Goose;
import com.test.designpattern.compound.goose.GooseAdapt;

public class testcomposite {

    public static void main(String[] args) {
        testcomposite testAdapt = new testcomposite();
        CountDuckFactary countDuckFactary = new CountDuckFactary();
        testAdapt.simulate(countDuckFactary);
    }


    private void simulate(CountDuckFactary countDuckFactary){
        Quackable mallardDuck = countDuckFactary.createMallrdDuck();
        Quackable duckCall =countDuckFactary.createDuckCall();
        Quackable redHeadDuck = countDuckFactary.createRedHeadDuck();
        Quackable rubberDuck =countDuckFactary.createRubberDuck();
        Quackable gooseAdapt = new GooseAdapt(new Goose());
        DuckFlock duckFlock = new DuckFlock();
        duckFlock.add(mallardDuck);
        duckFlock.add(redHeadDuck);
        duckFlock.add(rubberDuck);
        duckFlock.add(duckCall);
        duckFlock.add(gooseAdapt);
        DuckFlock flock = new DuckFlock();
        flock.add(duckCall);

        duckFlock.add(flock);
        simulate(duckFlock);
        System.out.println("------------1-1------");
        Quackologist quackologist = new Quackologist();
        duckFlock.registerObserve(quackologist);
        simulate(flock);
        System.out.println(DuckCount.getNum_duck());
    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }
}
