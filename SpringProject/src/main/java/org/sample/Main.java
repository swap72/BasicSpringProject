package org.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory f1=new ClassPathXmlApplicationContext("config.xml");
		Student s=f1.getBean("Student",Student.class);
		System.out.println(s);
	}
}
