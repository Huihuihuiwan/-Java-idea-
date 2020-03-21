package com.wendy.day06.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/2 20:30
 */
/*
定义一个类，用来模拟“手机”事物

属性：品牌、价格、颜色
行为：打电话、发短信

对应到类当中：
成员变量（属性）：
    String brand；
    double price；
    String color；
成员方法（行为）
    public void call(String who){}
    public void sendMessage(){}
* */
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
