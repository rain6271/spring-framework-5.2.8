package org.springframework.zpr;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 15:41
 */
public class SpringTest {

	@Test
	public void testBeanDefinitionRegistry() throws IOException {
		int i = new AppConfig().hashCode();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.getBean("person");
		Resource[] resources = context.getResources("properties.test");
	}


}
