package com.test.designpattern.ObserverPattern.UserJavaUtilSuperObj;

import java.util.Observable;

public class OtherDate extends Observable{

    private float t=123;
    private float h=123;

    public void setTemplet(float t, float h) {
        this.t = t;
        this.h = h;
        setChanged();
        notifyObservers("yyf");
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public OtherDate() {
    }
}
