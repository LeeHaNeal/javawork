package _01_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
	List 계역
		- 특징 : 순서가있다
				중복저장 가능
	1. ArrayList
	- 제네릭
	 ArrayList<> => 모든 자료형을 받을 수 있도록 만듬
	 				사용할 때 자료형을 넣어주면 됨
	초기배열 10개 : 10개를 초과화여 넣으면 배수만큼 더 만들어줌
	배열 지정할 수 있음 : new ArrayList<>(배열의 갯수)
	부모 자료형으로 형변환하여 많이 사용함
		List<자료형>변수명 = new Arralist<>();
	2. vector : ArrayList와 동일하게 사용 (멀티스레드에서 사용)
	3. LinkedList	



*/


public class T01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//ArrayList list = new ArrayList<>();
		
		
		list.add("java");
		list.add("oracle");
		list.add("html");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		
		list.add(2,"css");
		
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		
		/*for(String str : list) {
			System.out.println(str);
		}*/
		
		
		// 삭제 : remove(index) , remove(객체) , clear()
		
		
		System.out.println("삭제한 객체 :  " + list.remove(null));
	
		list.remove("oracle");	
		System.out.println("orecle 삭제 후");
		for(String str :list) {
			System.out.println(str);
		}
		
		list.clear();
		System.out.println(list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
