package _07_ex;

public class product_main {

	public static void main(String[] args) {
			
		Tv tv = new Tv();
		Game game = new Game();
		
		tv.powerOn();
		tv.volumeUp(5);
		tv.volumeDown(2);
		tv.powerOff();
		tv.changeChannelUp(3);
		tv.changeChannelDown(1);
		
		tv.search("김치우동");
		
	System.out.println("----------------------");
		
		game.powerOn();
		game.volumeUp(5);
		game.switchGame("슈팅게임");
		game.switchGame("FPS");
	
		game.powerOff();
		game.volumeDown(3);
		
		product.aispeak("오늘 날씨 어때?");
		
		
		
		
		

	}

}
