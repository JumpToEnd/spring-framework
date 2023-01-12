package org.springframework.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
		Object userFactoryBean = applicationContext.getBean("userFactoryBean");
		User bean = applicationContext.getBean(User.class);

		System.out.println(bean);
	}
}
