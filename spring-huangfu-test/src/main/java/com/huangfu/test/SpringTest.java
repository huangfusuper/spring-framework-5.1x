package com.huangfu.test;

import com.huangfu.conf.AppConf;
import com.huangfu.dao.UserDao;
import com.huangfu.entrty.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 皇甫
 */
public class SpringTest {
	public static void main(String[] args) {
		//把Spring所有环境准备好
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConf.class);
		annotationConfigApplicationContext.refresh();

		/**
		 * annotationConfigApplicationContext中的beanFactory中的 beanDm中一定会有传入的对象
		 * 和ConfigurationClassPostProcessoractory
		 */
//		annotationConfigApplicationContext.refresh();
//		UserDao userDao = annotationConfigApplicationContext.getBean(UserDao.class);
//		System.out.println(userDao.findOneUser());
		UserDao bean = annotationConfigApplicationContext.getBean(UserDao.class);
	}
}
