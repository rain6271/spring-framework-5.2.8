package org.springframework.zpr.bean.InnerClass;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class InnerClass {

	@Component
	@Configuration
	public static class springSource {

	}

	@Component
	public static class mybatis {

	}

}
