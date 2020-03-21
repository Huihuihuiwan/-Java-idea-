package com.wendy.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * Author : wendy_wan
 * Created : 2020/3/3 18:27
 */
/*
* 题目：用代码模拟猜数字的小游戏
*重试就是再来一次，循环次数不确定，用while（true）
* * */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; //[1,100]
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入你猜测的数字：");
            int guesNum = sc.nextInt(); //键盘输入猜测的数字

            if (guesNum > randomNum){
                System.out.println("太大了，请重试！");
            }else if (guesNum < randomNum){
                System.out.println("太小了，请重试！");
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
