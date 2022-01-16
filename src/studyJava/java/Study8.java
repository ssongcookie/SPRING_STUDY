package studyJava.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Study8 {

	public static void main(String[] args) {
		
		//List
		// : Vector, ArrayList, LinkedList
		//인터페이스로 이를 구현한 클래스는 인덱스를 이용해서 데이터를 관리한다.		
		//특징: 인덱스 이용 , 데이터 중복 가능
		
		//객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("Hello");
		list.add("Java");
		list.add("world");
		System.out.println(list);
		
		//해당 인덱스 뒤에 데이터 추가
		list.add(2, "programing");
		System.out.println(list);
		
		//해당 인덱스 변경
		list.set(1, "C");
		System.out.println(list);
		
		//데이터 추출
		String str = list.get(2);
		System.out.println(str);
		
		//제거
		str = list.remove(2);
		System.out.println(list);
		
		//전체 제거
		list.clear();
		System.out.println(list);
		
		//데이터 유무
		boolean b = list.isEmpty();
		System.out.println(b);
		
		//Map
		//인터페이스로 이를 구현한 클래스는 KEY 를 이용해서 데이터를 관리한다.
		//특징: key 이용, key 중복 불가능, 데이터 중복 가능
		
		HashMap<Integer, String> map = new HashMap<Integer, String>(); //<키 값, 실제 사용할 데이터타입>
		
		//데이터 추가
		map.put(5, "hello");
		map.put(6, "java");
		map.put(7, "world");
		System.out.println(map);
		System.out.println(map.size());
		
		
		map.put(0, "!!");
		System.out.println(map);
		
		//데이터 교체
		map.put(6, "c");
		System.out.println(map);
		
		//데이터 추출
		str = map.get(5);
		System.out.println(str);
		
		//데이터 제거
		map.remove(5);
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		boolean m = map.isEmpty();
		System.out.println(m);
	
	}
}
