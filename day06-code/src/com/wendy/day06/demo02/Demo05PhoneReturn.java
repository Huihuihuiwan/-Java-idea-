package com.wendy.day06.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/2 22:18
 */
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 12345.6;
        one.color = "玫瑰金";
        return one;
    }
}
