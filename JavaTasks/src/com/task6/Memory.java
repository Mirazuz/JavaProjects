package com.task6;

public class Memory {
    private int size; //В ГБ

    public Memory(int size)
    {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory Size: " + size;
    }

}
