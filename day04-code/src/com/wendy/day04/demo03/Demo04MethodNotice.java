package com.wendy.day04.demo03;

/**
 * Author : wendy_wan
 * Created : 2020/3/1 8:19
 *
 * 使用方法的时候，注意事项：
 * 1、方法应该定义在类当中，但是不能在方法当中再定义方法，不能嵌套
 * 2、方法定义的先后顺序无所谓
 * 3、方法定义之后不会执行，如果希望执行，一定要调用：单独调用，打印调用、赋值调用。
 * 4、如果方法有返回值，那么必须写上”return 返回值；“，不能没有
 * 5、return后面的返回值数据，必须和方法的返回值类型对应起来。
 * 6、对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。
 * 7、对于void方法中最后一行的return可以省略不写。
 * 8、一个方法当中可以有多个return语句，但是必须保证同时只有一个会被执行,两个return不能连写。
 */
public class Demo04MethodNotice {
    public static int method1(){
        return 10;
    }
    public static void method02(){
        /*没有返回值，只是结束方法的执行而已。*/
        return ;
    }

    public static void method03(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
        //return；最后一行的return可以省略不写
    }

    public static int getMax(int a, int b){
/*        int max;
        if (a > b){
            max = a;
        }else{
            max = b;
        }
        return max;*/
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
}
