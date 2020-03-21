package com.wendy.day06.demo05;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 16:18
 */
public class Demo01Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("name: " + stu1.getName() + ", age : " + stu1.getAge());
        System.out.println("================");

        Student stu2 = new Student("古力娜扎",21);
        System.out.println("name: " + stu2.getName() + ", age : " + stu2.getAge());
        stu2.setAge(22);
        System.out.println("name: " + stu2.getName() + ", age : " + stu2.getAge());

    }
}
