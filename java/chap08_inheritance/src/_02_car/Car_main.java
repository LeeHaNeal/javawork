package _02_car;

public class Car_main {

	public static void main(String[] args) {
		
		Ambulance am1 = new Ambulance("amcar","기아" );
		
		am1.power();
		System.out.println("현재속도 : " + am1.speedUP());
		System.out.println("현재속도 : " + am1.speedUP());
		am1.siren();
		am1.firstAid();
		am1.siren();
		am1.power();
		
		
		
	}

}
