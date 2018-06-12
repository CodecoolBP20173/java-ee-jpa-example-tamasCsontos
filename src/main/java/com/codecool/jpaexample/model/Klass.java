package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Klass {
    private String name;

    @OneToMany
    private Set<Student> students;

    public Klass() {
        students = new HashSet<>();
    }

    public Klass(String name) {
        this.name = name;
        students = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
