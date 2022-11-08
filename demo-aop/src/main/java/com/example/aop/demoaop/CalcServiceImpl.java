package com.example.aop.demoaop;

import org.springframework.stereotype.Component;

@Component
public class CalcServiceImpl implements CalcService {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
