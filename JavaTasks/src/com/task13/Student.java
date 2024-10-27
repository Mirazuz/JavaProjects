package com.task13;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int idNumber;

    public Student(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.idNumber, other.idNumber);
    }
}
