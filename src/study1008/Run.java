package study1008;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("study1008/applicationContext.xml");
		
		Developer man = context.getBean("man",Developer.class);
		Developer woman = context.getBean("woman",Developer.class);
		Developer child = context.getBean("child",Developer.class);
		
		System.out.println(man.getClass());
		System.out.println(woman.getClass());
		System.out.println(child.getClass());
		System.out.println();
		System.out.println("===========================");
		
		man.develop();
		System.out.println("===========================");
		woman.develop();
		System.out.println("===========================");
		child.develop();
		
	}
}
