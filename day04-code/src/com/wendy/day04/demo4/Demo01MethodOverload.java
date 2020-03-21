package com.wendy.day04.demo4;

/*
方法的重载（overload），多个方法的名称一样，但是参数列表不一样
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。

方法重载与下列因素相关：
1、参数个数不同
2、参数类型不同
3、参数的多类型顺序不同

方法重载与下列因素无关：
1、与参数的名称无关
2、与方法的返回值类型无关
 */
public class Demo01MethodOverload {


    public static void main(String[] args) {
/*        System.out.println(sumTwo(10,20)); //30
        System.out.println(sumThree(10,20,30));//60
        System.out.println(sumFour(10,20,30,40));*/
        System.out.println(sum(10, 20));
    }

    public static int sum(int a, int b) {
        System.out.println("有两个参数的方法执行");

        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("有3个参数的方法执行");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有4个参数的方法执行");
        return a + b + c + d;
    }
}
