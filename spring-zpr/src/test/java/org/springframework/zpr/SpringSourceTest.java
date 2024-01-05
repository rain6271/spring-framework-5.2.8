package org.springframework.zpr;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSourceTest {

	@Test
	public void decoration() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Object propertyService = context.getBean("propertyService");

	}

}
