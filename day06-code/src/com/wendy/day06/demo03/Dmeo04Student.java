package com.wendy.day06.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 10:57
 */
public class Dmeo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("wendy");
        stu.setAge(19);
        stu.setMale(false);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是男生： " + stu.isMale());
    }
}
