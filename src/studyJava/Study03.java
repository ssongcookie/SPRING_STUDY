package studyJava;

public class Study03 {
	public static void main(String[] args) {
		// \t 탭
		// \n 줄바꿈
		// \' 작은따옴표
		// \" 큰 따옴표
		// \ \ 역슬래쉬
		System.out.println("good\tmorning\neveryone\'see\'you\"later\"");
		
		// %d 10진수 
		// %o 8진수	
		// %x 16진수
		// %c 문자
		// %s 문자열
		// %f 실수
		System.out.printf("오늘의 날씨는 %d도 입니다." , 8);
		
		char c1 = 'a';
		char c2 = 'A';
		System.out.printf("소문자 \'%c\' 의 대문자는 \'%c' 입니다.", c1 , c2);
		
		//정렬
		System.out.println();
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		//소수점제한
		System.out.printf("%.0f\n",0.1234);
		System.out.printf("%.1f\n",0.1234);
		System.out.printf("%.2f\n",0.1234);
	}
}
