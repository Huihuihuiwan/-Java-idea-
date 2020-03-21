package com.wendy.day08.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 14:09
 */
public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";

        Student one = new Student("one",20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
        System.out.println("==============");

        Student two = new Student("one",20);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);
        System.out.println("==============");
    }
}
