package com.wendy.day19.demo01.File;

import java.io.File;

/**
 * Author : wendy_wan
 * Created : 2020/3/21 12:36
 */
/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo04File {

    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
        public boolean isDirectory() ：此File表示的是否为目录。
            用于判断构造方法中给定的路径是否以文件夹结尾
                是:true
                否:false
        public boolean isFile() ：此File表示的是否为文件。
            用于判断构造方法中给定的路径是否以文件结尾
                是:true
                否:false
        注意:
            电脑的硬盘中只有文件/文件夹,两个方法是互斥
            这两个方法使用前提,路径必须是存在的,否则都返回false
     */
    private static void show02() {
        File f1 = new File("E:\\Code\\JavaDemo\\basic-code\\day77");

        //不存在，就没有必要获取
        if (f1.exists()){
            System.out.println(f1.isDirectory()); //false
            System.out.println(f1.isFile()); //false
        }
        System.out.println("----------------");


        File f2 = new File("E:\\Code\\JavaDemo\\basic-code\\day19-code");

        //不存在，就没有必要获取
        if (f2.exists()){
            System.out.println(f2.isDirectory()); //true
            System.out.println(f2.isFile()); //false
            System.out.println("----------------");
        }

        File f3 = new File("E:\\Code\\JavaDemo\\basic-code\\day19-code\\day19-code.iml");

        //不存在，就没有必要获取
        if (f3.exists()){
            System.out.println(f3.isDirectory()); //false
            System.out.println(f3.isFile()); //true
        }
    }

    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在:true
            不存在:false
     */
    private static void show01() {
        File f1 = new File("E:\\Code\\JavaDemo\\basic-code\\day19-code");
        System.out.println(f1.exists());//true

        File f2 = new File("E:\\Code\\JavaDemo\\basic-code\\day");
        System.out.println(f2.exists());//false

        File f3 = new File("day19-code.iml");//相对路径
        System.out.println(f3.exists());//true

        File f4 = new File("a.txt");
        System.out.println(f4.exists());//false
        System.out.println("=============");

    }
}
