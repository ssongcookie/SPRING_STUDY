package studyJava;

public class ChildClass extends ParentClass{ //상속

	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	public void childFun() {
		System.out.println("-- childFun() START --");
	}
	
	@Override //상위클래스의 메서드를 재정의 한 것
	public void makeBread() {
		System.out.println("-- makeBread() upgrade --");
	}
}
