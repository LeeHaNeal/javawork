package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		
		
        Phone phone = new Phone("Galaxy", "Black");
        SmartPhone phone1 = new SmartPhone("iPhone","silver");
        
        
        phone.bell();
        phone.hangUP();

        phone.sendVoice("반갑소");
        phone.receveVoice("나도 반갑소 ");

        
        phone.hangOut();
        System.out.println("-----------------------");
		
        phone1.bell();
        phone1.hangUP();

        phone1.sendVoice("korea number one");
        phone1.receveVoice("I know That");

        phone1.internetsearch(" ");
        phone1.hangOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
