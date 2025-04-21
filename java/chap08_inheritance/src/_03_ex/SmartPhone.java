package _03_ex;


public class SmartPhone extends Phone{
	// 오류는 알아서 해결
	String search;
	
	SmartPhone(String model, String color) {
		super(model, color);
		
	}

	
	void internetsearch(String search) {
		if(search != null && !search.isEmpty()) {
			this.search = search;
			System.out.println("인터넷 서칭 중 " + search);
		} else {
			System.out.println("인터넷에 연결해주세요");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
