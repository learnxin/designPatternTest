package com.test.designpattern.ObserverPattern;

import java.util.List;

public class WeatherDate implements ObserverAble {
    private float t=123;
    private float h=123;
    private List<Observer> observerList;

    public WeatherDate(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void setTemplet(float t, float h) {
        this.t = t;
        this.h = h;
        notifyItem();
    }


    @Override
    public void registerItem(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeItem(Observer observer) {
        int i = observerList.indexOf(observer);
        if(i>0){

            Observer remove = observerList.remove(i);
        }
    }

    @Override
    public void notifyItem() {
        for (Observer obs:observerList
             ) {
            obs.update(t,h);
        }
    }
}
