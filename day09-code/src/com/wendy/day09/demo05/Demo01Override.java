package com.wendy.day09.demo05;

/**
 * Author : wendy_wan
 * Created : 2020/3/16 13:42
 */
/*
* 方法覆盖重写的注意事项：
* 1、必须保证父子类之间方法的名称相同，参数列表也相同
* @Override：写上方法前面，用来检测是不是有效的正确覆盖重写。
* 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
*
* 2、子类方法的返回值必须【小于等于】父类方法的返回值范围。
*
* 3、子类方法的权限必须大于等于父类方法的权限修饰符。
*  扩展：public > protected > default > private
* */
public class Demo01Override {
}
