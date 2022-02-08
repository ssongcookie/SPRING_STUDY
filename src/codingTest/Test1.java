package codingTest;

import java.util.Scanner;

public class Test1 {
//1부터 10까지 짝수의 합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, sum=0;
		
		while (n<=10) {
			n++;
			
			if (n%2==0) {
				System.out.println(n+",");
				
				sum+=n;
			}
		}
		System.out.println();
		System.out.println("1부터 10까지 짝수의 합은 : "+sum);

	}

}
