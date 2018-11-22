package com.test.designpattern.ObserverPattern;

public interface ObserverAble {

    void registerItem(Observer observer);
    void removeItem(Observer observer);
    void notifyItem();
}
