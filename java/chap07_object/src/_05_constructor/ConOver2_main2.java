package _05_constructor;



class ConOver2{
	int num; // 인스턴스(전역) 변수
	double dou;
	String name;
	// 다른 생성자 호출
	ConOver2 (){
		this(1,1.0,"홍길동"); // 무조건 첫번째줄에 넣어야함
		System.out.println("매개변수가 없는 생성자");

	}
	
	ConOver2 (int num){
		this(num,1.0,"홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	
	/*	ConOver2(int num){ // 지역변수 
			this.num = num; //this : 나 자신의 객체  
			dou = 1.0;
			name = "홍길동";
		}*/
	// 생성자에서 다른 생성자를 호출할 수 있다
	ConOver2(int num, double dou){
		// 다른 생성자를 호출할 때 는 첫번째에 넣어야 함
		this(num,dou,"홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	ConOver2(int num, double dou , String name){
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	
	// 가변인자 : 들어올 인자(매개변수에 넣어줄 값)의 갯수를 모를 때   
	// 형식 : (int... num) : 인자가 0개 이상
	// * 반드시 들어와야할 인자가 있다면 먼저 선언하고 가변인자는 맨 마지막에 넣는다.
	
	void method(int...num) {
		System.out.println("인자가 0개 이상");
		for(int result : num) {
			System.out.println(result);
		}
		
	}
	
	
	
	void method2(int num, int...num2) {
		System.out.println("인자가 1개 이상");
		
		
		
	}
	
	
	
				// 홍길동,이순신,강감찬
	void method3(String str, String... name) {
	    for (String name1 : name) {
	        System.out.print(name1 + str + " ");
	    }
	}
	
	
				
	
}


public class ConOver2_main2 {

	public static void main(String[] args) {
		
		ConOver2 con = new ConOver2(5);
		System.out.println(con.num);
		System.out.println(con.dou);
		System.out.println(con.name);
		con.method();
		con.method(2);
		con.method(3,6,7,8,9);
		
		con.method2(4);
		con.method2(4,6,7,8,9);
		con.method3("/", "홍길동 ","강감찬 ","이순신 ");
		
	}

}






