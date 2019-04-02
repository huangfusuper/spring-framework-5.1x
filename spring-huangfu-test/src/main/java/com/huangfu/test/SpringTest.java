package com.huangfu.test;

import com.huangfu.conf.AppConf;
import com.huangfu.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 皇甫
 */
public class SpringTest {
	public static void main(String[] args) {
		//把Spring所有环境准备好
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConf.class);
		UserDao userDao = annotationConfigApplicationContext.getBean(UserDao.class);
		System.out.println(userDao.findOneUser());
	}
}
