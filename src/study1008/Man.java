package study1008;

import org.springframework.stereotype.Component;

@Component
public class Man implements Developer{
	
	public void develop() {
		System.out.println("자바로 개발한다.");
	}
	
	public String play() {
		return "로스트아크";
	}
}
