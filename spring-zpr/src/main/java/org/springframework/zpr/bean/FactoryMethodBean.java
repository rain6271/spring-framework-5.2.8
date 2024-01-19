package org.springframework.zpr.bean;

import lombok.Data;

@Data
public class FactoryMethodBean {
	private String pro1;
	private String pro2;

	public FactoryMethodBean() {

	}
	public FactoryMethodBean(String pro1, String pro2) {
		this.pro1 = pro1;
		this.pro2 = pro2;
	}

}
