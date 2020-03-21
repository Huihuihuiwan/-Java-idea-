package com.wendy.day07.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 17:21
 */

/*
* 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
* new 类名称（）；
*
* 注意事项：
* 匿名对象只能使用唯一的一次，下次再使用不得不再创建一个新对象
*
* 使用建议：
* 如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象。
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "wendy";
        one.showName();

        //匿名对象
        new Person().name = "aaaaa";
        new Person().showName();
    }
}
