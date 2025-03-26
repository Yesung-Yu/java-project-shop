package com.itwill.shop.test;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
		System.out.println("1.insert:" + userDao.insert(new User("aaaa", "aaaa", "에이님", "a@gmail.com")));
		System.out.println("2.update:" + userDao.insert(new User("aaaa", "aaaa", "에이님변경", "achange@gmail.com")));
		System.out.println("3.findByPK:" + userDao.findByPrimaryKey("aaaa"));
		System.out.println("4.delete:" + userDao.delete("aaaa"));

	}

}
