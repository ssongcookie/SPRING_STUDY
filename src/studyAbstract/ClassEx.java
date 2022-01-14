package studyAbstract;

public class ClassEx extends AbstractClassEx{

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	public ClassEx(int i, String s) {
		super(i,s); //상위클래스의 객체를 호출
	}
	
	@Override
	public void fun2() {
		System.out.println("--fun2() START--");
	}
}
