package _08_interfacePolymorphism;

public class Game implements product {
	
	 private boolean power;
	 private int volume;
	 private String currentGame;
	
	
	 public Game() {
	        this.currentGame = "기본 게임";
	    }
	 
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
	        System.out.println("볼륨 : " + volume);
		
		}

		@Override
		public void volumeDown(int amount) {
			volume = Math.max(0, volume -amount);
			System.out.println("볼륨 : " + volume);
			
		}
		

		public void switchGame(String newGame) {
	        currentGame = newGame;
	        System.out.println(currentGame + " 으로 변환합니다.");
	    }

		
	
		
	
	
}
