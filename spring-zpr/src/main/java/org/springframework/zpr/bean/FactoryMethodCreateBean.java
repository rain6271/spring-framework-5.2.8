package org.springframework.zpr.bean;

import lombok.Data;

@Data
public class FactoryMethodCreateBean {

	public FactoryMethodBean getFactoryMethodBean() {
		return new FactoryMethodBean("1", "2");
	}

}
