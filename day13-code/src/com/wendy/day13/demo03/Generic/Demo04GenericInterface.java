package com.wendy.day13.demo03.Generic;

/**
 * Author : wendy_wan
 * Created : 2020/3/18 19:19
 */
//测试含有泛型的接口
public class Demo04GenericInterface {

    public static void main(String[] args) {
        GenericInterfaceImpl gil = new GenericInterfaceImpl();
        gil.method("字符串");


        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gl2 = new GenericInterfaceImpl2<>();
        gl2.method(10);

        GenericInterfaceImpl2<Double> gl3 = new GenericInterfaceImpl2<>();
        gl3.method(8.8);
    }
}
