package com.itheima.dao.impl;

import com.itheima.dao.ICustomerDao;

/**
 * 模拟客户的持久层实现类
 * @author zhy
 *
 */
public class CustomerDaoImpl implements ICustomerDao {

	@Override
	public void saveCustomer() {
		System.out.println("持久层保存了客户");
	}

}
