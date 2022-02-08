package codingTest.day1;

import java.util.Scanner;

public class Test5 {
//자신의 점수를 입력하여  합격 불합격을 판정하는 프로그램
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("점수를 입력하세요 : ");
	int score=sc.nextInt();
	
	if (score < 80) {
		System.out.println("당신의 점수는 80점 미만이므로 불합격입니다.");
	} else {
		System.out.println("합격입니다.");
	}
	}
}
