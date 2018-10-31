package com.test.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponents=new ArrayList<>();
    private String name;
    private String description;


    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Menu() {
    }

    @Override
    public void print() {
        System.out.println("Menu{" +
                " name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}');
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            iterator.next().print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(Integer i) {
        return menuComponents.get(i);
    }

    @Override
    Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
