package _05_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		
		
		HashMap<String , Snack> map = new HashMap<>();
		
		
		map.put("새우깡", new Snack("새우맛" , 500));
		map.put("썬칩", new Snack("태양맛" , 200));
		map.put("홈런볼", new Snack("초코맛" , 300));
		map.put("눈을감자", new Snack("감자맛" , 400));
		map.put("아우터", new Snack("넘사벽" , 400));
		System.out.println(map);
		
		map.put("빼빼로", new Snack("단맛",  800));
		
		System.out.println(map);
		
		Snack snack = map.get("새우깡");
		System.out.println(snack);
		
		// replace(key, value)
		map.replace("포테이토칩", new Snack("감칠맛",400));
		System.out.println(map);
		
		// 객체를 하나씩 출력
		// entrySet()
		System.out.println("--------------------");
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		Iterator<Entry<String,Snack>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String,Snack> entry = iter.next();
			
			String key = entry.getKey();
			Snack s= entry.getValue();
			
			System.out.println(key+"의 정보 : " + s );
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
