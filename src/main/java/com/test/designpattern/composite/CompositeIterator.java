package com.test.designpattern.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{
    private Stack stack=new Stack();


    public CompositeIterator(Iterator iterator) {

        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(!stack.empty()){

            Iterator peek = (Iterator)stack.peek();
            if(!peek.hasNext()){
                stack.pop();
                return hasNext();


            }
            return true;
        }
        else {
            return false;
        }



    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator peek = (Iterator)stack.peek();
            MenuComponent next = (MenuComponent)peek.next();
            if(next instanceof Menu){
                stack.push(next.createIterator());
            }
            return next;
        }
        return null;
    }
}
