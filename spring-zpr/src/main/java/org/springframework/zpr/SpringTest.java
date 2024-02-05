package org.springframework.zpr;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.zpr.bean.aop.AopService;
import org.springframework.zpr.bean.aop.AopServiceImpl1;
import org.springframework.zpr.bean.factorybean.Car;

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
		context.getBeanFactory().destroySingletons();
		Resource[] resources = context.getResources("properties.test");
	}
	@Test
	public void testProperty() throws IOException {
		int i = new AppConfig().hashCode();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Object valueBean = context.getBean("valueBean");
		Resource[] resources = context.getResources("properties.test");
	}

	@Test
	public void testFactoryBean() throws IOException {
		int i = new AppConfig().hashCode();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = (Car)context.getBean("carFactoryBean");
		Car car1 = (Car)context.getBean("carFactoryBean");
		System.out.println(car);
		System.out.println(car1);
	}

	@Test
	public void test1() throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Object customScopeBean = context.getBean("customScopeBean");
		System.out.println(customScopeBean);

	}

	@Test
	public void testAop() throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AopService aopService = (AopService) context.getBean("aopServiceImpl1");
		aopService.aop1();

	}
}
