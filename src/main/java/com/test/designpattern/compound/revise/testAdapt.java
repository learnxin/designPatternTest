package com.test.designpattern.compound.revise;

import com.test.designpattern.compound.revise.duck.*;
import com.test.designpattern.compound.revise.goose.Goose;
import com.test.designpattern.compound.revise.goose.GooseAdapt;

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
