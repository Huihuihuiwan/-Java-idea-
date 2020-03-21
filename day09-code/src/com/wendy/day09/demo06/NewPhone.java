package com.wendy.day09.demo06;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 13:59
 */
public class NewPhone extends Phone {
    @Override
    public void show() {
//        System.out.println("显示号码");
        super.show();//把父类的show方法拿过来重复利用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
