package com.demo.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Asus implements Laptop {

	@PostConstruct
	public void getInit() {
		
		System.out.println("init");
		
	}
	
	@Override
	public String brandName() {
		
		
		return "Asus here";
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("destroy");
		
	}

}
