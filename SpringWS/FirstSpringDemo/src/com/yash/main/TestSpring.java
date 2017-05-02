package com.yash.main;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.Hello;

public class TestSpring {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resource/beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		//System.out.println("--------->"+beanFactory);
		Hello hello=(Hello)beanFactory.getBean("hello");
		Hello hello2=(Hello)beanFactory.getBean("hello");
		//hello.sayHello();
	}

}
