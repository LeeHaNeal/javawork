package _05_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap {

    public static void main(String[] args) {
    	
    	
    	// 키 = id , 값 = pw (3개를 hashMap 넣기)
    	 HashMap<String, String> map = new HashMap<>();
    	 map.put("qqq", "111");
    	 map.put("www", "222");
    	 map.put("eee", "333");
    	// 사용자로부터 id와 pw를 받아서
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("아이디를 입력하세요 : ");
    	 
    	 String id = scan.nextLine();
    	
    	 
    	// id가 map 에 있나 확인, 없으면 "존재하지않는 아이디입니다." 출력
    	 
    	 if (map.containsKey(id)) { // 
             System.out.print("비밀번호를 입력하세요: ");
             String pw = scan.nextLine();

             // 비밀번호 확인
             if (map.get(id).equals(pw)) {
                 System.out.println("로그인 성공!");
             }else {
            	 System.out.println("비밀번호가 틀렸습니다");
           	} 
             }else {
                 System.out.println("존재하지않는 아이디입니다. ");
    	 }
    	// id가 있으면 pw를 보고
    	// pw 일치하면 로그인 되었습니다.
    	// pw 일치하지 않으면 비밀번호가 일치하지 않습니다.
        
    	 
        
    	  
    	  

    	  
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
