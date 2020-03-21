package com.wendy.day11.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 15:04
 */
public class Body {//外部类

    public class Heart{ //成员内部类
        //内部类的方法
        public void beat(){
            System.out.println("beat beat...");
            System.out.println("我叫：" + name);
        }
    }

    //外部类的成员变量
    private String name;

    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
//        Heart heart = new Heart();
        new Heart().beat();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
