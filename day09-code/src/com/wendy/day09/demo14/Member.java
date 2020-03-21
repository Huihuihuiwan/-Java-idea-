package com.wendy.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 17:06
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给自己。
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到被删除的红包，给自己
        int delta = list.remove(index);
        //当前成员自己本来有多少钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }

}
