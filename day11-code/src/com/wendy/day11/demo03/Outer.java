package com.wendy.day11.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 15:33
 */
/*
* 如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
* */
public class Outer {

    int num = 10;

    public class Inner{
        int num = 20;

        public void methodInner(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
