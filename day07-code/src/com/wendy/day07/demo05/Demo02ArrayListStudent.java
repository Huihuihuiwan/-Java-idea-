package com.wendy.day07.demo05;

import java.util.ArrayList;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 20:31
 */
/*
* 题目：定义4个学生对象，添加到集合中，并遍历
* */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("one" ,20);
        Student two = new Student("two" ,30);
        Student three = new Student("three" ,40);
        Student four = new Student("four" ,50);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("name :" + stu.getName() + " , age : " + stu.getAge());
        }
    }
}
