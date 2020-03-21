package com.wendy.day07.demo04;

import java.util.ArrayList;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 19:23
 */
/*
* ArrayList当中的常用方法有：
* public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致。
* 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
* 但是对于其他集合来说，add添加动作不一定成功
*
* public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
* public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
* public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
* */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素，add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功，" + success);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);

        //从集合中获取元素：get，索引值从0开始
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);

        //从集合中删除元素：remove。索引值从0开始
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是： " + whoRemoved);
        System.out.println(list);

        //获取集合中的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是: " + size);
    }
}
