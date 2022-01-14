package studyJava.java;

import studyJava.interfaCe.ChildClass;

public class Study01 {

	public static void main(String[] args) {
		
		int i = 100;
		
		System.out.println("i = " + i);

		ChildClass child = new ChildClass();
		child.parentFun();
		child.childFun();
		child.makeBread();
	}

	
}
