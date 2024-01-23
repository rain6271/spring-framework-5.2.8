package org.springframework.zpr.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PostConstructBean {

	@Autowired
	private AwareBean awareBean;

	@PostConstruct
	public void init() {
		System.out.println("PostConstructBean.init()");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("PostConstructBean.preDestroy()");
	}


}
