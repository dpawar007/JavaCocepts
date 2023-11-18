package jdk8.methodconstructorreferences;

import java.util.function.Supplier;

import jdk8.streams.example.data.Student;

public class SupplierMethodReferenceExample {

    Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println();

    }
}
