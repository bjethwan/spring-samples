package com.bjethwan.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(void com.bjethwan..*.set*(*))")
	public void traceGameTeamSetter(JoinPoint jp){
		System.out.printf("== %s invoked\n", jp.getSignature().getName());	
	}

}
