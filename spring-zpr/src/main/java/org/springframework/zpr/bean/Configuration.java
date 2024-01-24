package org.springframework.zpr.bean;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public InitBean initBean() {
		return new InitBean();
	}
}
