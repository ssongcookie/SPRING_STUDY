package study1008;

import org.springframework.stereotype.Component;

@Component
public class Woman implements Developer{
	
	public void develop() {
		System.out.println("파이썬으로 개발한다.");
	}
}