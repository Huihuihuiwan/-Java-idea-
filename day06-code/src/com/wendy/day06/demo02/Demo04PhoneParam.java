package com.wendy.day06.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/2 22:07
 */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 23.26;
        one.color = "blue";

        method(one);//传递进去的参数其实就是地址值
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
