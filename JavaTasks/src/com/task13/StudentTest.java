package com.task13;
//Первое задание [Student, StudentTest]
public class StudentTest {

    public static void insertionSort(Student[] arr) {

        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i;

            while (j > 0 && key.compareTo(arr[j-1]) < 0) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("John", "Smith", 105);
        students[1] = new Student("Sarah", "Barnes", 102);
        students[2] = new Student("Mark", "Riley", 104);
        students[3] = new Student("Laura", "Getz", 101);
        students[4] = new Student("Larry", "Smith", 103);

        insertionSort(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}