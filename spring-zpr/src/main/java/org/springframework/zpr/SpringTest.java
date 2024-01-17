package org.springframework.zpr;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 15:41
 */
public class SpringTest {

	@Test
	public void testBeanDefinitionRegistry() {
		int i = new AppConfig().hashCode();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.getBean("person");

	}


}
