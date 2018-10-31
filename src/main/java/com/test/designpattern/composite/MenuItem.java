package com.test.designpattern.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private Double price;
    private Boolean isVegetarian;

    public MenuItem(String name, String description, Double price, Boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public Boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                '}');
    }

    @Override
    Iterator createIterator() {
        return new NullIterator();
    }
}
