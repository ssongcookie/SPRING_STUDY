package studyLambda;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
/*		//매개변수와 실행문만으로 작성(접근자, 반환형, return 키워드 생략)
		Lambda j = (String s1, String s2, String s3) -> {System.out.println(s1 + s2 + s3);};
		j.method("song", "guk", "hee");
		
		//매개변수 1개 or 타입이 같을 때 => 타입 생략 가능
		Lambda i = (s4) -> {System.out.println(s4);};
		i.method("hello");

		//실행문이 1개일때 => {} 를 생략 가능
		Lambda i = (s4) -> System.out.println(s4);
		i.method("hello");
		
		//매개변수와 실행문이 1개일때, () 와 {} 를 생략 가능
		Lambda i = s4 -> System.out.println(s4);
		i.method("hello");
		
		//매개변수가 없을 때 => ()만 작성
		Lambda i = () -> System.out.println("hi");
		i.method();
		
		//반환값이 있을 경우
		Lambda i = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(i.method(3, 4));
	
*/
		//1부터 100까지 숫자를 출력하면서
		//3의 배수일 경우"" 5의 배수일 경우"" 7의 배수일 경우"" 를 출력하시오.
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "는 3의 배수입니다.");
			}else if (i % 5 == 0) {
				System.out.println(i + "는 5의 배수입니다.");
			}else if (i % 7 == 0) {
				System.out.println(i + "는 7의 배수입니다.");
			}
			System.out.println(i);
		}
			
		
	}
}
