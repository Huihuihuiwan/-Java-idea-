package com.wendy.ui;

/**
 * Project Name: day01_eesy_01jdbc
 * Package Name: com.wendy.ui
 *
 * @author wendy_wan
 * @date 2020/2/25 15:52
 */
import com.wendy.factory.BeanFactory;
import com.wendy.service.IAccountService;

/**
 * 模拟一个表现层，用于调用业务层
 *
 * 依赖：实现层具体依赖了一个Service
 */
public class Client {
    public static void main(String[] args) {

        /*依赖：实现层具体依赖了一个Service
        IAccountService as = new AccountServiceImpl();*/

        /**
         * 通过for循环，打印，
         * 在AccountServiceImpl中将private int i = 1;放在方法外面
         * 显示的结果是对象是单例的，多线程反复的操作i++
         * 业务层和持久层很少会包括会修改的内容，
         * 所以单例对象对于我们来说更好
         * 一般情况下，把int i =1；放在方法内，保持不修改内容
         */

        for (int i=0;i<5;i++){
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
       // IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
  //      as.saveAccount();
    }
}
