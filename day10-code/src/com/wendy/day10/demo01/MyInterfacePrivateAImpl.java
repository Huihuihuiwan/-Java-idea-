package com.wendy.day10.demo01;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 20:36
 */
public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {
    public void methodAnother(){
        //直接访问了接口中的默认方法,这样是错误的
        methodCommon();
    }
}
