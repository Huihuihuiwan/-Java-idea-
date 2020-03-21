package com.wendy.day06.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 10:55
 */

/*
* 对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变
* */
public class Student {
    private String name;
    private int age;
    private boolean male;

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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
