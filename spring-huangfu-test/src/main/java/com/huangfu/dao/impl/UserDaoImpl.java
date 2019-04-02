package com.huangfu.dao.impl;

import com.huangfu.dao.UserDao;
import com.huangfu.entrty.User;
import org.springframework.stereotype.Repository;

/**
 * @author 皇甫
 */
@Repository
public class UserDaoImpl implements UserDao {
	@Override
	public User findOneUser() {
		return new User(1L, "敲山", 58, "北京");
	}
}
