package _04_tv;

public class Tv {
		
	String company = "LG";
	String model = "울트라  FULL HD";
	int inch = 65;
	int volume; // 기본값 : 0
	int channel; 
	boolean power; // 기본값 : false
	
	void power() {
		power = !power;
		if(power)
			System.out.println("TV를 켭니다.");
		else 
			System.out.println("TV를 끕니다.");
	}
	
	int channelUp() {
		return ++channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
