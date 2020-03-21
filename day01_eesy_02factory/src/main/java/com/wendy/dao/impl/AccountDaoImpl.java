package com.wendy.dao.impl;

import com.wendy.dao.IAccountDao;

/**
 * Project Name: day01_eesy_01jdbc
 * Package Name: com.wendy.dao.impl
 *
 * @author wendy_wan
 * @date 2020/2/25 15:47
 */

/*
* 账户的持久层实现类
* */
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount(){
        System.out.println("保存了账户");
    }
}
