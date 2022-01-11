package studyJava;

import java.util.Scanner;

public class Study05 {

	public static void main(String[] args) {

		System.out.println("점수 : ");
		
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score) {
		case 90:
			System.out.println("score = 90");
			break;
		case 80:
			System.out.println("score = 80");
			break;
		case 70:
			System.out.println("score = 70");
			break;
		case 60:
			System.out.println("score = 60");
			break;

		default:
			System.out.println("score?");
			break;
		}
	}

}
