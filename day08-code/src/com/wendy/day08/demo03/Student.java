package com.wendy.day08.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 13:01
 */
public class Student {
    private int id; //学号
    private String name;
    private int age;
    static String room; //所在教室
    private static int idCounter = 0; //学号计数器，每当new了一个新对象的时候，计数器++

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
