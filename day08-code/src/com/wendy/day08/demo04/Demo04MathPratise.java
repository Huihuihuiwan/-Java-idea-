package com.wendy.day08.demo04;

/**
 * Author : wendy_wan
 * Created : 2020/3/15 14:59
 */
/*
题目：
* 请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
分析：
1、既然已经确定了范围，for循环
2、起点位置-10.8应该转换成-10，两种办法：
    2.1可以使用Math.ceil方法，向上取整
    2.2强转成为int，自动舍弃所有小数位
3、每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
4、如何拿到绝对值，Math.abs方法
5、一旦发现了一个数字，需要让计数器++进行统计。
* */
public class Demo04MathPratise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count);

    }
}
