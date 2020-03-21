package com.wendy.day06.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 10:36
 */
public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();


        person.name = "wendy";
        person.setAge(20);
        person.show();
    }
}
