package org.springframework.zpr.cycle;

import jdk.nashorn.internal.parser.JSONParser;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Data
public class WangYu2RegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("WangYu2RegistryPostProcessor postProcessBeanFactory");

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("WangYu2RegistryPostProcessor postProcessBeanDefinitionRegistry");
		for (String beanDefinitionName : registry.getBeanDefinitionNames()) {
			System.out.print(beanDefinitionName);
		}

		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(Person.class);
		genericBeanDefinition.getPropertyValues().add("address", "山东青岛");

		registry.registerBeanDefinition("wy",genericBeanDefinition);
		for (String beanDefinitionName : registry.getBeanDefinitionNames()) {
			System.out.print(beanDefinitionName);
		}
		registry.registerAlias("wy", "wy1");

		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
		scanner.scan("com");

	}

	@Override
	public int getOrder() {
		return 0;
	}
}
