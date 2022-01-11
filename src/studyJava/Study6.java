package studyJava;

import java.util.Scanner;

public class Study6 {

	public static void main(String[] args) {
		
		//구구단
		System.out.print("num : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
			
		}
		sc.close();
	}
	
public class Study99 {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("num : ");
			int num1 = sc.nextInt();
			int i = 1;
			while(i < 10) {
				System.out.printf("%d * %d = %d\n", num1, i, (num1*i));
				i++;
				
		
	

			}
		}
	}

public class gugudan {

	public static void main(String[] args) {
	
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
	


			
		}
	}

public class gugudan1 {

	public static void main(String[] args) {
	
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"x"+j + "=" + i*j);
			}
		}
	


			
		}
	}
}
