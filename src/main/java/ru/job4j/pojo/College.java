package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Daniyar");
        student.setGroup(12);
        student.setDateOfReceipt(new Date());
        System.out.println(student.getName() + " has a car - " + student.getGroup() + " : " + student.getDateOfReceipt());
    }
}
