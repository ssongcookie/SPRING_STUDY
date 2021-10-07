package study1007;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =
				new ClassPathXmlApplicationContext("study1007/applicationContext.xml");
		
		System.out.println(context.getBean("car"));
	}

}
