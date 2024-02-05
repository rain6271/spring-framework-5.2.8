package org.springframework.zpr.bean.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAnnotation {

	@Pointcut("execution(* org.springframework.zpr.bean.aop..*(..))")
	public void pc1() {

	}

	@Around("pc1()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around before");
		Object proceed = joinPoint.proceed();
		System.out.println("around after");
		return proceed;
	}
}
