package _05_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T01_HashMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        
        // 객체 넣기 : put(key, value)
        map.put("홍길동", 87);
        map.put("동장군", 98);
        map.put("김김김", 85);
        map.put("이이이", 95);
        System.out.println("총 Entry 수 : " + map.size());
        
        // 객체 얻어오기 : get(key)
        System.out.println(map.get("김김김"));
        System.out.println(map);
        System.out.println();
        
        // 객체 삭제 : remove(key)
        map.remove("이이이");
        System.out.println("이이이 삭제 후 : " + map);

        // 동일한 키로 값 넣기(기존의 값 변경)
        map.put("홍길동", 100);
        System.out.println(map);
        map.put("김김김", 25);
        System.out.println(map);

        // 객체 하나씩 출력 하려면
        Set<String> keySet = map.keySet(); // 키만 가져오기
        Iterator<String> keyInter = keySet.iterator();
        while (keyInter.hasNext()) {
            String key = keyInter.next(); // 
            int value = map.get(key); // 
            System.out.println(key + " : " + value);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
