package com.wendy.day06.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/2 20:40
 */
public class Demo03PhoneSame {
    public static void main(String[] args) {

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
        System.out.println("============");

        Phone two = one;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("============");

        two.brand = "三星";
        two.price = 25823.2;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("============");

        two.call("欧巴");
        two.sendMessage();
    }
}
