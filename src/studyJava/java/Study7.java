package studyJava.java;

public class Study7 {

	public static void main(String[] args) {
	
		//StringBuffer(데이터 안정성), StringBuilder(속도)
		//String의 단점을 보완하기 위해 만들어짐
		//	ㄴ String은 데이터가 변하면 메모리상의 변화가 많아 속도가 느림
		StringBuffer sf = new StringBuffer("JAVA");
		sf.append("_8");
		System.out.println(sf);
		
		System.out.println(sf.length());
		
		sf.insert(sf.length(), "----");
		System.out.println(sf);
		
		sf.delete(4, 10);
		System.out.println(sf);
	}
}
