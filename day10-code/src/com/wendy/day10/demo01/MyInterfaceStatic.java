package com.wendy.day10.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 18:06
 */
/*
* 从Java 8开始，接口当中允许定义静态方法
*
* 格式：
* public static 返回值类型 方法名称（参数列表）{
*       方法体；
* }
*
* 提示：就是abstract或者default换成static即可，带上方法体。
* */
public interface MyInterfaceStatic {

    public static void methodStatic(){
        System.out.println("这是接口的静态方法！");
    }
}
