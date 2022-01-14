package studyAbstract;

public abstract class AbstractClassEx {

	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) { //매개변수를 갖고 있는 생성자
		System.out.println("AbstractClassEx constructor");
		
		//ClassEx의 super(i,s); 가 여기로 호출됨
		
		//this 키워드를 사용하여 member변수를 초기화 시켜줌
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {
		System.out.println("--fun() START--");
	}
	
	public abstract void fun2(); 
	//추상메소드 : 선언부만 있고 정의되어 있지 않음
	//상속을 받은 클래스에서 구현됨
	
}
