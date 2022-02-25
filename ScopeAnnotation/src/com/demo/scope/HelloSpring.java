package com.demo.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Laptop lp1=context.getBean("asus",Laptop.class);
		
		Laptop lp2=context.getBean("asus",Laptop.class);
		
		System.out.println(lp1);
		System.out.println(lp2);
		System.out.println(lp1.brandName());
		
		
	}

}
