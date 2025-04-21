package _08_interfacePolymorphism;



public interface product {
	
	
	void powerOn();
    void powerOff();
    void volumeUp(int amount);
    void volumeDown(int amount);
    
    
    static void aispeak(String str) {
    	System.out.println(str);
    }
    
    default void search(String search) {
    	System.out.println(search);
    }
    
    
    
    
    
    
    
	
}
