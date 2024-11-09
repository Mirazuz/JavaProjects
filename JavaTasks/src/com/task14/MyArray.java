package com.task14;

import java.util.Iterator;

public class MyArray<E> implements MyArrayInterface<E> {

    private E[] values;

    public MyArray()
    {
        values = (E[]) new Object[0];
    }


    @Override
    public boolean add(E e) {
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, values, 0, temp.length);
        values[values.length-1] = e;
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];
        
    }

    @Override
    public void remove(int index) {
        E[] temp = values;
        values = (E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);

        int countElemIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, countElemIndex);

    }

    @Override
    public void set(int index, E e) {

        values[index] = e;

    }

    @Override
    public int size() {

        return values.length;
    }

    @Override
    public Iterator<E> iterator() {

        return new MyIterator<>(values);
    }

    public static void main(String[] args) {
        MyArray<String> strings= new MyArray<>();
        strings.add("first");
        strings.add("seconds");
        strings.add("tree");

        System.out.println(strings.get(1));
        System.out.println(strings.size());

        strings.set(0, "Nov");
        System.out.println(strings.get(0));

        System.out.println("---------------------------------");

        strings.remove(0);
        
        System.out.println(strings.size());

        for (String s: strings)
        {
            System.out.println(s);
        }

    }

    


} 
