package com.wendy.day09.demo06;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 14:01
 */
public class Demo01Phone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("==========");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
