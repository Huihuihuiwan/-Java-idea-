package com.wendy.factory;

/**
 * @author wendy_wan
 * @date 2020/2/25 16:00
 */

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Bean：在计算机英语中，有可重用组件的含义。
 * JavaBean：用Java语言编写的可重用组件
 * javabean > 实体类
 *
 *  一个创建Bean对象的工厂：
 *      它就是创建我们service和dao对象的（之前编写的service和dao之间通过new产生了依赖关系）
 *
 *  第一个：需要一个配置文件来配置我们的service和dao
 *          配置的内容：唯一标识=全限定类名（key=value）
 *  第二个：通过读取配置文件中的配置内容，反射创建对象
 *
 *  首先准备配置文件
 *  配置文件可以是xml也可以是properties
 */
public class BeanFactory {
    //我们需要读取properties文件

    //定义一个properties对象
    private static Properties props;

    /**
     * 由于newInstance每次都会调用默认构造函数创建对象，
     * 所以我们需要创建一个容器存放bean对象
     * 定义一个Map，用于存放我们要创建的对象，我们把它称为容器。
     * 这样在后续使用的时候，不用反复创建
     */

    private static Map<String,Object> beans;


    //使用静态代码块未Properties对象赋值
    //静态代码在类加载的时候，只执行一次
    //在静态代码块中，不仅需要得到properties得到，还需要实例化我们的容器
    static {
        try{
            //实例化对象
            props = new Properties();
            //获取properties文件的流对象,不要使用FileInputStream
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);

            //实例化容器
            beans = new HashMap<String, Object>();

            //取出配置文件中所有的key,keys()返回一个枚举类型
            Enumeration keys = props.keys();
            //遍历枚举
            while(keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();

                //根据key获取value
                String beanPath = props.getProperty(key);

                //反射创建对象
                Object value = Class.forName(beanPath).newInstance();

                //把key和value存入容器之中
                beans.put(key,value);
            }
        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    /**
     * 根据beanName名称获取对象，现在这个类就是单例的了
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

    /**
     * 根据Bean名称获取bean对象
     * @param beanName
     * @return


//    如果想使用类调用，加一个static,通过beanName来表明读取配置文件中哪一个
    public static Object getBean(String beanName){
        Object bean = null;
        //读取bean的路径
        try{
            String beanPath = props.getProperty(beanName);
           // System.out.println(beanPath);
            //通过反射的方式创建对象
            //newInstance每次都会调用默认构造函数创建对象
            //如果创建之后不保存，由于java垃圾回收处理机制，长时间不用，就会被回收，下次再用时，就没有了。
    如果下次使用再创建，就变成了多例。现在我们只能用一次newInstance。所以我们要保存bean对象
    存在哪里？
            bean = Class.forName(beanPath).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bean;
    }
     */
}
