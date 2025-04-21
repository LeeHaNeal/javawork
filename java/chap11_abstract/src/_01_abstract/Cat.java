package _01_abstract;

// 추상 클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야 한다.
// 추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야됨




public class Cat extends Pet {
    
	
	    public Cat() {
	        this("고양이", "검정", "귀여움"); 
	    }

	   
	    public Cat(String kind, String color, String feature) {
	        super(kind, color, feature); 
	    }

	   
		/* @Override
		 void sound() {  }
		 }*/
	    
	    void sound() { 
	    	System.out.println("애옹");
	    }
	}