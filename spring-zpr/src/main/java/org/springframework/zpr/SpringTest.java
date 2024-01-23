package org.springframework.zpr;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		Resource[] resources = context.getResources("properties.test");
	}

	@Test
	public void testImportAware() throws IOException {
		int i = new AppConfig().hashCode();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Resource[] resources = context.getResources("properties.test");
	}

}
