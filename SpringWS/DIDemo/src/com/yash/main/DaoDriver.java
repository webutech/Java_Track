package com.yash.main;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.Dao;

public class DaoDriver {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource/beans.xml");
		Dao dao=(Dao)applicationContext.getBean("dao");
		dao.connect();
		
	}

}
