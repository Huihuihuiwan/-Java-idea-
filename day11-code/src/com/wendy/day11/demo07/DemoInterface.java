package com.wendy.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 17:16
 */
/*
* java.util.List正式ArrayList所实现地接口
* */
public class DemoInterface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addName(List<String> list){
        list.add("111");
        list.add("222");

        return list;
    }
}
