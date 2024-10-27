package com.task13;

import java.util.Comparator;
//Вторая работа [Student_ , SortingStudentsByGPA]
public class SortingStudentsByGPA implements Comparator<Student_> {

    @Override
    public int compare(Student_ s1, Student_ s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public void quickSort(Student_[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(Student_[] array, int low, int high) {
        Student_ pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (compare(array[j], pivot) <= 0) {
                i++;
                Student_ temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Student_ temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;

    }

    public static void main(String[] args) {
        Student_[] students = new Student_[5];

        students[0] = new Student_("John", "Smith", 3.8);
        students[1] = new Student_("Sarah", "Barnes", 3.5);
        students[2] = new Student_("Mark", "Riley", 3.9);
        students[3] = new Student_("Laura", "Getz", 3.7);
        students[4] = new Student_("Larry", "Smith", 3.6);

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        for (Student_ student : students) {
            System.out.println(student);
        }
    }
}
