package org.springframework.zpr.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class PreDestroyBean {

	@PreDestroy
	public void preDestroy() {

	}
}
