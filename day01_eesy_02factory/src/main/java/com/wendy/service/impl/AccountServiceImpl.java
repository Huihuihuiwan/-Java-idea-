package com.wendy.service.impl;

import com.wendy.dao.IAccountDao;
import com.wendy.dao.impl.AccountDaoImpl;
import com.wendy.factory.BeanFactory;
import com.wendy.service.IAccountService;

/**
 * Project Name: day01_eesy_01jdbc
 * Package Name: com.wendy.service.impl
 *
 * @author wendy_wan
 * @date 2020/2/25 15:37
 */

/**
 * 账户的业务层实现类
 * 业务层和持久层很少会包括会修改的内容，所以单例对象对于我们来说更好
 * 依赖：service依赖了一个具体的Dao实现类
 */
public class AccountServiceImpl implements IAccountService {

    /**
     * 自己完全可以掌握使用哪一种方式来找到自己想要的Dao，new这种方法找到Dao的方式的权力让给了beanfactory类，
     * 由beanfactory通过一个固定的名称，来找到我们想要的bean对象，但这个bean对象是不是我们能用的，就无法控制了，
     * 这个类AccountServiceImpl无法自主的控制
     *
     * 而通过new这样方法，这个类是有独立的自主权的，想要谁就要谁，这种控制权的转移就叫做控制反转
     *
     * 业务层调用持久层
     * 依赖：service依赖了一个具体的Dao实现类
     * private IAccountDao accountDao = new AccountDaoImpl();
     */
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

   private int i = 1;//此时i是一个类的成员

    public void saveAccount() {
     //   int i = 1; //放在方法中可以保证每次都被初始化，即单例
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
