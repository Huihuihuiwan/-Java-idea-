package com.wendy.day16.demo03.Exception;

import java.util.List;

/**
 * Author : wendy_wan
 * Created : 2020/3/20 10:56
 */
public class Demo01Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获又该如何处理呢？
            1. 多个异常分别处理。
            2. 多个异常一次捕获，多次处理。
            3. 多个异常一次捕获一次处理。
         */
        /*
            一个try多个catch注意事项:
                catch里边定义的异常变量,如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }



    }
}
