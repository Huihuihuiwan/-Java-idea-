package com.wendy.day06.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 11:11
 */
public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "father";
        person.sayHello("son");
        System.out.println(person);
    }
}
