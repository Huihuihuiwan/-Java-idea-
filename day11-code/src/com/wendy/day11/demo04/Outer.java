package com.wendy.day11.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 16:03
 */
/*
 * 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
 * “局部”：只有当前所属的方法才能使用它，出了这个方法外面就不能用了
 *
 * 定义格式：
 * 修饰符  class  外部类名称{
 *   修饰符 返回值类型 外部类方法名称（参数列表）{
 *       class 局部内部类名称{
 *           //。。。
 *       }
 *   }
 * }
 * */
public class Outer {

    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
