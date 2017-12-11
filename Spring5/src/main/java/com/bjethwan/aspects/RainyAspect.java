package com.bjethwan.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RainyAspect {
	@Around("execution(String playGame())")
	public Object didRain(ProceedingJoinPoint jp) throws Throwable{
		Object ret = null;
		boolean didRain = Math.random()<0.5;
		if(didRain)
			System.out.println("No Game - It Rained!!!");
		else
			ret = jp.proceed();

		return ret;
	}
}
