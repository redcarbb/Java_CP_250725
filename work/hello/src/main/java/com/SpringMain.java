package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javaclass.Toyota;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

		for (String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}

		Toyota toyota = (Toyota) ctx.getBean("toyota1");
		toyota.move();
		System.out.println(toyota);

	}

}
