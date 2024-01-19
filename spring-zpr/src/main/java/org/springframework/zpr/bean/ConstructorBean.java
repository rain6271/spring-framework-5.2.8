package org.springframework.zpr.bean;

import lombok.Data;

@Data
public class ConstructorBean {
	private String pro1;
	private String pro2;

	public ConstructorBean() {

	}
	public ConstructorBean(String pro1, String pro2) {
		this.pro1 = pro1;
		this.pro2 = pro2;
	}

}
