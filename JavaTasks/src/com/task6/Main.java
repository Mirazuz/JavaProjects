package com.task6;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i5", 2.5, 32);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor("QLED", 32);

        Computer Computer = new Computer(Brand.DNS, processor, memory, monitor);

        System.out.println(Computer);
    }
}
