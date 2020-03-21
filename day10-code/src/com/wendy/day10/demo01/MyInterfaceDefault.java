package com.wendy.day10.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 17:48
 */
/*
* 从Java 8开始，接口里允许定义默认方法
* 格式：
* public default 返回值类型 方法名称（参数列表）{
*       方法体；
* }
* 备注：接口当中地默认方法，可以解决升级地问题。
* */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //新添加了一个抽象方法
//    public abstract void methodAbs2();
    //新添加地方法，改成默认方法
    public default void methodDefault(){
        //这是新添加地默认方法
        System.out.println("这是新添加地默认方法");
    }
}
