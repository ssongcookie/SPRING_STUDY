package codingTest.day1;

public class Test9 {
//array 배열 값의 합과 평균을 구하는 프로그램
	public static void main(String[] args) {

		int[] sub = new int[] {75,85,95,100}; //교과목 배열 변수 sub로 설정하고 점수를 부여

		System.out.println("교과목의 수 : "+sub.length); //배열의 크기 즉 교과목의 수를 구하기 위해서 length 를 사용

		
		int sum=0;
		float avg=0; //평균은 실수로 나오게 하기 위해서, double 로 잡아도 됨.

		
		for (int i = 0; i < sub.length; i++) {
			sum+=sub[i];
		}
			avg=sum/(sub.length); //반복을 마무리한 sum 값을 배열의 수로 나누면 평균

			
			System.out.println("총점은 : "+sum);
			System.out.println("평균은 : "+avg);
	}
}