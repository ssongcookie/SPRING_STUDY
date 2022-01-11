package studyJava;

public class Study04 {

	public static void main(String[] args) {
		//배열이란
		//인덱스를 이용해서 자료형이 같은 데이터를 관리하는 것입니다.

		int [] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		System.out.println("arr1[0] = " + arr1[0]);
		
		int[] arr2 = {10, 20, 30};
		System.out.println("arr2[0] = " + arr2[0]);
		
		//배열의 길이 출력
		//arrAtt1.length
		
		//요소출력
		//Arrays.toString(arrAtt1)
	}

}
