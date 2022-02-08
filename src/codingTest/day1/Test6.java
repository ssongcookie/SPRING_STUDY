package codingTest.day1;

import java.util.Scanner;

public class Test6 {
//점수를 입력 받아 95점 이상이면 학점이 A+
//90점 이상 95 미만이면  A
//90점 미만이면 이수 하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score=sc.nextInt();
		
		if(score >= 95) {
			System.out.println("당신의 학점은 A+ 입니다.");
		}else if(score<95 && score>=90){
			System.out.println("당신의 학점은 A 입니다.");
		}else{
			System.out.println("당신의 점수는 90점 미만이므로 강의를 이수하였습니다.");
		}
		sc.close();
	}
}
