package com.wendy.day04.demo02;
/*
* 方法其实就是若干语句的功能集合
* 定义方法的完整格式：
* 修饰符 返回值类型 方法名称（参数类型 参数名称，...){
*   方法体；
*   return 返回值；
* }
* 比如修饰符：public static
* 返回值类型：最终产生的数据结果是什么类型
* 方法名称：方法的名字，规则和变量一样，小驼峰
* 参数类型：进入方法的数据是什么类型
* 参数名称：进入方法的数据对应的变量名称
*
* return：两个作用，第一停止当前方法，第二将后面的返回值还给调用处。
* return后面的返回值，必须和方法名称前面的“返回值类型”保持对应。
*
*
* 方法的三种调用格式:
* 1、单独调用：方法名称（参数）；
* 2、打印调用：System.out.println();
* 3、赋值调用:数据类型 变量名称 = 方法名称（参数）；
* 返回值类型固定写成void，这种方法只能够单独调用，不能进行打印调用或者赋值调用
*
* */
public class Demo02MethodDefine {

    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum(10,20));

        int number = sum(10,20);
        System.out.println(number);
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
