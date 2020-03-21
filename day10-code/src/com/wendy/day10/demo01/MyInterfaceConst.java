package com.wendy.day10.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 21:19
 */
/*
* 接口当中可以定义“成员变量”，但必须使用public static final三个关键字进行修饰
* 从效果上看，这其实就是接口【常量】
* 格式：
* public static final 数据类型 常量名称 = 数据值；
*
* 注意事项：
* 1、接口当中的常量，可以省略public static final，注意：不写也照样是这样。
* 2、接口中的常量，必须进行赋值，不能不赋值。
* 3、接口中常量的名称，使用完全大写的字母，用下划线进行分隔（推荐的命名规则）
* */
public interface MyInterfaceConst {

    //
    public static final int NUM_OF_MY_CLASS = 10;
}
