package org.springframework.zpr.factory;

import org.springframework.zpr.cycle.Person;

public class FactoryMethodBean {

	public Person getBean() {
		return new Person();
	}
}
