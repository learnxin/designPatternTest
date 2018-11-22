package com.test.designpattern.ObserverPattern;

import com.example.demo.ObserverPattern.UserJavaUtilSuperObj.OtherDate;
import com.example.demo.ObserverPattern.UserJavaUtilSuperObj.OtherObserver;

public class TestObserver {
    public static void main(String[] args) {
//        WeatherDate weatherDate = new WeatherDate(new ArrayList<Observer>());
//        Hobserver hobserver = new Hobserver(weatherDate);
//        Tobserver tobserver = new Tobserver(weatherDate);
//        weatherDate.setTemplet(1,2);
//        weatherDate.setTemplet(3,4);
        OtherDate otherDate = new OtherDate();
        OtherObserver otherObserver = new OtherObserver(otherDate);
        otherDate.setTemplet(1,11);
    }
}
