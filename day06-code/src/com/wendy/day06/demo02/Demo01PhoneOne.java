package com.wendy.day06.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/2 20:40
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象
        //格式：类名称 对象名 = new 类名称（）；
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("============");

        one.brand = "apple";
        one.price = 21365.2;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("============");

        one.call("乔布斯");
        one.sendMessage();
    }
}
