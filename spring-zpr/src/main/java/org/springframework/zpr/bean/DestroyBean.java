package org.springframework.zpr.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class DestroyBean implements DisposableBean {


	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
}
