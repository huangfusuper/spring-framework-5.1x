package com.huangfu.dao.impl;

import com.huangfu.dao.UserDao;
import com.huangfu.entrty.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @author 皇甫
 */
@Repository("UserDaoImpl")
public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("----------------构造方法------------------");
	}

	@PostConstruct
	 public void init(){
		 System.out.println("-----------------初始化-----------------");
	 }
	@Override
	public User findOneUser() {
		return new User(1L, "敲山", 58, "北京");
	}
}
