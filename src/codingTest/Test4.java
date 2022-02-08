package codingTest;

import java.util.Scanner;

public class Test4 {
//입력받은 두 수 사이의 전체 합
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("숫자를 입력하세요 : ");
	int num1=sc.nextInt();
	System.out.print("숫자를 입력하세요 : ");
	int num2=sc.nextInt();
	
	int sum=0;

	
	while(num1 <= num2) {
		num1++;
		sum+=num1;
	}
	
	System.out.println("두 수 사이 값들의 합은 : "+sum);
	sc.close();
	
	}
}
