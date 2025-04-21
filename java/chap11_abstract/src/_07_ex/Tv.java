package _07_ex;

public class Tv implements product{

	 private boolean power;
	    private int volume;
	    private int channel;
	
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜집니다.");
		
		
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원이 꺼집니다.");
		
	}

	@Override
	public void volumeUp(int amount) {
		volume += amount;
        System.out.println("볼륨 올리기 : " + volume);
	
	}

	@Override
	public void volumeDown(int amount) {
		volume = Math.max(0, volume -amount);
		System.out.println("볼륨 내리기 : " + volume);
		
	}
	@Override
	public void search(String search) {
		System.out.println(search+"를 유튜브로 검색합니다.");
	}
	
	

	 public void changeChannelUp(int amount) {
	      channel += amount;
	      System.out.println("채널 : " + channel);
   }

	    public void changeChannelDown(int amount) {
	        channel = Math.max(0, channel - amount);
	        System.out.println("채널 : " + channel);
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

