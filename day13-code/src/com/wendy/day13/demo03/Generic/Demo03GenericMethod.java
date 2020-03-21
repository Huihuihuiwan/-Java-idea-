package com.wendy.day13.demo03.Generic;

/**
 * Author : wendy_wan
 * Created : 2020/3/18 19:08
 */
public class Demo03GenericMethod {

    public static void main(String[] args) {
        //创建GeneicMethod对象
        GenericMethod gm = new GenericMethod();

        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        gm.method01("静态方法，不建议创建对象使用");
        //静态方法，通过类名.方法名（参数）可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }
}
