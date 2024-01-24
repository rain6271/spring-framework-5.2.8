package org.springframework.zpr.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class InitBean{

	public void initMethod() {
		System.out.println("InitBean initMethod");
	}

	public void destroyMethod() {
		System.out.println("InitBean destroyMethod");
	}

	public InitBean factoryMethod() {
		return new InitBean();
	}
}

