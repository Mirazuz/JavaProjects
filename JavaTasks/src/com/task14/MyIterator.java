package com.task14;

import java.util.Iterator;

public class MyIterator<E> implements Iterator<E>{

    private int index = 0;
    E[] values;

    MyIterator(E[] values)
    {
        this.values = values;
    }

    @Override
    public boolean hasNext()
    {
        return index < values.length;
    }

    @Override
    public E next()
    {
        return values[index++];
    }

    // public static void main(String[] args) {
    //     String[] array = {"Jordan", "Helper", "Norm"};
    //     MyIterator<String> iterator = new MyIterator<>(array);

    //     while (iterator.hasNext())
    //     {
    //         System.out.println(iterator.next());
    //     }
    // }
}
