package _03_ex;

public class Phone {
	String model;
	String color;
	boolean bell;
	boolean hang;
	String message;
	
	Phone(String model , String color){
		this.model = model;
		this.color = color;

		this.hang = false;
		this.message = " ";
	}
	

	
	void bell() {
			System.out.println("알람울립니다.");
	}  	
	
	void hangUP() {
		System.out.println("전화를 받습니다.");
	}
	
	void sendVoice(String msg) {
        if (msg != null && !msg.isEmpty()) {
            message = msg;
            System.out.println("전화 내용 : " + message);
        } else {
            System.out.println("문자보내기 실패: 메시지가 비어 있습니다.");
        }
    }
	
	void receveVoice(String msg) {
		if(msg != null && !msg.isEmpty()) {
			message = msg;
			System.out.println("전화 내용 : " +msg);
		} else {
			System.out.println("문자 받기 실패하셨습니다.");
		}
	}
	
	void hangOut() {
		System.out.println("전화를 끕니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
