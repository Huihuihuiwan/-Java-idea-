package com.wendy.day11.demo06;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 16:50
 */
public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        //为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();
    }
}
