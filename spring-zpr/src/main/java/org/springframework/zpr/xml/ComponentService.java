package org.springframework.zpr.xml;

import org.springframework.stereotype.Component;

@Component
public class ComponentService {

	public ComponentService() {

	}

	public ComponentService(String property1, String property2, String property3) {
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
	}

	// 属性1
	private String property1;
	// 属性2
	private String property2;
	// 属性3
	private String property3;
	// 属性4
	private String property4;
	// 属性5
	private String property5;


	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	public String getProperty3() {
		return property3;
	}

	public void setProperty3(String property3) {
		this.property3 = property3;
	}

	public String getProperty4() {
		return property4;
	}

	public void setProperty4(String property4) {
		this.property4 = property4;
	}

	public String getProperty5() {
		return property5;
	}

	public void setProperty5(String property5) {
		this.property5 = property5;
	}
}
