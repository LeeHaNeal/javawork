package _02_abstractPhone;

abstract public class Phone {
	String model;
	String color;
	
	Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	
	void sendVoice(String message) {
		System.out.println(message);
	}
	
	void receveVoice(String message) {
		System.out.println(message);
	}
	
	abstract void hangUp();
	abstract void hangOut();
}