package studyJava;

public class InterfaceClass implements InterfaceA, InterfaceB{ //다형성

	public InterfaceClass() {
		System.out.println("InterfaceClass()");
	}
	
	@Override
	public void funA() {
		System.out.println("funA()");
	}
	
	@Override
	public void funB() {
		System.out.println("funB()");
	}

}
