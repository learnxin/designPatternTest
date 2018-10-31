package com.test.designpattern.composite;

import java.util.Iterator;

public class testPrint {
    public static void main(String[] args) {
        MenuComponent menuItem =
                new MenuItem("vega","vegadescription",12.00,true);
        MenuComponent menu = new Menu("test","ttest");
        MenuComponent menu1 = new Menu("test1","ttest1");
        menu.add(menuItem);
        menu.add(menu1);
        menu1.add(menuItem);
        menu1.add(menuItem);
//        menu.print();
        Iterator iterator = menu.createIterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
        }
    }
}
