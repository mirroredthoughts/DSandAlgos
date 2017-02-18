package com.abn.dsalgos.ds;

import java.util.Arrays;


/**
 * Created by aswathyn on 14/02/17.
 */
public class StackArrays<T> {
    private int size ;
    private static final int MAX_SIZE=10;
    private Object[] element ;
    private int top;


    public StackArrays() {
        element= new Object[MAX_SIZE];
        size=0;
        top =-1;

    }
    public void push(T t) {
        if(size == element.length ) {
            int newSize = element.length *2;
            element = Arrays.copyOf(element, newSize);
        }
        element[size++] =t;
        top = size;

    }

    public T pop() {
        T t = (T) element[-- size];
        return t;
    }

    public boolean isEmpty() {
        return (size ==0);
    }

    public T peek() {
        top = getSize();
        T t = (T) element[--top];
        return t;
    }

    public int getSize() {
        return size;
    }

}