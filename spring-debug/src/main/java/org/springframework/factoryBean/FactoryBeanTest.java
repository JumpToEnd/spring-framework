package org.springframework.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

	public static void main(String[] args) throws Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
		UserFactoryBean userFactoryBean = (UserFactoryBean) applicationContext.getBean("userFactoryBean");
//		User bean = applicationContext.getBean(User.class);

		User bean = userFactoryBean.getObject();

		System.out.println(bean);
	}
}
