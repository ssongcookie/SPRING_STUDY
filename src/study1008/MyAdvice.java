package study1008;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice{
	
	@Before(value = "execution(* *(..))")
	public void before() {
		System.out.println("출근 카드를 찍는다.");
	}
			
	@AfterReturning("execution(* *(..))")
	public void afterReturning() {
		System.out.println("집에 간다.");
	}		
	
	@After("execution(* *(..))")
	public void after() {
		System.out.println("집에 도착한다.");
	}
	
	@AfterThrowing("execution(* *(..))")
	public void afterThrowing() {
		System.out.println("쉬는 날이었다.");
	}
}
