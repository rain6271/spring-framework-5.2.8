package org.springframework.zpr.bean.aop;

import org.springframework.stereotype.Component;

@Component
public class AopServiceImpl2 implements AopService{

	@Override
	public void aop1() {
		System.out.println("AopServiceImpl2 aop1");
	}
}
