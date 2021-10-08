package study1008;

import org.springframework.stereotype.Component;

@Component
public class Child implements Developer{

	public void develop() {
		
		System.out.println("어린이는 개발을 하지 않습니다.");
		
	}
}
