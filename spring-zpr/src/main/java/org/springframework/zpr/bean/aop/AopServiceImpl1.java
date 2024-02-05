package org.springframework.zpr.bean.aop;

import org.springframework.stereotype.Component;

@Component
public class AopServiceImpl1 implements AopService{

	@Override
	public void aop1() {
		System.out.println("AopServiceImpl1 aop1");
	}
}
