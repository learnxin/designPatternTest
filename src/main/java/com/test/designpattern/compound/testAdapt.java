package com.test.designpattern.compound;

import com.test.designpattern.compound.duck.*;
import com.test.designpattern.compound.goose.Goose;
import com.test.designpattern.compound.goose.GooseAdapt;

public class testAdapt {

    public static void main(String[] args) {
        testAdapt testAdapt = new testAdapt();
        CountDuckFactary countDuckFactary = new CountDuckFactary();
        testAdapt.simulate(countDuckFactary);
    }


    private void simulate(CountDuckFactary countDuckFactary){
        Quackable mallardDuck = countDuckFactary.createMallrdDuck();
        Quackable duckCall =countDuckFactary.createDuckCall();
        Quackable redHeadDuck = countDuckFactary.createRedHeadDuck();
        Quackable rubberDuck =countDuckFactary.createRubberDuck();
        Quackable gooseAdapt = new GooseAdapt(new Goose());
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseAdapt);
        simulate(duckCall);
        simulate(mallardDuck);
        System.out.println(DuckCount.getNum_duck());
    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }
}
