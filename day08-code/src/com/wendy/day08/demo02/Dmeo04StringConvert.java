package com.wendy.day08.demo02;

/**
 * Author : wendy_wan
 * Created : 2020/3/6 9:22
 */
/*
* public char[] toCharArray () ：将当前字符串拆分成为字符数组作为返回值。
* public byte[] getBytes () ：获得当前字符串底层的字节数组
* public String replace (CharSequence target, CharSequence replacement) ：
* 将与target匹配的字符串使用replacement字符串替换，返回替换之后的结果新字符串。
* 备注：CharSequence是说可以接受字符串类型。
* */
public class Dmeo04StringConvert {
    public static void main(String[] args) {
        //转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); //H
        System.out.println(chars.length); // 5
        System.out.println("===========");

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=======");

        //字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1); //How do you do?
        System.out.println(str2); //H*w d* y*u d*?
        System.out.println("=========");

        String lang1 = "会不会玩儿呀！你大爷的！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2);
    }
}
