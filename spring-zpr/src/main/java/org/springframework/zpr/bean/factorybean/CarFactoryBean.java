package org.springframework.zpr.bean.factorybean;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CarFactoryBean  implements FactoryBean<Car> {
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setColor("Red");
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
