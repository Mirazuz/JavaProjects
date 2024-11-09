package com.task14;

public interface MyArrayInterface<E> extends Iterable<E>{

    boolean add(E e);
    void remove(int index);
    E get(int index);
    int size();
    void set(int index, E e);
    
}
