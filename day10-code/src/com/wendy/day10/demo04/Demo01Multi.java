package com.wendy.day10.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 8:02
 */
/*
* 代码当中体现多态性，其实就是一句话，父类引用指向子类对象。
* 格式：
* 父类名称  对象名 = new 子类名称（）；  =》左夫右子
*
* 或者
* 接口名称  对象名 = new 实现名称（）；
* */
public class Demo01Multi {
    public static void main(String[] args) {
        /*
        * 使用多态的写法
        * 左侧父类的引用，指向了右侧子类对象
        * */
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
