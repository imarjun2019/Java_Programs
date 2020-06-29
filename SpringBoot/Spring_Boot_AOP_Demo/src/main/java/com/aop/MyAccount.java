package com.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class MyAccount implements Bofa {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("This is withdraw logic");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("This is Deposit logic");

		
	}
	

}
